import java.io.IOException;                                                                                                                                             
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
public class WriteMarks {                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
        public static void main(String[] args) throws IOException {                                                                                                     
                                                                                                                                                                        
                java.io.File file = new java.io.File("marks1.txt");                                                                                                     
                                                                                                                                                                        
                if (file.exists()) {                                                                                                                                    
                                                                                                                                                                        
                                System.out.println("File already exists");                                                                                              
                                                                                                                                                                        
                                System.exit(1);                                                                                                                         
                                                                                                                                                                        
                 }                                                                                                                                                      
                                                                                                                                                                        
                java.io.PrintWriter output = new java.io.PrintWriter(file);                                                                                             
                                                                                                                                                                        
                output.print("Sam ");                                                                                                                                   
                                                                                                                                                                        
                output.println(90);                                                                                                                                     
                                                                                                                                                                        
                output.print("Augusta ");                                                                                                                               
                                                                                                                                                                        
                output.println(85);                                                                                                                                     
                                                                                                                                                                        

                                                                                                                                                                        
                output.close();                                                                                                                                         
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
}         