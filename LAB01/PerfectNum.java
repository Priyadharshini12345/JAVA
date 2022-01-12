import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class PerfectNum{                                                                                                                                                
        public static void main(String[] args){                                                                                                                         
                int num=10000;                                                                                                                                          
                int i=2;                                                                                                                                                
                int rem=0;                                                                                                                                              
                                                                                                                                                                        
                System.out.print("Perfect Numbers within 10000 are:\n");                                                                                                
                                                                                                                                                                        
                while(i<=10000){                                                                                                                                        
                        int sum=0;                                                                                                                                      
                        for(int j=1;j<i;j++){                                                                                                                           
                                rem=i%j;                                                                                                                                
                                if(rem==0){                                                                                                                             
                                        sum=sum+j;                                                                                                                      
                                }                                                                                                                                       
                        }                                                                                                                                               
                        if(sum==i)                                                                                                                                      
                                System.out.print(i+" ");                                                                                                                
                        i++;                                                                                                                                            
                }                                                                                                                                                       
                                                                                                                                                                        
                System.out.println();                                                                                                                                   
        }                                                                                                                                                               
}                                   