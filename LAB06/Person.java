import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
abstract public class Person{                                                                                                                                           
                                                                                                                                                                        
        protected String name;                                                                                                                                          
        protected Date dob;                                                                                                                                             
                                                                                                                                                                        
        Person(){                                                                                                                                                       
                name=null;                                                                                                                                              
                dob=new Date();                                                                                                                                         
                System.out.println("Base class default constructor invoked");                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        Person(String name,int date,int month,int year){                                                                                                                
                                                                                                                                                                        
                this.name=name;                                                                                                                                         
                dob=new Date(date,month,year);                                                                                                                          
                System.out.println("Base class parameterised constructor invoked");                                                                                     
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        abstract public void modifySalary();                                                                                                                            
                                                                                                                                                                        
        public void setName(String name){                                                                                                                               
                this.name=name;                                                                                                                                         
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setDob(Date obj){                                                                                                                                   
                dob=obj;                                                                                                                                                
        }                                                                                                                                                               
                                                                                                                                                                        
        public String getName(){                                                                                                                                        
                return name;                                                                                                                                            
        }                                                                                                                                                               
                                                                                                                                                                        
        public Date getDate(){                                                                                                                                          
                return dob;                                                                                                                                             
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                                                                                                                                                                        
                return String.format("NAME: %s\nDATE OF BIRTH: %s\n",getName(),getDate());                                                                              
        }                                                                                                                                                               
}                                                                                                                                                                       
                              