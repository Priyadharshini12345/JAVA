import java.io.*;                                                                                                                                                       
                                                                                                                                                                        
import java.net.*;                                                                                                                                                      
                                                                                                                                                                        
public class Client2{                                                                                                                                                   
                                                                                                                                                                        
        public static void main(String args[]) throws Exception{                                                                                                        
                                                                                                                                                                        
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));                                                                       
                                                                                                                                                                        
                DatagramSocket clientaddress=new DatagramSocket();                                                                                                      
                                                                                                                                                                        
                InetAddress ip = InetAddress.getLocalHost();                                                                                                            
                                                                                                                                                                        
                byte[] sendbyte=new byte[1024];                                                                                                                         
                                                                                                                                                                        
                byte[] recvbyte=new byte[1024];                                                                                                                         
                                                                                                                                                                        
                String sentence = inFromUser.readLine();                                                                                                                
                                                                                                                                                                        
                sendbyte = sentence.getBytes();                                                                                                                         
                                                                                                                                                                        
                DatagramPacket sendPacket = new DatagramPacket(sendbyte,sendbyte.length,ip,7899);                                                                       
                                                                                                                                                                        
                clientaddress.send(sendPacket);                                                                                                                         
                                                                                                                                                                        
                DatagramPacket recvPacket = new DatagramPacket(recvbyte,recvbyte.length);                                                                               
                                                                                                                                                                        
                clientaddress.receive(recvPacket);                                                                                                                      
                                                                                                                                                                        
                String modifiedSentence = new String (recvPacket.getData()) ;                                                                                           
                                                                                                                                                                        
                System.out.println("FROM SERVER: "+modifiedSentence);                                                                                                   
                                                                                                                                                                        
                clientaddress.close();                                                                                                                                  
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
}                  