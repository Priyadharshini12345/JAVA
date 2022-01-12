import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class TestEmployee{                                                                                                                                              
                                                                                                                                                                        
        public static void main(String args[]){                                                                                                                         
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter your name");                                                                                                                  
                String name=scan.nextLine();                                                                                                                            
                                                                                                                                                                        
                System.out.println("DATE OF BIRTH: Enter date");                                                                                                        
                int date=scan.nextInt();                                                                                                                                
                                                                                                                                                                        
                System.out.println("Enter month");                                                                                                                      
                int month=scan.nextInt();                                                                                                                               
                                                                                                                                                                        
                System.out.println("Enter year");                                                                                                                       
                int year=scan.nextInt();                                                                                                                                
                                                                                                                                                                        
                System.out.println("Enter Employee ID");                                                                                                                
                int id=scan.nextInt();                                                                                                                                  
                                                                                                                                                                        
                String dummy=scan.nextLine();                                                                                                                           
                                                                                                                                                                        
                System.out.println("Enter designation");                                                                                                                
                String desg=scan.nextLine();                                                                                                                            
                                                                                                                                                                        
                System.out.println("Enter salary");                                                                                                                     
                double salary=scan.nextDouble();                                                                                                                        
                                                                                                                                                                        
                Date d=new Date(date,month,year);                                                                                                                       
                                                                                                                                                                        
                Employee e=new Employee(name,d,id,salary,desg);                                                                                                         
                                                                                                                                                                        
                System.out.println(e.toString());                                                                                                                       
                                                                                                                                                                        
                System.out.println("BONUS AMOUNT: "+e.calculateBonus());                                                                                                
                                                                                                                                                                        
                System.out.println("\n\nENTER DETAILS OF HOURLY EMPLOYEE");                                                                                             
                                                                                                                                                                        
                dummy=scan.nextLine();                                                                                                                                  
                                                                                                                                                                        
                System.out.println("Enter name");                                                                                                                       
                name=scan.nextLine();                                                                                                                                   
                                                                                                                                                                        
                System.out.println("Enter DOB: Enter date");                                                                                                            
                date=scan.nextInt();                                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter month");                                                                                                                      
                month=scan.nextInt();                                                                                                                                   
                                                                                                                                                                        
                System.out.println("Enter year");                                                                                                                       
                year=scan.nextInt();                                                                                                                                    

                System.out.println("Enter Employee ID");                                                                                                                
                id=scan.nextInt();                                                                                                                                      
                                                                                                                                                                        
                System.out.println("Enter the number of hours worked");                                                                                                 
                int hours=scan.nextInt();                                                                                                                               
                                                                                                                                                                        
                System.out.println("Enter the wages per hour");                                                                                                         
                double wages=scan.nextDouble();                                                                                                                         
                                                                                                                                                                        
                                                                                                                                                                        
                HourlyEmployee he=new HourlyEmployee(name,date,month,year,id,hours,wages);
                                                                                                                                                                        
                System.out.println("\n-------HOURLY EMPLOYEE DETAILS-------\n");                                                                                        
                                                                                                                                                                        
                System.out.println(he.toString());                                                                                                                      
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
                                                                                                                                                                        
                Person p[]=new Person[5];                                                                                                                               
                                                                                                                                                                        
                System.out.println("DETAILS OF 5 PERSONS: 3 EMPLOYEES AND 2 HOURLY EMPLOYEES");                                                                         
                                                                                                                                                                        
                for(int i=0;i<3;i++){                                                                                                                                   
                                                                                                                                                                        
                        dummy=scan.nextLine();                                                                                                                          
                                                                                                                                                                        
                        System.out.println("Enter name");                                                                                                               
                        name=scan.nextLine();                                                                                                                           
                                                                                                                                                                        
                        System.out.println("Enter DOB: Enter date");                                                                                                    
                        date=scan.nextInt();                                                                                                                            
                                                                                                                                                                        
                        System.out.println("Enter month");                                                                                                              
                        month=scan.nextInt();                                                                                                                           
                                                                                                                                                                        
                        System.out.println("Enter year");                                                                                                               
                        year=scan.nextInt();                                                                                                                            
                                                                                                                                                                        
                        Date object=new Date(date,month,year);                                                                                                          
                                                                                                                                                                        
                        System.out.println("Enter Employee ID");                                                                                                        
                        id=scan.nextInt();                                                                                                                              
                                                                                                                                                                        
                        dummy=scan.nextLine();                                                                                                                          
                                                                                                                                                                        
                        System.out.println("Enter designation");                                                                                                        
                        desg=scan.nextLine();                                                                                                                           
                                                                                                                                                                        
                        System.out.println("Enter salary");                                                                                                             
                        salary=scan.nextDouble();                                                                                                                       
                                                                                                                                                                        
                        p[i]=new Employee(name,object,id,salary,desg);                                                                                                  
                                                                                                                                                                        
                        System.out.printf("\n\nEMPLOYEE %d: \n",(i+1));                                                                                                 
                                                                                                                                                                        
                        System.out.print(p[i].toString());                                                                                                              
                                                                                                                                                                        
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                for(int i=3;i<5;i++){                                                                                                                                   
                                                                                                                                                                        
                        dummy=scan.nextLine();                                                                                                                          
                                                                                                                                                                        
                        System.out.println("Enter name");                                                                                                               
                        name=scan.nextLine();                                                                                                                           
                                                                                                                                                                        
                        System.out.println("Enter DOB: Enter date");                                                                                                    
                        date=scan.nextInt();                                                                                                                            
                                                                                                                                                                        
                        System.out.println("Enter month");                                                                                                              
                        month=scan.nextInt();                                                                                                                           
                                                                                                                                                                        
                        System.out.println("Enter year");                                                                                                               
                        year=scan.nextInt();                                                                                                                            
                                                                                                                                                                        
                        System.out.println("Enter Employee ID");                                                                                                        
                        id=scan.nextInt();                                                                                                                              
                                                                                                                                                                        
                        System.out.println("Enter the number of hours worked");                                                                                         
                        hours=scan.nextInt();                                                                                                                           
                                                                                                                                                                        
                        System.out.println("Enter the wages per hour");                                                                                                 
                        wages=scan.nextDouble();                                                                                                                        
                                                                                                                                                                        
                        System.out.printf("\n\nHOURLY EMPLOYEE %d: \n",(i-2));                                                                                          
                                                                                                                                                                        
                        p[i]=new HourlyEmployee(name,date,month,year,id,hours,wages);                                                                                   
                                                                                                                                                                        
                        System.out.println(p[i].toString());                                                                                                            
                }                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
        }                                                                                                                                                               
}                                              