import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class QueueRunnable implements Runnable{                                                                                                                         
                                                                                                                                                                        
        private Queue q;                                                                                                                                                
                                                                                                                                                                        
        private static final int DELAY=1;                                                                                                                               
                                                                                                                                                                        
        private int count;                                                                                                                                              
                                                                                                                                                                        
        QueueRunnable(Queue q,int num){                                                                                                                                 
                                                                                                                                                                        
                count=num;                                                                                                                                              
                this.q=q;                                                                                                                                               
        }                                                                                                                                                               
                                                                                                                                                                        
        public void run(){                                                                                                                                              
                                                                                                                                                                        
                try{                                                                                                                                                    
                        for(int i=0;i<count;i++){                                                                                                                       
                                System.out.print(Thread.currentThread().getName()+": ");                                                                                
                                q.insert("Hello");                                                                                                                      
                                Thread.sleep(DELAY);                                                                                                                    
                        }                                                                                                                                               
                }                                                                                                                                                       
                catch(InterruptedException e){                                                                                                                          
                        e.printStackTrace();                                                                                                                            
                }                                                                                                                                                       
        }                                                                                                                                                               
}                    