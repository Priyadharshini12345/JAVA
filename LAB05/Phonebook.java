import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Phonebook{                                                                                                                                                 
                                                                                                                                                                        
        String name;                                                                                                                                                    
        String category;                                                                                                                                                
        int primarycontact;                                                                                                                                             
        int secondarycontact;                                                                                                                                           
                                                                                                                                                                        
        Phonebook(String name,String category,int primarycontact,int secondarycontact){                                                                                 
                this.name=name;                                                                                                                                         
                this.category=category;                                                                                                                                 
                this.primarycontact=primarycontact;                                                                                                                     
                this.secondarycontact=secondarycontact;                                                                                                                 
        }                                                                                                                                                               
                                                                                                                                                                        
        public void display(){                                                                                                                                          
                System.out.println("NAME: "+this.name);                                                                                                                 
                System.out.println("CATEGORY: "+this.category);                                                                                                         
                System.out.println("PRIMARY CONTACT: "+this.primarycontact);                                                                                            
                System.out.println("SECONDARY CONTACT: "+this.secondarycontact);                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
}                                                                                                                                                                       
                                  