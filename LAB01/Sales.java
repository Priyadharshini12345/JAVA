import java.util.*;                                                                                                                                                     
public class Sales{                                                                                                                                                     
        public static void main(String[] args){                                                                                                                         
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the target amount: \n");                                                                                                      
                int amt=scan.nextInt();                                                                                                                                 
                                                                                                                                                                        
                if(amt<5000){                                                                                                                                           
                        System.out.println("Invalid commision since target is less than the base salary");                                                              
                        return;                                                                                                                                         
                }                                                                                                                                                       
                                                                                                                                                                        
                int commision=amt-5000;                                                                                                                                 
                                                                                                                                                                        
                double salesAmt,one=5000*0.08,two=10000*0.1;                                                                                                            
                                                                                                                                                                        
                if(commision<one)                                                                                                                                       
                        salesAmt=commision/0.08;                                                                                                                        
                else if(commision<two)                                                                                                                                  
                        salesAmt=commision/0.1;                                                                                                                         
                else                                                                                                                                                    
                        salesAmt=commision/0.12;                                                                                                                        
                                                                                                                                                                        
                System.out.println("Minimum Sales amount: "+salesAmt);                                                                                                  
        }                                                                                                                                                               
}                                                