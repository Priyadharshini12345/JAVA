import java.io.EOFException;                                                                                                                                            

                                                                                                                                                                        
import java.io.IOException;                                                                                                                                             

                                                                                                                                                                        
import java.io.ObjectInputStream;                                                                                                                                       

                                                                                                                                                                        
import java.nio.file.Files;                                                                                                                                             

                                                                                                                                                                        
import java.nio.file.Paths;                                                                                                                                             

                                                                                                                                                                        
public class ReadFile {                                                                                                                                                 

                                                                                                                                                                        
                private static ObjectInputStream input;                                                                                                                 

                                                                                                                                                                        
                public static void main(String[] args)                                                                                                                  

                                                                                                                                                                        
                 {                                                                                                                                                      

                                                                                                                                                                        
                         openFile();                                                                                                                                    

                                                                                                                                                                        
                         readRecords();                                                                                                                                 

                                                                                                                                                                        
                         closeFile();                                                                                                                                   

                                                                                                                                                                        


                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        


                                                                                                                                                                        
                 // enable user to select file to open                                                                                                                  

                                                                                                                                                                        
                 public static void openFile()                                                                                                                          

                                                                                                                                                                        
                 {                                                                                                                                                      

                                                                                                                                                                        
                         try // open file                                                                                                                               

                                                                                                                                                                        
                         {                                                                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                                 input = new ObjectInputStream(Files.newInputStream(Paths.get("clients.ser")));                                                         

                                                                                                                                                                        
                         }                                                                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                         catch (IOException ioException)                                                                                                                

                                                                                                                                                                        


                                                                                                                                                                        
                         {                                                                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                                System.err.println("Error opening file.");                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                                 System.exit(1);                                                                                                                        

                                                                                                                                                                        

                                                                                                                                                                        
                         }                                                                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                 }                                                                                                                                                      

                                                                                                                                                                        


                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        


                                                                                                                                                                        
                         // read record from file                                                                                                                       

                                                                                                                                                                        


                                                                                                                                                                        
                         public static void readRecords()                                                                                                               

                                                                                                                                                                        


                                                                                                                                                                        
                         {                                                                                                                                              

                                                                                                                                                                        

                                                                                                                                                                        
                                 System.out.printf("%s %s %s \n", "Name", "Balance","Account Number");                                                                  

                                                                                                                                                                        




                                 try                                                                                                                                    



                                                                                                                                                                        
                                 {                                                                                                                                      

                                                                                                                                                                        


                                                                                                                                                                        
                                         while (true) // loop until there is an EOFException                                                                            



                                         {                                                                                                                              


                                                                                                                                                                        
                                                 Account record = (Account) input.readObject();                                                                         

                                                                                                                                                                        


                                                 System.out.printf("%10s %10.2f %10d \n",record.getName(),record.getBalance(), record.getAccount());                    



                                                                                                                                                                        
                                         }                                                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                                    }                                                                                                                                   
                                                                                                                                                                        
                                catch(IOException e){                                                                                                                   
                                                                                                                                                                        
                        //              System.out.println(e);                                                                                                          
                                                                                                                                                                        
                                }                                                                                                                                       
                        catch(ClassNotFoundException e){                                                                                                                
                                                                                                                                                                        
                                System.out.print(e);                                                                                                                    
                                                                                                                                                                        
                        }                                                                                                                                               

                                                                                                                                                                        
                         }                                                                                                                                              
                                                                                                                                                                        
                public static void closeFile()                                                                                                                          

                                                                                                                                                                        

                                                                                                                                                                        
                                 {                                                                                                                                      

                                                                                                                                                                        


                                                                                                                                                                        
                                         try                                                                                                                            

                                                                                                                                                                        


                                                                                                                                                                        
                                         {                                                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                                                 if (input != null)                                                                                                     

                                                                                                                                                                        


                                                                                                                                                                        
                                                         input.close();                                                                                                 

                                                                                                                                                                        


                                                                                                                                                                        
                                         }                                                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                                         catch (IOException ioException)                                                                                                

                                                                                                                                                                        


                                                                                                                                                                        
                                         {                                                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                                                 System.err.println("Error closing file. Terminating.");                                                                

                                                                                                                                                                        


                                                                                                                                                                        
                                                 System.exit(1);                                                                                                        

                                                                                                                                                                        


                                                                                                                                                                        
                                         }                                                                                                                              

                                                                                                                                                                        


                                                                                                                                                                        
                                         }                                                                                                                              
                                                                                                                                                                        

                                                                                                                                                                        

                                                                                                                                                                        
}                                            