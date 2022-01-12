import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
class MyException extends Exception{                                                                                                                                    
                                                                                                                                                                        
        private int detail;                                                                                                                                             
                                                                                                                                                                        
        MyException(int a){                                                                                                                                             
                detail=a;                                                                                                                                               
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                                                                                                                                                                        
                return "Negative Exception: Exception caught for "+detail;                                                                                              
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
public class Q1{                                                                                                                                                        
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                int n;                                                                                                                                                  
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    

                System.out.println("Enter n");                                                                                                                          
                n = scan.nextInt();                                                                                                                                     
                                                                                                                                                                        
                int[] arr=new int[n];                                                                                                                                   
                                                                                                                                                                        
                System.out.println("Enter elements: ");                                                                                                                 
                                                                                                                                                                        
                int max=Integer.MIN_VALUE;                                                                                                                              
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                                                                                                                                                                        
                        try{                                                                                                                                            
                                arr[i]=scan.nextInt();                                                                                                                  
                                                                                                                                                                        
                                if(arr[i]<0)                                                                                                                            
                                        throw new MyException(arr[i]);                                                                                                  
                                                                                                                                                                        
                                else                                                                                                                                    
                                        max=Math.max(arr[i],max);                                                                                                       
                                                                                                                                                                        
                        }                                                                                                                                               
                                                                                                                                                                        
                        catch(MyException e){                                                                                                                           
                                                                                                                                                                        
                                System.out.println(e.toString());                                                                                                       
                        }                                                                                                                                               
                                                                                                                                                                        
                        catch(InputMismatchException f){                                                                                                                
                                                                                                                                                                        
                                System.out.println("InputMisMatchException: Please enter Integer values");                                                              
                                i--;                                                                                                                                    
                                scan.nextLine();                                                                                                                        
                        }                                                                                                                                               
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                System.out.println("MAXIMUM ELEMENT: "+max);                                                                                                            
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
}                         