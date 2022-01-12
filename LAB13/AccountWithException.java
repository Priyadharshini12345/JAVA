import java.io.*;                                                                                                                                                       
import java.nio.*;                                                                                                                                                      
import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class AccountWithException{                                                                                                                                      
                                                                                                                                                                        
        String name;                                                                                                                                                    
        double bal;                                                                                                                                                     
        int accno;                                                                                                                                                      
                                                                                                                                                                        
        AccountWithException(){                                                                                                                                         
        }                                                                                                                                                               
                                                                                                                                                                        
        public void AccountWithException(String s,double b,int ac) throws IllegalArgumentException{                                                                     
                name=s;                                                                                                                                                 
                bal=b;                                                                                                                                                  
                accno=ac;                                                                                                                                               
        }                                                                                                                                                               
                                                                                                                                                                        
        public void initName(String nm) throws IllegalArgumentException{                                                                                                
                                                                                                                                                                        
                if(nm.length()==0)                                                                                                                                      
                        throw new IllegalArgumentException();                                                                                                           
                else                                                                                                                                                    
                        name=nm;                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public static void method1() throws Exception{                                                                                                                  
                try{                                                                                                                                                    
                        method2();                                                                                                                                      
                }                                                                                                                                                       
                                                                                                                                                                        
                catch(Exception e){                                                                                                                                     
                        throw new Exception("method1",e);                                                                                                               
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public static void method2() throws Exception{                                                                                                                  
                throw new Exception("From method 2");                                                                                                                   
        }                                                                                                                                                               
                                                                                                                                                                        
}                                                  