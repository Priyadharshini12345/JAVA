import java.util.InputMismatchException;                                                                                                                                
                                                                                                                                                                        
import java.util.Scanner;                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
class CustomException extends Exception{                                                                                                                                
                                                                                                                                                                        
                                                                                                                                                                        
        String s;                                                                                                                                                       
                                                                                                                                                                        
        CustomException(String s){                                                                                                                                      
                this.s=s;                                                                                                                                               
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                return s;                                                                                                                                               
        }                                                                                                                                                               
                                                                                                                                                                        
}                                                                                                                                                                       
                                                                                                                                                                        
public class TestAccount {                                                                                                                                              
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
        static Scanner input = new Scanner(System.in);                                                                                                                  
                                                                                                                                                                        
        public static void main(String[] args) {                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        

                                                                                                                                                                        
                // Create an account object using new                                                                                                                   
                                                                                                                                                                        
                Account ac1 = new Account();                                                                                                                            
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                        ac1.setName(initName());                                                                                                                        
                                                                                                                                                                        
                        ac1.setBalance(initBalance());                                                                                                                  
                                                                                                                                                                        
                        ac1.setAccountNumber(initAccountNumber());                                                                                                      
                                                                                                                                                                        
                        System.out.println("The name of an account holder is " + ac1.getName());                                                                        
                                                                                                                                                                        
                        System.out.println("The balance of an account holder is " + ac1.getBalance());                                                                  
                                                                                                                                                                        
                        System.out.println("The account number of an account holder is " + ac1.getAccount());                                                           
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
        private static String initName() {                                                                                                                              
                                                                                                                                                                        
                String name = null;                                                                                                                                     
                                                                                                                                                                        
                while(true) {                                                                                                                                           
                                                                                                                                                                        
                        try {                                                                                                                                           
                                                                                                                                                                        
                                System.out.println("Enter the name of an account holder");                                                                              
                                                                                                                                                                        
                                name = input.nextLine();                                                                                                                
                                                                                                                                                                        
                                if (name.length() == 0) {                                                                                                               
                                                                                                                                                                        
                                        throw new CustomException("Name is not available");                                                                             
                                                                                                                                                                        
                                }                                                                                                                                       
                                                                                                                                                                        
                                return name;                                                                                                                            
                                                                                                                                                                        
                        } catch (CustomException e) {                                                                                                                   
                                                                                                                                                                        
                                System.out.println("Error: " + e.getMessage());                                                                                         
                                                                                                                                                                        
                        }                                                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
        private static int initAccountNumber() {                                                                                                                        
                                                                                                                                                                        
                while(true) {                                                                                                                                           
                                                                                                                                                                        
                        try {                                                                                                                                           
                                                                                                                                                                        
                                System.out.println("Enter the account number");                                                                                         
                                                                                                                                                                        
                                return input.nextInt();                                                                                                                 
                                                                                                                                                                        
                        } catch (InputMismatchException e) {                                                                                                            
                                                                                                                                                                        
                                System.out.println("Error in getting the account number");                                                                              
                                                                                                                                                                        
                                input.nextLine();                                                                                                                       
                                                                                                                                                                        
                        }                                                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
        private static double initBalance() {                                                                                                                           
                                                                                                                                                                        
                while(true) {                                                                                                                                           
                                                                                                                                                                        
                        try {                                                                                                                                           
                                                                                                                                                                        
                                System.out.println("Enter the balance");                                                                                                
                                                                                                                                                                        
                                return input.nextDouble();                                                                                                              
                                                                                                                                                                        
                        } catch (InputMismatchException e) {                                                                                                            
                                                                                                                                                                        
                                System.out.println("Error in getting the balancer");                                                                                    
                                                                                                                                                                        
                                input.nextLine();                                                                                                                       
                                                                                                                                                                        
                        }                                                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        

                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
}                              