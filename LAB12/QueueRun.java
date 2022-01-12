import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class QueueRun{                                                                                                                                                  
                                                                                                                                                                        
        Queue q;                                                                                                                                                        

        QueueRun(Queue q){                                                                                                                                              
                this.q=q;                                                                                                                                               
        }                                                                                                                                                               
        public void insertR(){                                                                                                                                          
                                                                                                                                                                        
                try{                                                                                                                                                    
                        for(int i=0;i<5;i++){                                                                                                                           
                                q.insert("Hello");                                                                                                                      
                                Thread.sleep(1000);                                                                                                                     
                        }                                                                                                                                               
                                                                                                                                                                        
                }                                                                                                                                                       
                catch(InterruptedException e){                                                                                                                          
                }                                                                                                                                                       
        }                                                                                                                                                               
}            