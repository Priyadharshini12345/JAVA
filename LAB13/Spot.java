//CHARACTER COUNT                                                                                                                                                       
import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
import java.io.*;                                                                                                                                                       
                                                                                                                                                                        
public class Spot{                                                                                                                                                      
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                try{                                                                                                                                                    
                                                                                                                                                                        
                File file=new File("Sample.txt");                                                                                                                       
                                                                                                                                                                        
                FileInputStream fileinputstream=new FileInputStream(file);                                                                                              
                                                                                                                                                                        
                InputStreamReader inputstreamreader=new InputStreamReader(fileinputstream);                                                                             
                                                                                                                                                                        
                BufferedReader bufferedreader=new BufferedReader(inputstreamreader);                                                                                    
                                                                                                                                                                        
                String line;                                                                                                                                            
                                                                                                                                                                        
                int charactercount=0;                                                                                                                                   
                                                                                                                                                                        
                while((line=bufferedreader.readLine())!=null){                                                                                                          
                                                                                                                                                                        
                        charactercount+=line.length();                                                                                                                  
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                System.out.println("CHARACTER COUNT: "+charactercount);                                                                                                 
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                catch(FileNotFoundException e){                                                                                                                         
                                                                                                                                                                        
                        System.out.println(e);                                                                                                                          
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                catch(IOException e){                                                                                                                                   
                                                                                                                                                                        
                        System.out.print(e);                                                                                                                            
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
}                     