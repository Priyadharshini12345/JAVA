import java.io.IOException;                                                                                                                                             

                                                                                                                                                                        
import java.io.ObjectOutputStream;                                                                                                                                      

                                                                                                                                                                        
import java.nio.file.Files;                                                                                                                                             

                                                                                                                                                                        
import java.nio.file.Paths;                                                                                                                                             

                                                                                                                                                                        
import java.util.NoSuchElementException;                                                                                                                                

                                                                                                                                                                        
import java.util.Scanner;                                                                                                                                               

                                                                                                                                                                        
public class CreateFile {                                                                                                                                               

                                                                                                                                                                        
        private static ObjectOutputStream output;                                                                                                                       

                                                                                                                                                                        
        public static void main(String[] args)                                                                                                                          

                                                                                                                                                                        
         {                                                                                                                                                              

                                                                                                                                                                        
                openFile();                                                                                                                                             

                                                                                                                                                                        
                addRecords();                                                                                                                                           

                                                                                                                                                                        
                closeFile();                                                                                                                                            

                                                                                                                                                                        


                                                                                                                                                                        
         }                                                                                                                                                              

                                                                                                                                                                        
         // open file clients.ser                                                                                                                                       

                                                                                                                                                                        
         public static void openFile()                                                                                                                                  

                                                                                                                                                                        
         {                                                                                                                                                              

                                                                                                                                                                        
                 try                                                                                                                                                    

                                                                                                                                                                        
                 {                                                                                                                                                      

                                                                                                                                                                        
                         output = new ObjectOutputStream(Files.newOutputStream(Paths.get("clients.ser")));                                                              

                                                                                                                                                                        
                 }                                                                                                                                                      

                                                                                                                                                                        
                 catch (IOException ioException)                                                                                                                        

                                                                                                                                                                        
                 {                                                                                                                                                      

                                                                                                                                                                        
                         System.err.println("Error opening file. Terminating.");                                                                                        

                                                                                                                                                                        
                         System.exit(1); // terminate the program                                                                                                       

                                                                                                                                                                        
                 }                                                                                                                                                      

                                                                                                                                                                        
         }                                                                                                                                                              

                                                                                                                                                                        
         public static void addRecords()                                                                                                                                

                                                                                                                                                                        
         {                                                                                                                                                              

                                                                                                                                                                        
          Scanner input = new Scanner(System.in);                                                                                                                       

                                                                                                                                                                        
          System.out.printf("%s%s ", "Enter account name, balance and account number","Enter end-of-file indicator to end input.");                                     

                                                                                                                                                                        
     //     while () // loop until end-of-file indicator                                                                                                                

                                                                                                                                                                        
   //             {                                                                                                                                                     

                                                                                                                                                                        
                  try                                                                                                                                                   

                                                                                                                                                                        
                  {                                                                                                                                                     

                                                                                                                                                                        
                          // create new record; this example assumes valid input                                                                                        

                                                                                                                                                                        
                          Account record = new Account(input.next(), input.nextDouble(),input.nextInt());                                                               

                                                                                                                                                                        
                         output.writeObject(record);                                                                                                                    

                                                                                                                                                                        
                  }                                                                                                                                                     

                                                                                                                                                                        
                  catch (NoSuchElementException elementException)                                                                                                       

                                                                                                                                                                        
                  {                                                                                                                                                     

                                                                                                                                                                        
                  System.err.println("Invalid input. Please try again.");                                                                                               

                                                                                                                                                                        
                  input.nextLine(); // discard input so user can try again                                                                                              

                                                                                                                                                                        
                  }                                                                                                                                                     

                                                                                                                                                                        
                  catch (IOException ioException)                                                                                                                       

                                                                                                                                                                        
                  {                                                                                                                                                     

                                                                                                                                                                        
                          System.err.println("Error writing to file. Terminating.");                                                                                    

                                                                                                                                                                        
                   //       break;                                                                                                                                      

                                                                                                                                                                        
                  }                                                                                                                                                     
                                                                                                                                                                        
                                                                                                                                                                        
        //          System.out.print("? ");                                                                                                                             

                                                                                                                                                                        
       //         }                                                                                                                                                     

                                                                                                                                                                        
          }                                                                                                                                                             

                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
          // close file and terminate application                                                                                                                       

                                                                                                                                                                        
          public static void closeFile()                                                                                                                                

                                                                                                                                                                        
          {                                                                                                                                                             

                                                                                                                                                                        
          try                                                                                                                                                           

                                                                                                                                                                        
                  {                                                                                                                                                     

                                                                                                                                                                        
                          if (output != null)                                                                                                                           

                                                                                                                                                                        
                                  output.close();                                                                                                                       

                                                                                                                                                                        
                  }                                                                                                                                                     

                                                                                                                                                                        
                  catch (IOException e)                                                                                                                                 

                                                                                                                                                                        
                  {                                                                                                                                                     
                         System.out.println(e);                                                                                                                         
                                                                                                                                                                        
                  }                                                                                                                                                     
          }                                                                                                                                                             
                                                                                                                                                                        
}                                           