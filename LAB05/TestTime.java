import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class TestTime{                                                                                                                                                  
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the number of users:\n");                                                                                                     
                int n=scan.nextInt();                                                                                                                                   
                                                                                                                                                                        
                Time[] t=new Time[n];                                                                                                                                   
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter your current time(hour)\n");                                                                                          
                        int hour=scan.nextInt();                                                                                                                        
                                                                                                                                                                        
                        System.out.println("Enter your current time(minutes)\n");                                                                                       
                        int minutes=scan.nextInt();                                                                                                                     
                                                                                                                                                                        
                        System.out.println("Enter your current time(seconds)\n");                                                                                       
                        int seconds=scan.nextInt();                                                                                                                     

                        t[i]=new Time(seconds,minutes,hour);                                                                                                            
                                                                                                                                                                        
                        System.out.println("Enter the time in seconds you want ahead\n");                                                                               
                        int val=scan.nextInt();                                                                                                                         
                                                                                                                                                                        
                        t[i].increment(val);                                                                                                                            
                                                                                                                                                                        
                        System.out.println("1. 24-HOUR CLOCK    2. 12-HOUR CLOCK");                                                                                     
                        System.out.println("Enter your choice\n");                                                                                                      
                                                                                                                                                                        
                        int choice=scan.nextInt();                                                                                                                      
                                                                                                                                                                        
                        t[i].display(choice);                                                                                                                           
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
        }                                                                                                                                                               
}                                                                                                                                                                       
                                      