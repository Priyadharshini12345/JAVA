import java.util.*;                                                                                                                                                     
import java.lang.*;                                                                                                                                                     
                                                                                                                                                                        
public class Palinprime{                                                                                                                                                
        public static void PalindromicPrime(int n){                                                                                                                     

                for(int i=2;i<=n;i++){                                                                                                                                  
                        int flag=0;                                                                                                                                     
                        for(int j=2;j<=i/2;j++){                                                                                                                        
                                if(i%j==0){                                                                                                                             
                                        flag=1;                                                                                                                         
                                        break;                                                                                                                          
                                }                                                                                                                                       
                        }                                                                                                                                               
                        if(flag==0){                                                                                                                                    
                                int rev=0;                                                                                                                              
                                int sum=i;                                                                                                                              
                                int n1=i;                                                                                                                               
                                while(n1>0){                                                                                                                            
                                        int rem=n1%10;                                                                                                                  
                                        rev=rev*10+rem;                                                                                                                 
                                        n1=n1/10;                                                                                                                       
                                }                                                                                                                                       
                                if(sum==rev)                                                                                                                            
                                        System.out.print(i+" ");                                                                                                        
                        }                                                                                                                                               
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the value of n:");                                                                                                            
                int n=scan.nextInt();                                                                                                                                   
                                                                                                                                                                        
                System.out.println("Palindromic Prime numbers upto "+n+" are: ");                                                                                       
                PalindromicPrime(n);                                                                                                                                    
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
                System.out.println();                                                                                                                                   
        }                                                                                                                                                               
}                                  