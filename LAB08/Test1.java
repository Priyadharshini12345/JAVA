import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Test{                                                                                                                                                      
                                                                                                                                                                        
        public static void main(String args[]){                                                                                                                         
                                                                                                                                                                        
                int n;                                                                                                                                                  
                Scanner scan=new Scanner(System.in);                                                                                                                    
                                                                                                                                                                        
                System.out.println("Enter the number of Vehicles");                                                                                                     
                n=scan.nextInt();                                                                                                                                       
                                                                                                                                                                        
                Vehicle v[]=new Vehicle[n];                                                                                                                             
                                                                                                                                                                        
                int flag=0;                                                                                                                                             
                                                                                                                                                                        
                for(int i=0;i<n;i++){                                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter the engine number");                                                                                                  
                        int enginenum=scan.nextInt();                                                                                                                   
                                                                                                                                                                        
                        String dummy=scan.nextLine();                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter the model");                                                                                                          
                        String model=scan.nextLine();                                                                                                                   
                                                                                                                                                                        
                        System.out.println("Enter the make");                                                                                                           
                        String make=scan.nextLine();                                                                                                                    
                                                                                                                                                                        
                        System.out.println("Enter the cost of the Vehicle");                                                                                            
                        double cost=scan.nextDouble();                                                                                                                  
                                                                                                                                                                        
                        System.out.println("Enter the amount you are paying !");                                                                                        
                        double amtt=scan.nextDouble();                                                                                                                  
                                                                                                                                                                        
                        String dumm=scan.nextLine();                                                                                                                    
                                                                                                                                                                        
                        System.out.println("Enter the type of Vehicle- Car/Truck");                                                                                     
                        String type=scan.nextLine();                                                                                                                    
                                                                                                                                                                        
                        double Tollamount=0;                                                                                                                            
                        int num,wheels,capacity;                                                                                                                        
                        float mileage;                                                                                                                                  

                                                                                                                                                                        
                        if(type.equals("Car")){                                                                                                                         
                                                                                                                                                                        
                                Tollamount=TollBooth.carToll;                                                                                                           
                                                                                                                                                                        
                                System.out.println("Enter the number of seats");                                                                                        
                                 num=scan.nextInt();                                                                                                                    
                                                                                                                                                                        
                                System.out.println("Enter the mileage");                                                                                                
                                mileage=scan.nextFloat();                                                                                                               
                                                                                                                                                                        
                                v[i]=new Car(enginenum,model,make,cost,num,mileage,amtt);                                                                               
                                                                                                                                                                        

                        }                                                                                                                                               
                                                                                                                                                                        
                        else if(type.equals("Truck")){                                                                                                                  
                                                                                                                                                                        
                                Tollamount=TollBooth.truckToll;                                                                                                         
                                                                                                                                                                        
                                System.out.println("Enter the number of wheels");                                                                                       
                                wheels=scan.nextInt();                                                                                                                  
                                                                                                                                                                        
                                System.out.println("Enter the capacity");                                                                                               
                                capacity=scan.nextInt();                                                                                                                
                                                                                                                                                                        
                                v[i]=new Truck(enginenum,model,make,cost,capacity,wheels,amtt);                                                                         
                                                                                                                                                                        

                        }                                                                                                                                               
                        v[i].settollamount(Tollamount);                                                                                                                 
                                                                                                                                                                        
                        double amt=TollBooth.deductAmount(v[i],type);                                                                                                   
                                                                                                                                                                        
                        System.out.println();                                                                                                                           
                                                                                                                                                                        
                        System.out.println("--------------------------VEHICLE DETAILS-----------------------------");                                                   
                                                                                                                                                                        
                        System.out.println(v[i].toString());                                                                                                            
                                                                                                                                                                        
                        System.out.println("AMOUNT: "+amt);                                                                                                             
                                                                                                                                                                        
                                                                                                                                                                        
                }                                                                                                                                                       
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                                                                                                                                                                        
                             