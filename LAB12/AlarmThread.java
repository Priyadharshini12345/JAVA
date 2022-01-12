import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class AlarmThread implements Runnable{                                                                                                                           
                                                                                                                                                                        
        protected int countDown=10;                                                                                                                                     
        private static int taskCount=0;                                                                                                                                 
        private final int id=taskCount++;                                                                                                                               
                                                                                                                                                                        
        public AlarmThread(){                                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public AlarmThread(int countDown){                                                                                                                              
                this.countDown=countDown;                                                                                                                               
        }                                                                                                                                                               
                                                                                                                                                                        
        public String status(){                                                                                                                                         
                return "#"+id+"("+((countDown>0)?countDown:"Alarm!")+")"+"\n";                                                                                          
        }                                                                                                                                                               
                                                                                                                                                                        
        public void print(){                                                                                                                                            
                System.out.println("Hello All! Welcome to the Java Programming Lab");                                                                                   
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                return "Priority of the current thread is: "+Thread.currentThread().getPriority();                                                                      
        }                                                                                                                                                               
                                                                                                                                                                        
        public void run(){                                                                                                                                              
                while(countDown-->0){                                                                                                                                   
                        print();                                                                                                                                        
                        Thread.yield();                                                                                                                                 
                }                                                                                                                                                       
                System.out.println(this);                                                                                                                               
        }                                                                                                                                                               
}                                