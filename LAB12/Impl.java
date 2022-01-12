import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Impl{                                                                                                                                                      
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                String[] arr={"Hello"};                                                                                                                                 
                                                                                                                                                                        
                Queue q=new Queue(arr,10);                                                                                                                              
                                                                                                                                                                        
                QueueRun obj1=new QueueRun(q);                                                                                                                          
                                                                                                                                                                        
                QueueRun2 obj2=new QueueRun2(q);                                                                                                                        
                                                                                                                                                                        
                Caller o1=new Caller(obj1,obj2);                                                                                                                        
                                                                                                                                                                        
                Caller o2=new Caller(obj1,obj2);                                                                                                                        
                                                                                                                                                                        
                try{                                                                                                                                                    
                                                                                                                                                                        
                        o1.t.join();                                                                                                                                    
                        o2.t.join();                                                                                                                                    
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                catch(InterruptedException e){                                                                                                                          
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
}                