import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class QueueRun2{                                                                                                                                                 
                                                                                                                                                                        
        Queue q;                                                                                                                                                        

        QueueRun2(Queue q){                                                                                                                                             
                this.q=q;                                                                                                                                               
        }                                                                                                                                                               
        public void deleteR(){                                                                                                                                          
                                                                                                                                                                        
                try{                                                                                                                                                    
                        for(int i=0;i<5;i++){                                                                                                                           
                                q.delete();                                                                                                                             
                                Thread.sleep(1000);                                                                                                                     
                        }                                                                                                                                               
                                                                                                                                                                        
                }                                                                                                                                                       
                catch(InterruptedException e){                                                                                                                          
                }                                                                                                                                                       
        }                                                                                                                                                               
}                                          