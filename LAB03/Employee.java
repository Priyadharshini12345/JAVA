import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Employee{                                                                                                                                                  
                                                                                                                                                                        
        private int empid;                                                                                                                                              

        private String firstname;                                                                                                                                       
                                                                                                                                                                        
        private String lastname;                                                                                                                                        
                                                                                                                                                                        
        private double salary=1000;                                                                                                                                     
                                                                                                                                                                        
        Employee(){                                                                                                                                                     
                                                                                                                                                                        
                //System.out.println("Default constructor invoked");                                                                                                    
                empid=0;                                                                                                                                                
                firstname="Nil";                                                                                                                                        
                lastname="Nil";                                                                                                                                         
                //salary=1000;                                                                                                                                          
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        Employee(int id,String fn,String ln){                                                                                                                           

                //System.out.println("Parameterized constructor invoked");                                                                                              
                this.empid=id;                                                                                                                                          
                this.firstname=fn;                                                                                                                                      
                this.lastname=ln;                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setEmpId(int empid){                                                                                                                                
                if(empid<=0)                                                                                                                                            
                        System.out.println("Enter valid Employee ID");                                                                                                  
                else                                                                                                                                                    
                        this.empid=empid;                                                                                                                               
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setFirstName(String firstname){                                                                                                                     
                if(firstname.equals(""))                                                                                                                                
                        System.out.println("Enter valid firstname");                                                                                                    
                else                                                                                                                                                    
                        this.firstname=firstname;                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setLastName(String lastname){                                                                                                                       
                if(lastname.equals(""))                                                                                                                                 
                        System.out.println("Enter valid lastname");                                                                                                     
                else                                                                                                                                                    
                        this.lastname=lastname;                                                                                                                         
        }                                                                                                                                                               
                                                                                                                                                                        
        public int getEmpid(){                                                                                                                                          
                return empid;                                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public String getFirstName(){                                                                                                                                   
                return firstname;                                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        public String getLastName(){                                                                                                                                    
                return lastname;                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        double getSalary(){                                                                                                                                             
                return salary;                                                                                                                                          
        }                                                                                                                                                               
                                                                                                                                                                        
        double calculateBonus(double intRate){                                                                                                                          
                return salary*intRate;                                                                                                                                  
        }                                                                                                                                                               
                                                                                                                                                                        
        public void display(){                                                                                                                                          
                System.out.println("Employee Details:");                                                                                                                
                System.out.println("ID: "+this.getEmpid());                                                                                                             
                System.out.println("Firstname: "+this.getFirstName());                                                                                                  
                System.out.println("Lastname: "+this.getLastName());                                                                                                    
                System.out.println("Salary: "+this.getSalary());                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                return String.format("Employee's Details:\n ID: %d\n FirstName: %s\n LastName: %s\n Salary: %s\n",empid,firstname,lastname,salary);                     
        }                                                                                                                                                               
                                                                                                                                                                        
}                                                                                                                                                                       
                                                                                                                                                                        
                                       