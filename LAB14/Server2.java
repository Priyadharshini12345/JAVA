import java.io.*;                                                                                                                                                       
                                                                                                                                                                        
import java.net.*;                                                                                                                                                      
                                                                                                                                                                        
public class Server2{                                                                                                                                                   
                                                                                                                                                                        
        public static void main(String[] args) throws Exception{                                                                                                        
                                                                                                                                                                        
                DatagramSocket serverSocket = new DatagramSocket(7892);                                                                                                 
                                                                                                                                                                        
                while(true){                                                                                                                                            
                                                                                                                                                                        
                        byte[] sendData = new byte[1024];                                                                                                               
                                                                                                                                                                        
                        byte[] recvData = new byte[1024];                                                                                                               
                                                                                                                                                                        
                        DatagramPacket recvPacket = new DatagramPacket(recvData,recvData.length);                                                                       
                                                                                                                                                                        
                        serverSocket.receive(recvPacket);                                                                                                               
                                                                                                                                                                        
                        String sentence = new String( recvPacket.getData());                                                                                            
                                                                                                                                                                        
                        String modifiedSentence = sentence.toUpperCase();                                                                                               
                                                                                                                                                                        
                        InetAddress ip = recvPacket.getAddress();                                                                                                       
                                                                                                                                                                        
                        int port = recvPacket.getPort();                                                                                                                
                                                                                                                                                                        
                        sendData = modifiedSentence.getBytes();                                                                                                         
                                                                                                                                                                        
                        DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,ip,port);                                                               
                                                                                                                                                                        
                        serverSocket.send(sendPacket);                                                                                                                  
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
}              