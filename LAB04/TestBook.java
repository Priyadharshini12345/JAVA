import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class TestBook{                                                                                                                                                  
                                                                                                                                                                        
        static Book search(Book[] b,String title){                                                                                                                      
                                                                                                                                                                        
                for(int i=0;i<b.length;i++){                                                                                                                            
                        if((b[i].title).equals(title)){                                                                                                                 
                                return b[i];                                                                                                                            
                        }                                                                                                                                               
                }                                                                                                                                                       
                                                                                                                                                                        
                return null;                                                                                                                                            
        }                                                                                                                                                               
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         


                Scanner scan = new Scanner(System.in);                                                                                                                  
                                                                                                                                                                        
                int n;                                                                                                                                                  
                System.out.println("Enter the number of books\n");                                                                                                      
                n=scan.nextInt();                                                                                                                                       
                                                                                                                                                                        
                Book[] b=new Book[n];                                                                                                                                   
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                                                                                                                                                                        
                        String summy=scan.nextLine();                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter the name of the book");                                                                                               
                        String book=scan.nextLine();                                                                                                                    
                                                                                                                                                                        
                        System.out.println("Enter the author name of the book");                                                                                        
                        String author=scan.nextLine();                                                                                                                  
                                                                                                                                                                        
                        System.out.println("Enter the year of publishing");                                                                                             
                        int year=scan.nextInt();                                                                                                                        
                                                                                                                                                                        
                        System.out.println("Enter the price of the book");                                                                                              
                        double price=scan.nextDouble();                                                                                                                 
                                                                                                                                                                        
                        b[i]=new Book(book,author,year,price);                                                                                                          
                                                                                                                                                                        
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                String s=scan.nextLine();                                                                                                                               
                                                                                                                                                                        
                System.out.println("Enter the book you want to search");                                                                                                
                String sear=scan.nextLine();                                                                                                                            
                                                                                                                                                                        
//              TestBook tb=new TestBook();                                                                                                                             
                                                                                                                                                                        
                Book obj=search(b,sear);                                                                                                                                
                                                                                                                                                                        
                if(obj==null){                                                                                                                                          
                        System.out.println("Book with title  "+sear+"  is not found");                                                                                  
                }                                                                                                                                                       
                else{                                                                                                                                                   
                        System.out.println("Book found!");                                                                                                              
                        System.out.println("Book details:");                                                                                                            
                        System.out.println("BOOK: "+obj.title);                                                                                                         
                        System.out.println("AUTHOR: "+obj.authorName);                                                                                                  
                        System.out.println("YEAR: "+obj.year);                                                                                                          
                        System.out.println("PRICE: "+obj.price);                                                                                                        
                }                                                                                                                                                       
        }                                                                                                                                                               
}                                                 