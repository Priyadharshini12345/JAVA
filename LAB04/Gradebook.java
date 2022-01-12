import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Gradebook{                                                                                                                                                 
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                int n;                                                                                                                                                  
                System.out.println("Enter the number of courses");                                                                                                      
                n=scan.nextInt();                                                                                                                                       

                Course c[]=new Course[n];                                                                                                                               
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                                                                                                                                                                        
                        String summy=scan.nextLine();                                                                                                                   

                        System.out.println("Enter the course name");                                                                                                    
                        String courseName=scan.nextLine();                                                                                                              
                                                                                                                                                                        
                        System.out.println("Enter the course instructor");                                                                                              
                        String courseInstructor=scan.nextLine();                                                                                                        
                                                                                                                                                                        
                        System.out.println("Enter the number of hours");                                                                                                
                        int noofhrs=scan.nextInt();                                                                                                                     
                                                                                                                                                                        
                        System.out.println("Enter the number of credits");                                                                                              
                        int credits=scan.nextInt();                                                                                                                     
                                                                                                                                                                        
                        c[i]=new Course(courseName,courseInstructor,noofhrs,credits);                                                                                   
                                                                                                                                                                        
                        System.out.println(c[i].toString());                                                                                                            
                                                                                                                                                                        
                }                                                                                                                                                       
        }                                                                                                                                                               
}                                      