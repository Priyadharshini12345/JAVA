import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class RationalTest{                                                                                                                                              
                                                                                                                                                                        
        public static void main(String args[]){                                                                                                                         
                                                                                                                                                                        
                int num,den;                                                                                                                                            
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the numerator:");                                                                                                             
                num=scan.nextInt();                                                                                                                                     
                                                                                                                                                                        
                System.out.println("Enter the denominator:");                                                                                                           
                den=scan.nextInt();                                                                                                                                     
                                                                                                                                                                        
                System.out.println("Enter the number by which you want to increment\n");                                                                                
                int val=scan.nextInt();                                                                                                                                 
                                                                                                                                                                        
                Rational r1=new Rational();                                                                                                                             

                System.out.println("Using Default Constructor:");                                                                                                       

                System.out.println("Before increment\n");                                                                                                               

                r1.display();                                                                                                                                           
                                                                                                                                                                        
                r1.increment(val);                                                                                                                                      
                                                                                                                                                                        
                System.out.println("After increment\n");                                                                                                                
                                                                                                                                                                        
                r1.display();                                                                                                                                           
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
                                                                                                                                                                        
                Rational r2=new Rational(num,den);                                                                                                                      

                System.out.println("Using Parameterized Constructor");                                                                                                  
                                                                                                                                                                        
                System.out.println("Before increment");                                                                                                                 

                r2.display();                                                                                                                                           
                                                                                                                                                                        
                System.out.println("After increment");                                                                                                                  
                                                                                                                                                                        
                r2.increment(val);                                                                                                                                      
                                                                                                                                                                        
                r2.display();                                                                                                                                           
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
                                                                                                                                                                        
        }                                                                                                                                                               
}                                              