import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Caller implements Runnable{                                                                                                                                
                                                                                                                                                                        
        QueueRun target;                                                                                                                                                
        QueueRun2 target2;                                                                                                                                              
        Thread t;                                                                                                                                                       
        Caller(QueueRun target1,QueueRun2 target2){                                                                                                                     
                target=target1;                                                                                                                                         
                this.target2=target2;                                                                                                                                   
                t=new Thread(this,"demo");                                                                                                                              
        }                                                                                                                                                               
                                                                                                                                                                        
        public void run(){                                                                                                                                              
                target.insertR();                                                                                                                                       
                target2.deleteR();                                                                                                                                      
        }                                                                                                                                                               
}                  