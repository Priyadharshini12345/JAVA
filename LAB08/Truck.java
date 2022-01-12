import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Truck extends Vehicle implements TollBooth{                                                                                                                
        private int capacity;                                                                                                                                           
        private int numwheels;                                                                                                                                          
                                                                                                                                                                        
        Truck(int enginenum,String model,String make,double cost,int capacity,int numwheels,double amount){                                                             

                super(enginenum,model,make,cost,amount);                                                                                                                
                this.capacity=capacity;                                                                                                                                 
                this.numwheels=numwheels;                                                                                                                               
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public int getAxles(){                                                                                                                                          
                return this.numwheels;                                                                                                                                  
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                return (super.toString()+String.format("CAPACITY: %d\nNUMBER OF WHEELS: %d",capacity,numwheels));                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        public double deductAmount(double amount){                                                                                                                      
                this.amount-=amount;                                                                                                                                    
                return this.amount;                                                                                                                                     
        }                                                                                                                                                               
                                                                                                                                                                        
}                                                                                                                                                                       
                                 