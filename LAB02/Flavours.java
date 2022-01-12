import java.util.*;                                                                                                                                                     
import java.lang.*;                                                                                                                                                     
                                                                                                                                                                        
public class Flavours{                                                                                                                                                  
          static final String[] FLAVOR={"Chocolate","Strawberry","Vanilla Fudge Swirl","Mint Chip","Mocha Almond Fudge","Mango","Praline Cream","Lichi"};               

                public String[] flavourSet(){                                                                                                                           

                String[] res=new String[FLAVOR.length];                                                                                                                 

                int[] pref=new int[FLAVOR.length];                                                                                                                      
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Rank your preference:\n");                                                                                                          
                                                                                                                                                                        
                System.out.println("Chocolate, Strawberry, Vanilla Fudge Swirl, Mint Chip, Mocha Almond Fudge, Mango, Paline Cream, Lichi");                            
                                                                                                                                                                        
                for(int i=0;i<FLAVOR.length;i++)                                                                                                                        
                        pref[i]=scan.nextInt();                                                                                                                         

                int k=1;                                                                                                                                                
                for(k=1;k<=pref.length;k++){                                                                                                                            
                for(int i=0;i<pref.length;i++){                                                                                                                         
                        if(pref[i]==k){                                                                                                                                 
                                res[k-1]=FLAVOR[i];                                                                                                                     
                                break;                                                                                                                                  
                        }                                                                                                                                               

                }                                                                                                                                                       
                }                                                                                                                                                       

                                                                                                                                                                        
                return res;                                                                                                                                             
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the number of users\n");                                                                                                      

                int n=scan.nextInt();                                                                                                                                   
                                                                                                                                                                        
                Flavours[] f=new Flavours[n];                                                                                                                           
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                                                                                                                                                                        
                        f[i]=new Flavours();                                                                                                                            

                        String[] result=f[i].flavourSet();                                                                                                              

                        System.out.println("User prefered flavours in decreasing order\n");                                                                             
                                                                                                                                                                        
                        for(String a:result)                                                                                                                            
                        System.out.print(a+", ");                                                                                                                       
                                                                                                                                                                        
                        System.out.println();                                                                                                                           
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                                           