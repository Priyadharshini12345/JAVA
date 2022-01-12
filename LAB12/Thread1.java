import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Thread1{                                                                                                                                                   
                                                                                                                                                                        
        public static void main(String args[]){                                                                                                                         
                                                                                                                                                                        
                Thread t=new Thread(new AlarmThread());                                                                                                                 
//main thread                                                                                                                                                           
                t.start();                                                                                                                                              
                                                                                                                                                                        
                System.out.println("Waiting for alarm");                                                                                                                
//concurrent threads                                                                                                                                                    
                for(int i=0;i<5;i++)                                                                                                                                    
                        new Thread(new AlarmThread()).start();                                                                                                          
                                                                                                                                                                        
                System.out.println("Waiting for alarm");                                                                                                                
                                                                                                                                                                        
        }                                                                                                                                                               
}             