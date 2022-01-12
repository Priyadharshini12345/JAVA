import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class BankAccount{                                                                                                                                               
                                                                                                                                                                        
        double balance;                                                                                                                                                 
                                                                                                                                                                        
        BankAccount(){                                                                                                                                                  
                balance=100;                                                                                                                                            
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
        public void withdraw(double amount){                                                                                                                            
                                                                                                                                                                        
                System.out.println("Withdrawing "+amount);                                                                                                              

                if(amount<=balance){                                                                                                                                    

                        balance-=amount;                                                                                                                                
                                                                                                                                                                        
                        System.out.println("New Balance: "+balance+"\n");                                                                                               
                }                                                                                                                                                       
                                                                                                                                                                        
                else                                                                                                                                                    
                        System.out.println("Cannot withdraw\n");                                                                                                        
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public void deposit(double amount){                                                                                                                             
                                                                                                                                                                        
                System.out.println("Depositing "+amount);                                                                                                               
                                                                                                                                                                        
                balance+=amount;                                                                                                                                        
                                                                                                                                                                        
                System.out.println("New balance "+balance+"\n");                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        double getBalance(){                                                                                                                                            
                                                                                                                                                                        
                return balance;                                                                                                                                         
        }                                                                                                                                                               
}                                          