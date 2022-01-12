import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class CourseTest{                                                                                                                                                
        public static void main(String args[]){                                                                                                                         
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the number of courses\n");                                                                                                    
                int n=scan.nextInt();                                                                                                                                   
                                                                                                                                                                        
                                                                                                                                                                        
                Course c[]=new Course[n];                                                                                                                               
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                                                                                                                                                                        
                        String dummy=scan.nextLine();                                                                                                                   

                        System.out.println("Enter the course name");                                                                                                    
                        String courseName=scan.nextLine();                                                                                                              
                                                                                                                                                                        
                        System.out.println("Enter the course instructor");                                                                                              
                        String courseInstructor=scan.nextLine();                                                                                                        
                                                                                                                                                                        
                        System.out.println("Enter the number of hours");                                                                                                
                        int noofHours=scan.nextInt();                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter the number of credits");                                                                                              
                        int noofCredits=scan.nextInt();                                                                                                                 
                                                                                                                                                                        
                        c[i]=new Course(courseName,courseInstructor,noofHours,noofCredits);                                                                             
                                                                                                                                                                        
                        System.out.println("Enter the number of students to add into "+courseName+" course");                                                           
                        int n1=scan.nextInt();                                                                                                                          

                        Course.enroll(n1);                                                                                                                              
                                                                                                                                                                        
                        System.out.println("Enter the number of students to drop from "+courseName+" course");                                                          
                        int n2=scan.nextInt();                                                                                                                          
                                                                                                                                                                        
                        Course.drop(n2);                                                                                                                                
                                                                                                                                                                        
                        System.out.println(c[i].toString());                                                                                                            
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                                  