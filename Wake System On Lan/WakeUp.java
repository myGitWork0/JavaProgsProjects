package Practise1;

import java.io.*;
import java.net.*;

public class WakeUp {
    public static void main(String[] args) throws IOException { 
    		byte[] wholePack = new byte[6+16*6];
    		int r=255;
    		for (int i = 0; i < 6; i++) {
    			wholePack[i] = (byte) r;
    		}
        	String macAdd = args[0];
        	String[] t = macAdd.split(":");
        	byte[] delimitedMac= new byte[6];
            for (int i = 0; i < 6; i++) {
            	delimitedMac[i] = (byte) Integer.parseInt(t[i], 16);
            }
            int j=0;
            int k=6;
            while(j<16){
            	for(int i=0;i<delimitedMac.length;i++){
            		wholePack[k]=delimitedMac[i];
            		k++;
            	}
            	j++;
            }
            InetAddress address = InetAddress.getByName("255.255.255.255");
            DatagramPacket packet = new DatagramPacket(wholePack, wholePack.length, address, 7);
            DatagramSocket socket = new DatagramSocket();
            socket.send(packet);
            System.out.println("Packet sent");
            socket.close();                       
    }
}
