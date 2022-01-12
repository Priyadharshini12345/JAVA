import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
abstract class Vehicle{                                                                                                                                                 
                                                                                                                                                                        
        protected int engineNumber;                                                                                                                                     
        protected String model;                                                                                                                                         
        protected String make;                                                                                                                                          
        protected double costOfVehicle;                                                                                                                                 
        protected double amount;                                                                                                                                        
        protected double TollAmount;                                                                                                                                    
                                                                                                                                                                        
        Vehicle(int engineNumber,String model,String make,double costOfVehicle,double amount){                                                                          

                this.engineNumber=engineNumber;                                                                                                                         
                this.model=model;                                                                                                                                       
                this.make=make;                                                                                                                                         
                this.costOfVehicle=costOfVehicle;                                                                                                                       
                this.amount=amount;                                                                                                                                     

        }                                                                                                                                                               
                                                                                                                                                                        
        public void settollamount(double amount){                                                                                                                       
                this.TollAmount=amount;                                                                                                                                 
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString() {                                                                                                                                      
                return String.format("ENGINE NUMBER: %d\nMODEL: %s\nMAKE: %s\nCOST OF VEHICLE: %f\nTOLL AMOUNT: %f\n",engineNumber,model,make,costOfVehicle,TollAmount);
        }                                                                                                                                                               
}                              