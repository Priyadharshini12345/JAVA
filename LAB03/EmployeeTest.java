import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class EmployeeTest{                                                                                                                                              
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                int id;                                                                                                                                                 
                String fn;                                                                                                                                              
                String ln;                                                                                                                                              
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter Employee ID");                                                                                                                
                id=scan.nextInt();                                                                                                                                      

                String dummy=scan.nextLine();                                                                                                                           
                                                                                                                                                                        
                System.out.println("Enter Firstname");                                                                                                                  
                fn=scan.nextLine();                                                                                                                                     
                                                                                                                                                                        
                System.out.println("Enter Lastname");                                                                                                                   
                ln=scan.nextLine();                                                                                                                                     
                                                                                                                                                                        
                Employee e=new Employee();                                                                                                                              
                                                                                                                                                                        
                System.out.println("Using set and get methods");                                                                                                        
                                                                                                                                                                        
                e.setEmpId(id);                                                                                                                                         
                                                                                                                                                                        
                e.setFirstName(fn);                                                                                                                                     
                                                                                                                                                                        
                e.setLastName(ln);                                                                                                                                      
                                                                                                                                                                        
                e.display();                                                                                                                                            
                                                                                                                                                                        
                System.out.printf("Bonus Amount: %f",e.calculateBonus(0.25));                                                                                           
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
                                                                                                                                                                        
                System.out.println("Enter Employee ID");                                                                                                                
                                                                                                                                                                        
                id=scan.nextInt();                                                                                                                                      

                String dummy1=scan.nextLine();                                                                                                                          
                                                                                                                                                                        
                System.out.println("Enter Firstname");                                                                                                                  

                fn=scan.nextLine();                                                                                                                                     

                System.out.println("Enter Lastname");                                                                                                                   
                                                                                                                                                                        
                ln=scan.nextLine();                                                                                                                                     
                                                                                                                                                                        
                Employee e2=new Employee(id,fn,ln);                                                                                                                     
                                                                                                                                                                        
                System.out.println(e2.toString());                                                                                                                      
                                                                                                                                                                        
                System.out.printf("Bonus Amount: %f",e2.calculateBonus(0.20));                                                                                          
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
                                                                                                                                                                        
                Employee e3=new Employee();                                                                                                                             
                                                                                                                                                                        
                e3.display();                                                                                                                                           
                                                                                                                                                                        
                System.out.printf("Bonus Amount: %f",e3.calculateBonus(0.26));                                                                                          
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
        }                                                                                                                                                               
}                                