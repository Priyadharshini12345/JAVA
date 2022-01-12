import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Prgm2{                                                                                                                                                     
                                                                                                                                                                        
        public static void printIntegers() throws InputMismatchException{                                                                                               
                                                                                                                                                                        
                        Scanner scan=new Scanner(System.in);                                                                                                            
                                                                                                                                                                        
                        System.out.println("Enter n: ");                                                                                                                
                                                                                                                                                                        
                        int n=scan.nextInt();                                                                                                                           
                                                                                                                                                                        
                        int[] arr=new int[n];                                                                                                                           
                                                                                                                                                                        
                        System.out.println("Enter the elements: ");                                                                                                     
                                                                                                                                                                        
                        int i=0;                                                                                                                                        
                                                                                                                                                                        
                        while(i<n){                                                                                                                                     
                                                                                                                                                                        
                        try{                                                                                                                                            
                                                                                                                                                                        
                                        arr[i]=scan.nextInt();                                                                                                          
                                                                                                                                                                        
                                        if(Character.isLetter(arr[i]))                                                                                                  
                                                                                                                                                                        
                                                throw new InputMismatchException("demo");                                                                               
                                                                                                                                                                        
                                        else                                                                                                                            
                                                System.out.println("OUTPUT: "+arr[i]);                                                                                  
                        }                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
                        catch(InputMismatchException e){                                                                                                                
                                                                                                                                                                        
                                System.out.println("***");                                                                                                              
                                i--;                                                                                                                                    
                                scan.nextLine();                                                                                                                        

                        }                                                                                                                                               
                                                                                                                                                                        
                        i++;                                                                                                                                            
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               

        public static void main(String args[]){                                                                                                                         
                                                                                                                                                                        
                printIntegers();                                                                                                                                        
                                                                                                                                                                        
        }                                                                                                                                                               
}                                     