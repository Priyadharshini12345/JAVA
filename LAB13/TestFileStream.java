import java.io.*;                                                                                                                                                       
                                                                                                                                                                        
public class TestFileStream {                                                                                                                                           
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
        public static void main(String[] args) throws IOException{                                                                                                      
                                                                                                                                                                        

                                                                                                                                                                        

                                                                                                                                                                        
                 // Create an output stream to the file                                                                                                                 
                                                                                                                                                                        
                FileOutputStream output = new FileOutputStream("sample.dat");                                                                                           
                                                                                                                                                                        
                 // Output values to the file                                                                                                                           
                                                                                                                                                                        

                                                                                                                                                                        
                 for (int i = 1; i <= 10; i++)                                                                                                                          
                                                                                                                                                                        
                         output.write(i);                                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        
                 // Close the output stream                                                                                                                             
                                                                                                                                                                        
                output.close();                                                                                                                                         
                                                                                                                                                                        

                                                                                                                                                                        
                FileInputStream input = new FileInputStream("sample.dat");                                                                                              
                                                                                                                                                                        

                                                                                                                                                                        
                int value;                                                                                                                                              
                                                                                                                                                                        
                while ((value = input.read() ) != -1)       //no byte to be read returns -1                                                                             
                                                                                                                                                                        
                         System.out.print(value + " ");                                                                                                                 
                                                                                                                                                                        

                                                                                                                                                                        
                input.close();                                                                                                                                          
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
}                              