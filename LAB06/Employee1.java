import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Employee extends Person implements CalculateBonus,IncomeTax,Comparable<Employee>{                                                                          
                                                                                                                                                                        
        private int Empid;                                                                                                                                              
        private double salary;                                                                                                                                          
        private String designation;                                                                                                                                     
                                                                                                                                                                        
        Employee(){                                                                                                                                                     
                super();                                                                                                                                                
                Empid=0;                                                                                                                                                
                salary=0.0;                                                                                                                                             
                designation=null;                                                                                                                                       
                System.out.println("Derived class default constructor invoked");                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        Employee(String name,Date obj,int Empid,double salary,String designation){                                                                                      
                                                                                                                                                                        
                super(name,obj.date,obj.month,obj.year);                                                                                                                
                this.Empid=Empid;                                                                                                                                       
                this.salary=salary;                                                                                                                                     
                this.designation=designation;                                                                                                                           
                System.out.println("Derived class parameterised constructor invoked");                                                                                  

        }                                                                                                                                                               
                                                                                                                                                                        
        /*@override*/                                                                                                                                                   
                                                                                                                                                                        
        public int compareTo(Employee o){                                                                                                                               
                                                                                                                                                                        
                if(this.salary>o.salary)                                                                                                                                
                        return -1;                                                                                                                                      
                else if(this.salary<o.salary)                                                                                                                           
                        return 1;                                                                                                                                       
                else                                                                                                                                                    
                        return 0;                                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        /*@override*/                                                                                                                                                   
                                                                                                                                                                        
        public double calculateTax(){                                                                                                                                   
                                                                                                                                                                        
                if(salary<=10000)                                                                                                                                       
                        return (salary*tax1);                                                                                                                           
                else                                                                                                                                                    
                        return (salary*tax2);                                                                                                                           
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        /*@override*/                                                                                                                                                   
        public double bonus(){                                                                                                                                          
                                                                                                                                                                        
                return bonusRate*salary;                                                                                                                                
        }                                                                                                                                                               
                                                                                                                                                                        
        /*@override*/                                                                                                                                                   
        public void modifySalary(){                                                                                                                                     
                                                                                                                                                                        
                double bon=bonus();                                                                                                                                     
                salary+=bon;                                                                                                                                            
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
        public void setEmpId(int empid){                                                                                                                                
                this.Empid=empid;                                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setdesg(String desg){                                                                                                                               
                this.designation=desg;                                                                                                                                  
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setSalary(double sal){                                                                                                                              
                this.salary=sal;                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public int getEmpId(){                                                                                                                                          
                return Empid;                                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public String getDesg(){                                                                                                                                        
                return designation;                                                                                                                                     
        }
                                                                                                                                                                        
        public double getSal(){                                                                                                                                         
                return salary;                                                                                                                                          
        }                                                                                                                                                               
                                                                                                                                                                        
        public double calculateBonus(){                                                                                                                                 
                                                                                                                                                                        
                return bonusRate*salary;                                                                                                                                
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                                                                                                                                                                        
                System.out.println("\n------------EMPLOYEE DETAILS---------\n");                                                                                        
                                                                                                                                                                        
                return String.format("%sEMPLOYEE ID: %d\nSALARY(INCLUSIVE OF BONUS): %f\nDESIGNATION: %s\nINCOME TAX: %f\n\n",super.toString(),getEmpId(),getSal(),getDe
sg(),calculateTax());                                                                                                                                                   
        }                                                                                                                                                               
}                                              