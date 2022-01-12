import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class BookTest{                                                                                                                                                  
                                                                                                                                                                        
        public static Boolean checkDup(String[] title,String[] author,int[] year,double price[]){                                                                       
                for(int i=0;i<title.length;i++){                                                                                                                        
                        Double obj1=price[i];                                                                                                                           
                        for(int j=0;j<title.length;j++){                                                                                                                
                                Double obj2=price[j];                                                                                                                   
                                if(i!=j && title[i].equals(title[j]) && author[i].equals(author[j]) && year[i]==year[j] && obj1.equals(obj2)){                          
                                        return true;                                                                                                                    
                                }                                                                                                                                       
                        }                                                                                                                                               
                                                                                                                                                                        
                //      return false;                                                                                                                                   
                }                                                                                                                                                       
                return false;                                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public static void main(String [] args){                                                                                                                        
                                                                                                                                                                        
        Scanner scan=new Scanner(System.in);                                                                                                                            
                                                                                                                                                                        
        int n;                                                                                                                                                          
                                                                                                                                                                        
        System.out.println("Enter the number of books\n");                                                                                                              
        n=scan.nextInt();                                                                                                                                               
                                                                                                                                                                        
        Book[] b=new Book[n];                                                                                                                                           
                                                                                                                                                                        
        String title[]=new String[n];                                                                                                                                   
                                                                                                                                                                        
        String author[]=new String[n];                                                                                                                                  
                                                                                                                                                                        
        int year[]=new int[n];                                                                                                                                          
                                                                                                                                                                        
        double price[]=new double[n];                                                                                                                                   

        for(int i=0;i<n;i++){                                                                                                                                           
                                                                                                                                                                        
                String dummy=scan.nextLine();                                                                                                                           
                                                                                                                                                                        
                System.out.println("Enter the title of the book");                                                                                                      
                String tit=scan.nextLine();                                                                                                                             
                                                                                                                                                                        
                System.out.println("Enter the author name of the book");                                                                                                
                String authname=scan.nextLine();                                                                                                                        
                                                                                                                                                                        
                System.out.println("Enter the year of publication of the book");                                                                                        
                int yr=scan.nextInt();                                                                                                                                  
                                                                                                                                                                        
                System.out.println("Enter the price of the book");                                                                                                      
                double price1=scan.nextDouble();                                                                                                                        
                                                                                                                                                                        
                b[i]=new Book(tit,authname,yr,price1);                                                                                                                  
                                                                                                                                                                        
                title[i]=b[i].title;                                                                                                                                    
                                                                                                                                                                        
                author[i]=b[i].authorName;                                                                                                                              
                                                                                                                                                                        
                year[i]=b[i].year;                                                                                                                                      
                                                                                                                                                                        
                price[i]=b[i].price;                                                                                                                                    
                                                                                                                                                                        
                b[i].display();                                                                                                                                         
                                                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
        Boolean res=checkDup(title,author,year,price);                                                                                                                  
                                                                                                                                                                        
        if(res==true)                                                                                                                                                   
                System.out.println("Yes duplicate exists\n");                                                                                                           
        else                                                                                                                                                            
                System.out.println("Duplicate does'nt exists");                                                                                                         
        }                                                                                                                                                               
}                          