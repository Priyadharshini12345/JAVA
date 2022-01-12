import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class BankAccountThreadRunner{                                                                                                                                   
                                                                                                                                                                        
        public static void main(String args[]){                                                                                                                         
                                                                                                                                                                        
                BankAccount account=new BankAccount();                                                                                                                  
                                                                                                                                                                        
                final double AMOUNT[]={100,200,5000,200000,8000,600000};                                                                                                
                                                                                                                                                                        
                final int REPETITIONS=10;                                                                                                                               
                                                                                                                                                                        
                final int THREADS=5;                                                                                                                                    
                int k=0;                                                                                                                                                
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
                                                                                                                                                                        
                for(int i=0;i<=THREADS;i++){                                                                                                                            
                                                                                                                                                                        
                        DepositRunnable d=new DepositRunnable(account,AMOUNT[k],REPETITIONS);                                                                           
                                                                                                                                                                        
                        WithdrawRunnable w=new WithdrawRunnable(account,AMOUNT[k],REPETITIONS);                                                                         
                                                                                                                                                                        
                        Thread dt=new Thread(d);                                                                                                                        
                                                                                                                                                                        
                        Thread wt=new Thread(w);                                                                                                                        
                                                                                                                                                                        
                        dt.start();                                                                                                                                     

                        wt.start();                                                                                                                                     
                                                                                                                                                                        
                        k++;                                                                                                                                            
                                                                                                                                                                        
                }                                                                                                                                                       
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                                  