import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class HourlyEmployee extends Person{                                                                                                                             
                                                                                                                                                                        
        private int Empid;                                                                                                                                              
        private int NoofHours;                                                                                                                                          
        private double wagesPerHour;                                                                                                                                    
                                                                                                                                                                        
        HourlyEmployee(String name,int date,int month,int year,int Empid,int NoofHours,double wagesPerHour){                                                            
                                                                                                                                                                        
                super(name,date,month,year);                                                                                                                            
                this.Empid=Empid;                                                                                                                                       
                this.NoofHours=NoofHours;                                                                                                                               
                this.wagesPerHour=wagesPerHour;                                                                                                                         
                System.out.println("Derived class constructor invoked");                                                                                                
        }                                                                                                                                                               
                                                                                                                                                                        
        public double CalSalary(){                                                                                                                                      
                return NoofHours*wagesPerHour;                                                                                                                          
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                return String.format("%sEMPLOYEE ID: %d\nNO. OF HOURS WORKED: %d\nSALARY: %f\n",super.toString(),Empid,NoofHours,CalSalary());                          
        }                                                                                                                                                               
}                              