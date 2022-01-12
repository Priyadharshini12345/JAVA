import java.io.Serializable;                                                                                                                                            

                                                                                                                                                                        
public class Account implements Serializable{                                                                                                                           

                                                                                                                                                                        
//      private static final long serialVersionUID = 1L;                                                                                                                

                                                                                                                                                                        
                private String name;                                                                                                                                    

                                                                                                                                                                        
                private double balance;                                                                                                                                 

                                                                                                                                                                        
                private int acc_no;                                                                                                                                     

                                                                                                                                                                        
                public Account() {            //constructor                                                                                                             

                                                                                                                                                                        
                        this("sam",2334,1);                                                                                                                             

                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        
                public Account(String n,int accno) {                                                                                                                    

                                                                                                                                                                        
                        name = n;                          //reference type when assigned it holds the reference to the location of object                              

                                                                                                                                                                        
                        balance = 100;                                                                                                                                  

                                                                                                                                                                        
                        acc_no = accno;                                                                                                                                 

                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        
                                                                                                                                                                        
                                                                                                                                                                        
                public Account(String n,double bal,int accno) {                                                                                                         

                                                                                                                                                                        
                        name = n;                                                                                                                                       

                                                                                                                                                                        
                        balance = bal;                                                                                                                                  

                                                                                                                                                                        
                        acc_no = accno;                                                                                                                                 

                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        
                public void setName(String name)                                                                                                                        

                                                                                                                                                                        
                {                                                                                                                                                       

                                                                                                                                                                        
                        this.name = name;                                                                                                                               

                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        
                public void setBalance(double bal)                                                                                                                      

                                                                                                                                                                        
                {                                                                                                                                                       

                                                                                                                                                                        
                        this.balance = bal;                                                                                                                             

                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        
                public void setAccountNumber(int acc)                                                                                                                   

                                                                                                                                                                        
                {                                                                                                                                                       

                                                                                                                                                                        
                    acc_no = acc;                                                                                                                                       

                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        
                public String getName() {                                                                                                                               

                                                                                                                                                                        
                        return name;                                                                                                                                    

                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        
                public double getBalance() {                                                                                                                            

                                                                                                                                                                        
                        return balance;                                                                                                                                 

                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        
                public int getAccount() {                                                                                                                               

                                                                                                                                                                        
                        return acc_no;                                                                                                                                  

                                                                                                                                                                        
                }                                                                                                                                                       

                                                                                                                                                                        
}                                                                                                                                                                       

                                                                                                                                                                        


                                                                                                                                                                        

                                                                                                                                                                        

