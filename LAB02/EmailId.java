import java.util.*;                                                                                                                                                     
import java.lang.*;                                                                                                                                                     
                                                                                                                                                                        
public class EmailId{                                                                                                                                                   
        public static void main(String[] args){                                                                                                                         
                Scanner scan=new Scanner(System.in);                                                                                                                    

                System.out.println("Enter the number of email addresses you will enter:\t");                                                                            

                int n=scan.nextInt();                                                                                                                                   
                                                                                                                                                                        
                String[] email=new String[n];                                                                                                                           
                                                                                                                                                                        
                Scanner scan1=new Scanner(System.in);                                                                                                                   
                                                                                                                                                                        
                System.out.println("Enter the email addresses:");                                                                                                       

                for(int i=0;i<n;i++)                                                                                                                                    
                        email[i]=scan1.nextLine();                                                                                                                      
                                                                                                                                                                        
                int stud_count=0,prof_count=0;                                                                                                                          
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                        if(email[i].endsWith("@student.annauniv.edu"))                                                                                                  
                                stud_count++;                                                                                                                           
                        else if(email[i].endsWith("@prof.annauniv.edu"))                                                                                                
                                prof_count++;                                                                                                                           
                }                                                                                                                                                       
                                                                                                                                                                        
                System.out.println("-------------------------------------------------");                                                                                
                                                                                                                                                                        
                System.out.println("Number of student addresses: "+stud_count);                                                                                         
                                                                                                                                                                        
                System.out.println("Number of professor addresses: "+prof_count);                                                                                       
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
        }                                                                                                                                                               
}                           