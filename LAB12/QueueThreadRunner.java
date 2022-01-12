import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class QueueThreadRunner{                                                                                                                                         
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the capacity of the queue:");                                                                                                 
                int m=scan.nextInt();                                                                                                                                   
                                                                                                                                                                        
                String[] arr=new String[m];                                                                                                                             
                                                                                                                                                                        
                System.out.println("Enter the number of times thread should execute: ");                                                                                
                                                                                                                                                                        
                int num=scan.nextInt();                                                                                                                                 
                                                                                                                                                                        
                final int THREADS=5;                                                                                                                                    
                                                                                                                                                                        
                Queue q=new Queue(arr,m);                                                                                                                               
                                                                                                                                                                        
                for(int i=0;i<=THREADS;i++){                                                                                                                            
                                                                                                                                                                        
                        QueueRunnable obj=new QueueRunnable(q,num);                                                                                                     
                                                                                                                                                                        
                        QueueRunnable1 obj1=new QueueRunnable1(q,num);                                                                                                  
                                                                                                                                                                        
                        Thread qt=new Thread(obj);                                                                                                                      
                                                                                                                                                                        
                        Thread qr=new Thread(obj1);                                                                                                                     
                                                                                                                                                                        
                        qt.start();                                                                                                                                     
                                                                                                                                                                        
                        qr.start();                                                                                                                                     
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
                           