import java.util.Scanner;                                                                                                                                               
                                                                                                                                                                        
public class ReadMarks {                                                                                                                                                
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
        public static void main(String[] args) throws Exception {                                                                                                       
                                                                                                                                                                        

                                                                                                                                                                        
                                java.io.File file = new java.io.File("marks1.txt");                                                                                     
                                                                                                                                                                        
                                Scanner input = new Scanner(file);                                                                                                      
                                                                                                                                                                        

                                                                                                                                                                        
                                while (input.hasNext()) {                                                                                                               
                                                                                                                                                                        
                                         String firstName = input.next();                                                                                               
                                                                                                                                                                        
                                         int marks = input.nextInt();                                                                                                   
                                                                                                                                                                        
                                         System.out.println(                                                                                                            
                                                                                                                                                                        
                                         firstName + " " +  " " + marks);                                                                                               
                                                                                                                                                                        
                                         }                                                                                                                              
                                                                                                                                                                        

                                                                                                                                                                        
                                input.close();                                                                                                                          
                                                                                                                                                                        

                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
}           