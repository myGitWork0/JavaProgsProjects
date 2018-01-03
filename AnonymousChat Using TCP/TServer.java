import java.io.*;
import java.net.*;
import java.lang.*;
public class TServer {						
  public static void main(String args[]) {
    int i=0,p = 0;
    Socket clientSocket=null;
    multipleWin[] arra = new multipleWin[15];
    p=Integer.parseInt(args[0]);		//takes portnum from user
    while(p == 0) {				//checks whether portnum is initialised
      System.out.println("Please enter port number to run server");
      p=Integer.parseInt(args[0]);  		//checks till portnum is initialised
    } 
    try {
      ServerSocket serverSocket = new ServerSocket(p);//opens socket to make client to get connected
      System.out.println("Server started on "+p);	
        while (true) {				//infiniteloop to accept connection 
      try {
       clientSocket = serverSocket.accept();	//accepts the socket
        
        for ( i = 0; i < 15; i++) {		//runs till 15 clients
          if (arra[i] == null) {		//if any client is empty creates new 
            arra[i] = new multipleWin(clientSocket, arra); 
		arra[i].start();					//creation of new client thread  
            break;				//comes out of loop.
          }
        }        
        if (i >= 15) {				//if it exceeds more than 15 
          PrintStream ps = new PrintStream(clientSocket.getOutputStream());//prints to the client window
          ps.println("Cannot accept any more connections.");
        clientSocket.close();
	ps.close();
	}
	
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class multipleWin extends Thread { 			//creates way for multiple clients accessing service at a time

  private String mainNam = null;
  private DataInputStream dis = null;
  private PrintStream print = null;
  private Socket clientSocket = null;
  private final multipleWin[] arra;
  private int num;
  public multipleWin(Socket clientSocket, multipleWin[] arra) { //constructor to initialise the clientsocket
    this.clientSocket = clientSocket;
    this.arra = arra;
    num = arra.length;
  }

  @SuppressWarnings("deprecation")
public void run() { 					//run method 
    int num = this.num;					//gives the number of instances using this service
    String gender;					
    multipleWin[] arra = this.arra;			
    String[] m={"venky","rajnikanth","ram","pavan","dinesh"};
    String[] f={"dally","tamanna","lisa","pavani","sana"};
    try {
      dis = new DataInputStream(clientSocket.getInputStream());//gets data from the input stream
      print = new PrintStream(clientSocket.getOutputStream());//sends data to output stream
      String name;
        print.println("Enter your Gender (type M or F).");
        gender=dis.readLine();
	if(gender.equalsIgnoreCase("M")){
		name = m[(int)(Math.random()*4)];
	}
	else {
		name = f[(int)(Math.random()*4)];
	}
      print.println("You are going to chat with this name : "+name+", if you want to exit from group type quit and hit enter.");
	String members="";
      synchronized (this) {					//for senquential pass of message between everyclient
		for (int i = 0; i < num; i++) {
			if (arra[i] != null && arra[i] != this) {//checks for other non empty threads(initialised)
				members=members+"\n"+arra[i].mainNam;	
			}
		}
	}
	if(members==""){
		print.println("There are no one in this group :");
	}
	else{
       		print.println("Members in the group are :"+members);
	}
      synchronized (this) {
       
        for (int i = 0; i < num; i++) {
	   if (arra[i] != null && arra[i] == this) {	//checks for non empty clients
            mainNam = name;				//initialises the name.
            break;
          }
          if (arra[i] != this && arra[i] != null) {		//checks for nonempty other clients  
            arra[i].print.println("A new Client " + name + " has joined!"); //prints to others
          }
        }
      }
	
	try{
      while (true) {		
        
	String msg ="";
	while((msg=dis.readLine()).equals("\n")){}
        if (msg.equals("exit")) { 	//if the exit string recieves then that particular client comes out of loop.
          break;
        }
          if(msg.equals("")||msg.equals("	")||msg.equals("\n")){continue;}	//no broadcasting when there is empty message
          synchronized (this) { // The message is public, broadcast it to all other clients. 
            printAndRemove(msg,0);//call to printmsg
          }
        
      }
	}
	catch(Exception e){
		System.out.println("Client closed abnormally without using quit");//if client enters ctrl+c
	}
      print.println("TerminateClient "+ name);//send terminate signal
      synchronized (this) { 
        printAndRemove("",1);//call to method to remove 
      }
      
      dis.close(); 
      print.close();
      clientSocket.close();
    } catch (IOException e) {
	e.printStackTrace();
    }
  }

   void printAndRemove(String str ,int j){//prints to other clients
	if(j==0){		
	for (int i = 0; i < num; i++) {	//iterates between every individual client
              if (arra[i] != null ) {	//if it is not null then print to that client
                arra[i].print.println( arra[i].mainNam +" "+":"+" " + str);
              }
        }
	}
	if(j==1){
		for (int i = 0; i < num; i++) {
         		 if (arra[i] == this) {//if it is that client make that client to null so it can be used by other.
            			arra[i] = null;
          		}	
        	}
	}
  }
}