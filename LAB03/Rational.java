import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Rational{                                                                                                                                                  
                                                                                                                                                                        
        private int num;                                                                                                                                                
        private int den;                                                                                                                                                
                                                                                                                                                                        
        Rational(){     //default constructor                                                                                                                           
                den=1;                                                                                                                                                  
        }                                                                                                                                                               
                                                                                                                                                                        
        Rational(int num,int den){      //Parametrized constructor                                                                                                      
                this.num=num;                                                                                                                                           
                this.den=den;                                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public void increment(int val){                                                                                                                                 
                this.num=this.num+val;                                                                                                                                  
                this.den=this.den+val;                                                                                                                                  
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setNum(int num){    //Mutator method                                                                                                                
                this.num=num;                                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setDen(int den){                                                                                                                                    
                if(den==0)                                                                                                                                              
                        System.out.println("Denominator cannot be zero since infinity is not a rational number\n");                                                     
                else                                                                                                                                                    
                        this.den=den;                                                                                                                                   
        }                                                                                                                                                               
                                                                                                                                                                        
        public int getNum(){    //Accessor method                                                                                                                       
                return num;                                                                                                                                             
        }                                                                                                                                                               
                                                                                                                                                                        
        public int getDen(){                                                                                                                                            
                return den;                                                                                                                                             
        }                                                                                                                                                               
                                                                                                                                                                        
        public void display(){                                                                                                                                          
                System.out.println("Numerator: "+num+" Denominator: "+den);                                                                                             
        }                                                                                                                                                               
}                               