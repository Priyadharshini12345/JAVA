import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class TestAccount{                                                                                                                                               
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the number of account holders:\n");                                                                                           
                int n=scan.nextInt();                                                                                                                                   
                                                                                                                                                                        
                Account[] a=new Account[n];                                                                                                                             
                                                                                                                                                                        
                String dumm=scan.nextLine();                                                                                                                            
                                                                                                                                                                        
                System.out.println("Do you wish to change the interest rate?y/n");                                                                                      
                String ch=scan.nextLine();                                                                                                                              
                                                                                                                                                                        
                if(ch.equals("y")){                                                                                                                                     
                        System.out.println("Enter the new interest rate\n");                                                                                            
                        float rate=scan.nextFloat();                                                                                                                    
                                                                                                                                                                        
                        Account.modifyInterestRate(rate);                                                                                                               
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                                                                                                                                                                        
                        String dummy=scan.nextLine();                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter the account holder's name:\n");                                                                                       
                        String name=scan.nextLine();                                                                                                                    
                                                                                                                                                                        
                        System.out.println("Enter the account no\n");                                                                                                   
                        int accountNo=scan.nextInt();                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter the balance amount\n");                                                                                               
                        double balance=scan.nextDouble();                                                                                                               
                                                                                                                                                                        
                        String dummy2=scan.nextLine();                                                                                                                  
                                                                                                                                                                        
                        System.out.println("Enter the type of account\n");                                                                                              
                        String type=scan.nextLine();                                                                                                                    
                                                                                                                                                                        
                        a[i]=new Account(name,accountNo,balance,type);                                                                                                  
                                                                                                                                                                        
                        for(;;){                                                                                                                                        
                                                                                                                                                                        
                        System.out.println("Do you want to withdraw/deposit?\n");                                                                                       
                        System.out.println("Press 'w' to withdraw, 'd' to deposit, 'e' to exit");                                                                       
                        String check=scan.nextLine();                                                                                                                   
                                                                                                                                                                        
                        if(check.equals("w")){                                                                                                                          
                                                                                                                                                                        
                                System.out.println("Enter the amount you want to withdraw\n");                                                                          
                                float amt=scan.nextFloat();                                                                                                             
                                a[i].withdraw(amt);                                                                                                                     
                        }                                                                                                                                               
                                                                                                                                                                        
                        else if(check.equals("d")){                                                                                                                     
                                                                                                                                                                        
                                System.out.println("Enter the amount you want to deposit\n");                                                                           
                                float amt=scan.nextFloat();                                                                                                             
                                a[i].deposit(amt);                                                                                                                      
                                                                                                                                                                        
                        }                                                                                                                                               
                                                                                                                                                                        
                        else if(check.equals("e"))                                                                                                                      
                                break;                                                                                                                                  
                        }                                                                                                                                               
                                                                                                                                                                        
                        System.out.println(a[i].toString());                                                                                                            
                                                                                                                                                                        
                }                                                                                                                                                       
        }                                                                                                                                                               
}                               