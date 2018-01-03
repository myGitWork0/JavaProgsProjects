import java.io.*;
import java.net.*;
public class TClient implements Runnable {
  protected static DataInputStream dis = null;
  protected static boolean flag = false;
  public static void main(String[] args) throws IOException{
    int p=Integer.parseInt(args[0]) ;
    String serverName = new String("toolman.wiu.edu");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//creates stream for keyboard input
    while(p==0) {						//loop to iterate till user enters the portnumber
      System.out.println("Enter server's portnumber you wish to connect");
	p=Integer.parseInt(br.readLine());
    } 
    try {
     Socket clientSocket = new Socket(serverName, p); //Opening socket on given port and serverName
     PrintStream output = new PrintStream(clientSocket.getOutputStream());//creation of output stream
     dis = new DataInputStream(clientSocket.getInputStream());		//creation of input stream
     Thread t1=new Thread(new TClient()); //Thread to make client to send and recieve
     t1.start();			//call to run method
     while (!flag) {			//checks till flag becomes true
          output.println(br.readLine());	//prints to the output stream
    }
        output.close();				//closes the stream
        dis.close();				//closes the input stream
        clientSocket.close();			//closes the socket
    } catch (Exception e) {
      	e.printStackTrace();
    }      
  }

public void run(){ //Thread to run from server
    String msg;					
    try{
      while ((msg = dis.readLine()) != null) { 		//reads the message from input stream
	 if (msg.contains("TerminateClient")){		//checks whether the message has terminate client or not
          break;					//makes flag to true
	}
	if(!(msg.equals("")||msg.equals("	")||msg.equals(" "))){
        	System.out.println(msg);		//prints mesage if it is not empty 
	}
       
      }
      flag = true;
    }catch(Exception e){e.printStackTrace();}
}
}