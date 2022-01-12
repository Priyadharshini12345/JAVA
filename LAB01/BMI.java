import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
class Bmi{                                                                                                                                                              
        public double height;                                                                                                                                           
        public double weight;                                                                                                                                           
        public double BMI;                                                                                                                                              
                                                                                                                                                                        
        Bmi(double weight,double height){                                                                                                                               
                this.weight=weight;                                                                                                                                     
                this.height=height;                                                                                                                                     
                this.BMI=weight/(height*height);                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public static void main(String[] args){                                                                                                                         

        Scanner scan=new Scanner(System.in);                                                                                                                            

        System.out.println();                                                                                                                                           
                                                                                                                                                                        
        System.out.println("Enter your weight in kgs");                                                                                                                 
        double weight=scan.nextDouble();                                                                                                                                

        System.out.println("Enter your height in meters");                                                                                                              
        double height=scan.nextDouble();                                                                                                                                
                                                                                                                                                                        
        Bmi b=new Bmi(weight,height);                                                                                                                                   
                                                                                                                                                                        
        System.out.println("-------------------------------------------------");                                                                                        
        System.out.println("Underweight: Less than 18.5");                                                                                                              
        System.out.println("Normal: Between 18.5 and 24.9");                                                                                                            
        System.out.println("Overweight: Between 25 and 29.9");                                                                                                          
        System.out.println("Obese: 30 or greater");                                                                                                                     
        System.out.println("-------------------------------------------------");                                                                                        
                                                                                                                                                                        
        System.out.println();                                                                                                                                           
        System.out.println();                                                                                                                                           
                                                                                                                                                                        
        System.out.println("Your BMI is "+b.BMI);                                                                                                                       
                                                                                                                                                                        
        if(b.BMI<18.5)                                                                                                                                                  
                System.out.println("Your weight is Underweight");                                                                                                       
        else if(b.BMI>=18.5 && b.BMI<=24.9)                                                                                                                             
                System.out.println("Your weight is Normal");                                                                                                            
        else if(b.BMI>=25 && b.BMI<=29.9)                                                                                                                               
                System.out.println("Your weight is Overweight");                                                                                                        
        else                                                                                                                                                            
                System.out.println("Obese");                                                                                                                            
                                                                                                                                                                        
        System.out.println();                                                                                                                                           

        }                                                                                                                                                               
}                                                                                                                                                                       
                                    