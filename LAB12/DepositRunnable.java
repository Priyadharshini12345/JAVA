import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class DepositRunnable implements Runnable{                                                                                                                       
                                                                                                                                                                        
        private BankAccount obj;                                                                                                                                        
                                                                                                                                                                        
        private static final int DELAY =1;                                                                                                                              
                                                                                                                                                                        
        private double amount;                                                                                                                                          
                                                                                                                                                                        
        private int count;                                                                                                                                              
                                                                                                                                                                        
        public DepositRunnable(BankAccount obj,double amount,int num){                                                                                                  
                                                                                                                                                                        
                this.obj=obj;                                                                                                                                           

                this.amount=amount;                                                                                                                                     

                count=num;                                                                                                                                              
        }                                                                                                                                                               
                                                                                                                                                                        
        public synchronized void run(){                                                                                                                                 
                                                                                                                                                                        
                try{                                                                                                                                                    
                                                                                                                                                                        
                        for(int i=1;i<=count;i++)                                                                                                                       
                        {                                                                                                                                               
                                if(amount>100000){                                                                                                                      
                                        Thread.currentThread().stop();                                                                                                  
                                        System.out.println(Thread.currentThread().getName()+" is blocked since deposit amount is greater than 1 Lakh\n");               
                                }                                                                                                                                       
                                else{                                                                                                                                   
                                        System.out.print(Thread.currentThread().getName()+": ");                                                                        
                                        obj.deposit(amount);                                                                                                            
                                        Thread.sleep(DELAY);                                                                                                            
                                }                                                                                                                                       
                        }                                                                                                                                               
                }                                                                                                                                                       
                                                                                                                                                                        
                catch(InterruptedException e){                                                                                                                          
                                                                                                                                                                        
                        e.printStackTrace();                                                                                                                            
                }                                                                                                                                                       
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
                                   