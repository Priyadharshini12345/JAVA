import java.util.*;                                                                                                                                                     
import java.lang.*;                                                                                                                                                     
                                                                                                                                                                        
public class Doublecheck{                                                                                                                                               
        public boolean equalTo(double n1,double n2){                                                                                                                    
                Double obj1=new Double(n1);                                                                                                                             
                                                                                                                                                                        
                Double obj2=new Double(n2);                                                                                                                             

                if(obj1.equals(obj2))                                                                                                                                   
                        return true;                                                                                                                                    

                return false;                                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public boolean equalTo(String a,String b){                                                                                                                      
                if(a.length()!=b.length())                                                                                                                              
                        return false;                                                                                                                                   
                                                                                                                                                                        
                char[] arr1=a.toCharArray();                                                                                                                            
                char[] arr2=b.toCharArray();                                                                                                                            
                                                                                                                                                                        
                Arrays.sort(arr1);                                                                                                                                      
                Arrays.sort(arr2);                                                                                                                                      
                                                                                                                                                                        
                for(int i=0;i<a.length();i++){                                                                                                                          
                        if(arr1[i]!=arr2[i])                                                                                                                            
                                return false;                                                                                                                           
                }                                                                                                                                                       
                                                                                                                                                                        
                return true;                                                                                                                                            
        }                                                                                                                                                               
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter two double values to compare:");                                                                                              
                                                                                                                                                                        
                double a=scan.nextDouble();                                                                                                                             
                double b=scan.nextDouble();                                                                                                                             
                                                                                                                                                                        
                Doublecheck d=new Doublecheck();                                                                                                                        
                                                                                                                                                                        
                boolean result=d.equalTo(a,b);                                                                                                                          
                                                                                                                                                                        
                if(result==true)                                                                                                                                        
                        System.out.println("Equal!");                                                                                                                   
                else                                                                                                                                                    
                        System.out.println("Unequal!");                                                                                                                 
                                                                                                                                                                        

                System.out.println("Enter two strings:");                                                                                                               
                String a1=scan.next();                                                                                                                                  
                                                                                                                                                                        
                String b1=scan.next();                                                                                                                                  
                                                                                                                                                                        
                boolean res=d.equalTo(a1,b1);                                                                                                                           
                if(res==true)                                                                                                                                           
                        System.out.println("Anagrams");                                                                                                                 
                else                                                                                                                                                    
                        System.out.println("Not Anagrams");                                                                                                             
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
}                                                                                                                                                                       
                                         