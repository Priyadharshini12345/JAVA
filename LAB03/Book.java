import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Book{                                                                                                                                                      
                                                                                                                                                                        
        String title;                                                                                                                                                   
        String authorName;                                                                                                                                              
        int year;                                                                                                                                                       
        double price;                                                                                                                                                   
                                                                                                                                                                        
        Book(){                                                                                                                                                         
                title="Nil";                                                                                                                                            
                authorName="Nil";                                                                                                                                       
                year=0;                                                                                                                                                 
                price=0.00;                                                                                                                                             
                System.out.println("Default constructor called\n");                                                                                                     
        }                                                                                                                                                               
                                                                                                                                                                        
        Book(String title,String authorName,int year,double price){                                                                                                     
                this.title=title;                                                                                                                                       
                this.authorName=authorName;                                                                                                                             
                this.year=year;                                                                                                                                         
                this.price=price;                                                                                                                                       
//              System.out.println("Parameterized constructor called\n");                                                                                               
        }                                                                                                                                                               
                                                                                                                                                                        
        public void display(){                                                                                                                                          
                                                                                                                                                                        
                System.out.printf("Title: %s\t AuthorName: %s\t Year of publication: %d\t Price: %f\n",this.title,this.authorName,this.year,this.price);                
                                                                                                                                                                        
        }                                                                                                                                                               
}                                                            