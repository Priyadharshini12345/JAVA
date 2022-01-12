import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Student implements CgpaCal{                                                                                                                                
                                                                                                                                                                        
        int rollno;                                                                                                                                                     
        double cgpa;                                                                                                                                                    
        Course[] course;                                                                                                                                                
        int[] marks;                                                                                                                                                    


        Student(int rollno,Course[] course,int[] marks){                                                                                                                
                                                                                                                                                                        
                this.rollno=rollno;                                                                                                                                     
                this.course=course;                                                                                                                                     
                this.marks=marks;                                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                                                                                                                                                                        
                return String.format("REGISTER NO: %d\nCGPA: %f\n\n",rollno,cgpa);                                                                                      
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public int getRollno(){                                                                                                                                         
                return this.rollno;                                                                                                                                     
        }                                                                                                                                                               
                                                                                                                                                                        
        public double getCgpa(){                                                                                                                                        
                return this.cgpa;                                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        /*@override*/                                                                                                                                                   
        public void calculateCgpa(){                                                                                                                                    
                                                                                                                                                                        
                double cgpa;                                                                                                                                            
                int totalcredits=0;                                                                                                                                     
                int total=0;                                                                                                                                            
                                                                                                                                                                        
                for(int i=0;i<course.length;i++){                                                                                                                       
                        total+=marks[i]*course[i].noofCredits;                                                                                                          
                        totalcredits+=course[i].noofCredits;                                                                                                            
                }                                                                                                                                                       
                                                                                                                                                                        
                cgpa=total/totalcredits;                                                                                                                                
                                                                                                                                                                        
                this.cgpa=cgpa;                                                                                                                                         
        }                                                                                                                                                               
}                                       