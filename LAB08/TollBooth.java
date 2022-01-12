import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public interface TollBooth{                                                                                                                                             
                                                                                                                                                                        
        public static final double carToll=30;                                                                                                                          
        public static final double truckToll=75;                                                                                                                        
                                                                                                                                                                        
        public static double deductAmount(Vehicle v,String type){                                                                                                       
                                                                                                                                                                        
                if(type.equals("Car"))                                                                                                                                  
                        v.amount-=carToll;                                                                                                                              
                                                                                                                                                                        
                else if(type.equals("Truck"))                                                                                                                           
                        v.amount-=truckToll;                                                                                                                            
                                                                                                                                                                        
                return v.amount;                                                                                                                                        
        }                                                                                                                                                               

                                                                                                                                                                        
}                                                                                                                                                                       
                         