import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class TestPhoneBook{                                                                                                                                             
                                                                                                                                                                        
        static Phonebook search(Phonebook[] p,String name){                                                                                                             
                                                                                                                                                                        
                for(Phonebook a:p){                                                                                                                                     
                                                                                                                                                                        
                        if((a.name).equals(name))                                                                                                                       
                                return a;                                                                                                                               

                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                return null;                                                                                                                                            
        }                                                                                                                                                               
                                                                                                                                                                        
        static int find(String[] category){                                                                                                                             
                int count=0;                                                                                                                                            
                                                                                                                                                                        
                for(String a:category){                                                                                                                                 
                                                                                                                                                                        
                        if(a.equals("relatives"))                                                                                                                       
                                count++;                                                                                                                                
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                return count;                                                                                                                                           
        }                                                                                                                                                               
        public static void main(String[] args){                                                                                                                         
                                                                                                                                                                        
                int n;                                                                                                                                                  
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the number of entries:\n");                                                                                                   
                n=scan.nextInt();                                                                                                                                       
                                                                                                                                                                        
                Phonebook[] p=new Phonebook[n];                                                                                                                         
                                                                                                                                                                        
                String names[]=new String[n];                                                                                                                           
                String categories[]=new String[n];                                                                                                                      

                for(int i=0;i<n;i++){                                                                                                                                   
                        String dummy=scan.nextLine();                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter your name\n");                                                                                                        
                        String name=scan.nextLine();                                                                                                                    
                                                                                                                                                                        
                        System.out.println("Enter the category: friends/relatives/business/official");                                                                  
                        String category=scan.nextLine();                                                                                                                
                                                                                                                                                                        
                        System.out.println("Enter your primary contact no:\n");                                                                                         
                        int primaryc=scan.nextInt();                                                                                                                    
                                                                                                                                                                        
                        System.out.println("Enter your secondary contact no:\n");                                                                                       
                        int secondaryc=scan.nextInt();                                                                                                                  
                                                                                                                                                                        
                        p[i]=new Phonebook(name,category,primaryc,secondaryc);                                                                                          
                                                                                                                                                                        
                        names[i]=p[i].name;                                                                                                                             
                        categories[i]=p[i].category;                                                                                                                    
                                                                                                                                                                        
                        p[i].display();                                                                                                                                 
                }                                                                                                                                                       
                                                                                                                                                                        
                String dummy=scan.nextLine();                                                                                                                           
                                                                                                                                                                        
                System.out.println("Enter the name you want to search in phonebook\n");                                                                                 
                String name=scan.nextLine();                                                                                                                            
                                                                                                                                                                        
                Phonebook check=search(p,name);                                                                                                                         
                                                                                                                                                                        
                check.display();                                                                                                                                        
                                                                                                                                                                        
                int count=find(categories);                                                                                                                             
                                                                                                                                                                        
                System.out.println("\nNumber of relative names in the phonebook: "+count);                                                                              
                                                                                                                                                                        
                                                                                                                                                                        
        }                                                                                                                                                               
}                                  