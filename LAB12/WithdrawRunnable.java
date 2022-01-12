import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class WithdrawRunnable implements Runnable{                                                                                                                      
                                                                                                                                                                        
        private BankAccount obj;                                                                                                                                        
                                                                                                                                                                        
        private static final int DELAY =1;                                                                                                                              
                                                                                                                                                                        
        private double amount;                                                                                                                                          
                                                                                                                                                                        
        private int count;                                                                                                                                              
                                                                                                                                                                        
        public WithdrawRunnable(BankAccount obj,double amount,int num){                                                                                                 
                                                                                                                                                                        
                this.obj=obj;                                                                                                                                           

                this.amount=amount;                                                                                                                                     

                count=num;                                                                                                                                              
        }                                                                                                                                                               
                                                                                                                                                                        
        public synchronized void run(){                                                                                                                                 
                                                                                                                                                                        
                try{                                                                                                                                                    
                                                                                                                                                                        
                        for(int i=1;i<=count;i++)                                                                                                                       
                        {                                                                                                                                               

                                System.out.print(Thread.currentThread().getName()+": ");                                                                                
                                obj.withdraw(amount);                                                                                                                   
                                Thread.sleep(DELAY);                                                                                                                    
                        }                                                                                                                                               
                }                                                                                                                                                       
                                                                                                                                                                        
                catch(InterruptedException e){                                                                                                                          
                                                                                                                                                                        
                        e.printStackTrace();                                                                                                                            
                }                                                                                                                                                       
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
                       