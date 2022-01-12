import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Test{                                                                                                                                                      
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                int n;                                                                                                                                                  
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter number of students");                                                                                                         
                n=scan.nextInt();                                                                                                                                       
                                                                                                                                                                        
                Student s[]=new Student[n];                                                                                                                             
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter register No.");                                                                                                       
                        int regno=scan.nextInt();                                                                                                                       
                                                                                                                                                                        
                        System.out.println("Enter the number of courses you have enrolled");                                                                            
                        int m=scan.nextInt();                                                                                                                           
                                                                                                                                                                        
                        Course c[]=new Course[m];                                                                                                                       
                        int[] grades=new int[m];                                                                                                                        

                        for(int j=0;j<m;j++){                                                                                                                           

                                System.out.println("Enter the course details in which you are enrolled-Enter course Id");                                               
                                int courseid=scan.nextInt();                                                                                                            
                                                                                                                                                                        
                                String dummy=scan.nextLine();                                                                                                           

                                System.out.println("Enter the course name");                                                                                            
                                String coursename=scan.nextLine();                                                                                                      
                                                                                                                                                                        

                                System.out.println("Enter the number of credits");                                                                                      
                                int credits=scan.nextInt();                                                                                                             
                                                                                                                                                                        
                                c[j]=new Course(courseid,coursename,credits);                                                                                           
                                                                                                                                                                        
                                System.out.println("Enter the grade scored- 10(O)/9(A)/8(A+)/7(B+)/6(B)");                                                              
                                int grade=scan.nextInt();                                                                                                               

                                grades[j]=grade;                                                                                                                        
                                                                                                                                                                        
                        }                                                                                                                                               
                                                                                                                                                                        
                        s[i]=new Student(regno,c,grades);                                                                                                               
                        s[i].calculateCgpa();                                                                                                                           
                                                                                                                                                                        
                        System.out.println(s[i].toString());                                                                                                            
                                                                                                                                                                        
                }                                                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
}                                  