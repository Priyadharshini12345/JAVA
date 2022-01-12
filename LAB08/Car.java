import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Car extends Vehicle implements TollBooth{                                                                                                                  
                                                                                                                                                                        
        private int numOfSeats;                                                                                                                                         
        private float mileage;                                                                                                                                          
                                                                                                                                                                        
        Car(int enginenum,String model,String make,double cost,int numOfSeats,float mileage,double amount){                                                             

                super(enginenum,model,make,cost,amount);                                                                                                                
                this.numOfSeats=numOfSeats;                                                                                                                             
                this.mileage=mileage;                                                                                                                                   
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                return (super.toString()+String.format("NUMBER OF SEATS: %d\nMILEAGE: %f",numOfSeats,mileage));                                                         
        }                                                                                                                                                               
                                                                                                                                                                        
        public double deductAmount(double amount){                                                                                                                      
                this.amount-=amount;                                                                                                                                    
                return this.amount;                                                                                                                                     
        }                                                                                                                                                               
        public float getMileage(){                                                                                                                                      
                return this.mileage;                                                                                                                                    
        }                                                                                                                                                               
                                                                                                                                                                        
}          