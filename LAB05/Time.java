import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Time{                                                                                                                                                      
                                                                                                                                                                        
        int seconds;                                                                                                                                                    
        int minutes;                                                                                                                                                    
        int hour;                                                                                                                                                       
                                                                                                                                                                        
        Time(){                                                                                                                                                         
                seconds=0;                                                                                                                                              
                minutes=0;                                                                                                                                              
                hour=0;                                                                                                                                                 
        }                                                                                                                                                               
                                                                                                                                                                        
        Time(int seconds,int minutes,int hour){                                                                                                                         
                if(seconds>=0 && seconds<=59){                                                                                                                          
                        this.seconds=seconds;}                                                                                                                          
                else{                                                                                                                                                   
                        System.out.println("Invalid seconds.(so the system considers 0)");}                                                                             
                if(minutes>=0 && minutes<=59){                                                                                                                          
                        this.minutes=minutes;}                                                                                                                          
                else{                                                                                                                                                   
                        System.out.println("Invalid minutes.(so the system considers 0)");}                                                                             
                this.hour=hour;                                                                                                                                         
        }                                                                                                                                                               
                                                                                                                                                                        
        public void increment(int val){                                                                                                                                 

                if(val<0){                                                                                                                                              
                        System.out.println("Invalid Value\n");                                                                                                          
                }                                                                                                                                                       
                                                                                                                                                                        
                else                                                                                                                                                    
                        seconds+=val;                                                                                                                                   
                                                                                                                                                                        
                if(seconds>=60){                                                                                                                                        
                        minutes+=seconds/60;                                                                                                                            
                        seconds=seconds%60;                                                                                                                             
                }                                                                                                                                                       
                                                                                                                                                                        
                if(minutes>=60){                                                                                                                                        
                        hour+=minutes/60;                                                                                                                               
                        minutes=minutes%60;                                                                                                                             
                }                                                                                                                                                       
                                                                                                                                                                        
                if(hour>=24){                                                                                                                                           
                        hour=hour%24;                                                                                                                                   
                }                                                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        public void display(int choice){                                                                                                                                

                if(choice==2){                  //12-hour clock                                                                                                         
                        System.out.println("Time: "+this.hour+":"+this.minutes+":"+this.seconds);                                                                       
                }                                                                                                                                                       
                                                                                                                                                                        
                else if(choice==1){                                                                                                                                     
                        //24-hour clock                                                                                                                                 
                        Scanner scan = new Scanner(System.in);                                                                                                          
                        System.out.println("Enter am/pm");                                                                                                              
                        String check=scan.nextLine();                                                                                                                   
                                                                                                                                                                        
                        System.out.print("Time: ");                                                                                                                     

                        if(check.equals("pm")){                                                                                                                         
                                System.out.print((this.hour+12)+":");                                                                                                   
                        }                                                                                                                                               
                        else                                                                                                                                            
                                System.out.print(this.hour+":");                                                                                                        
                                                                                                                                                                        
                        System.out.print(this.minutes+":"+this.seconds+"\n");                                                                                           
                }                                                                                                                                                       
                                                                                                                                                                        
                else                                                                                                                                                    
                        System.out.println("Invalid choice!\n");                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                return "Time: "+this.hour+":"+this.minutes+":"+this.seconds;                                                                                            
        }                                                                                                                                                               
}                                                                                                                                                                       
                             