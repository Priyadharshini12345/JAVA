import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class GuessNum{                                                                                                                                                  
        public int drawNumber;                                                                                                                                          
                                                                                                                                                                        
        public GuessNum(){                                                                                                                                              
                this.drawNumber=45;                                                                                                                                     
        }                                                                                                                                                               
                                                                                                                                                                        
        public void GuessandTell(){                                                                                                                                     
                int Num;                                                                                                                                                
                int flag=0;                                                                                                                                             
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
                System.out.println("Enter a number in the range 0 to 100(inclusive)");                                                                                  
                                                                                                                                                                        
                while(flag==0){                                                                                                                                         
                        Scanner scan=new Scanner(System.in);                                                                                                            
                        Num=scan.nextInt();                                                                                                                             

                        if(Num==drawNumber){                                                                                                                            
                                System.out.println("Congratulations,your guess is correct!");                                                                           
                                flag=1;                                                                                                                                 
                                break;                                                                                                                                  
                        }                                                                                                                                               
                        else if(Num<drawNumber)                                                                                                                         
                                System.out.println("The number is lesser");                                                                                             
                        else                                                                                                                                            
                                System.out.println("The number is greater");                                                                                            
                }                                                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                GuessNum g=new GuessNum();                                                                                                                              
                g.GuessandTell();                                                                                                                                       
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
                          