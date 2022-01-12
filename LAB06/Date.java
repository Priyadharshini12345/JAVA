import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Date{                                                                                                                                                      
                                                                                                                                                                        
        int date;                                                                                                                                                       
        int month;                                                                                                                                                      
        int year;                                                                                                                                                       
                                                                                                                                                                        
        Date(){                                                                                                                                                         
                date=0;                                                                                                                                                 
                month=0;                                                                                                                                                
                year=0;                                                                                                                                                 
        }                                                                                                                                                               
                                                                                                                                                                        
        Date(int date,int month,int year){                                                                                                                              
                                                                                                                                                                        
                this.date=date;                                                                                                                                         
                this.month=month;                                                                                                                                       
                this.year=year;                                                                                                                                         
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                                                                                                                                                                        
                return String.format("%d/%d/%d",date,month,year);                                                                                                       
        }                                                                                                                                                               
}                                                    