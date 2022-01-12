import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Account{                                                                                                                                                   
                                                                                                                                                                        
        String name;                                                                                                                                                    
        int accountNo;                                                                                                                                                  
        double balance;                                                                                                                                                 
        String typeofacc;                                                                                                                                               
        static float interestRate=2.5F;                                                                                                                                 

        Account(){                                                                                                                                                      
                name=null;                                                                                                                                              
                accountNo=0;                                                                                                                                            
                balance=0;                                                                                                                                              
                typeofacc=null;                                                                                                                                         
                interestRate=0;                                                                                                                                         
        }                                                                                                                                                               
                                                                                                                                                                        
        Account(String name,int accountNo,double balance,String typeofacc){                                                                                             
                this.name=name;                                                                                                                                         
                this.accountNo=accountNo;                                                                                                                               
                this.balance=balance;                                                                                                                                   
                this.typeofacc=typeofacc;                                                                                                                               
        }                                                                                                                                                               
                                                                                                                                                                        
        public void deposit(double amt){                                                                                                                                
                this.balance+=amt;                                                                                                                                      
        }                                                                                                                                                               
                                                                                                                                                                        
        public void withdraw(double amt){                                                                                                                               
                                                                                                                                                                        
                if(amt>=(balance-500))                                                                                                                                  
                        System.out.println("You cannot withdraw. Minimum balance Rs.500 should be there");                                                              

                else{                                                                                                                                                   
                        if((this.typeofacc).equals("savings") || (this.typeofacc).equals("current")){                                                                   
                                if(amt>10000)                                                                                                                           
                                        System.out.println("Maximum amount that can be withdrawn is rs.10000");                                                         
                        }                                                                                                                                               
                        else                                                                                                                                            
                                this.balance-=amt;                                                                                                                      
                }                                                                                                                                                       

        }                                                                                                                                                               
        public static void modifyInterestRate(float rate){                                                                                                              
                interestRate=rate;                                                                                                                                      
        }                                                                                                                                                               
                                                                                                                                                                        
        public double calInterest(){                                                                                                                                    
                return (this.balance*interestRate)/100;                                                                                                                 
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                return "ACCOUNT HOLDER:\t"+this.name+"\nACCOUNT NO:\t"+this.accountNo+"\nBALANCE:\t"+this.balance+"\nTYPE OF ACCOUNT:\t"+this.typeofacc+"\nINTEREST:\t"+
this.calInterest()+"\n\n";                                                                                                                                              
        }                                                                                                                                                               
                                                                                                                                                                        
}                                        