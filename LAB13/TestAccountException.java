import java.util.Scanner;                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
public class TestAccountException {                                                                                                                                     
                                                                                                                                                                        

                                                                                                                                                                        
        static Scanner input = new Scanner(System.in);                                                                                                                  
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
/*      public static void main(String[] args) {                                                                                                                        
                                                                                                                                                                        
                AccountWithException ac1 = new AccountWithException();                                                                                                  
                                                                                                                                                                        
                System.out.println("eneter the name of the account holder");                                                                                            
                                                                                                                                                                        
                String nm = input.nextLine();                                                                                                                           
                                                                                                                                                                        
                try {                                                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Call now");                                                                                                                 
                                                                                                                                                                        
                // ac1.initName(nm);                                                                                                                                    
                                                                                                                                                                        
                        method1();                                                                                                                                      
                                                                                                                                                                        
                 System.out.println("after call of method init");                                                                                                       
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                catch(IllegalArgumentException e) {                                                                                                                     
                                                                                                                                                                        
                        System.out.println("input null");                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        

                                                                                                                                                                        
        System.out.println("enter string correctly");                                                                                                                   
                                                                                                                                                                        

                                                                                                                                                                        
        } */                                                                                                                                                            
                                                                                                                                                                        
        public static void main(String[] args) {                                                                                                                        
                                                                                                                                                                        
                AccountWithException ac1 = new AccountWithException();                                                                                                  
                                                                                                                                                                        
                try {                                                                                                                                                   
                                                                                                                                                                        
                        ac1.method1();                                                                                                                                  
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                catch(Exception e) {                                                                                                                                    
                                                                                                                                                                        
                        e.printStackTrace();                                                                                                                            
                                                                                                                                                                        

                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        
}                              