import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Course{                                                                                                                                                    
                                                                                                                                                                        
        String courseName;                                                                                                                                              
                                                                                                                                                                        
        String courseInstructor;                                                                                                                                        
                                                                                                                                                                        
        int noofHours;                                                                                                                                                  
                                                                                                                                                                        
        int noofCredits;                                                                                                                                                
                                                                                                                                                                        
        static int noofStudentsEnrolled=60;                                                                                                                             
                                                                                                                                                                        
        Course(){                                                                                                                                                       

                courseName=null;                                                                                                                                        
                courseInstructor=null;                                                                                                                                  
                noofHours=0;                                                                                                                                            
                noofCredits=0;                                                                                                                                          
        }                                                                                                                                                               
                                                                                                                                                                        
        Course(String courseName,String courseInstructor,int noofHours,int noofCredits){                                                                                
                                                                                                                                                                        
                this.courseName=courseName;                                                                                                                             
                this.courseInstructor=courseInstructor;                                                                                                                 
                this.noofHours=noofHours;                                                                                                                               
                this.noofCredits=noofCredits;                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setCourseName(String courseName){                                                                                                                   
                this.courseName=courseName;                                                                                                                             
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setCourseInstructor(String courseInstructor){                                                                                                       
                this.courseInstructor=courseInstructor;                                                                                                                 
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setNoofHours(int n){                                                                                                                                
                this.noofHours=n;                                                                                                                                       
        }                                                                                                                                                               
                                                                                                                                                                        
        public void setNoofCredits(int n){                                                                                                                              
                this.noofCredits=n;                                                                                                                                     
        }                                                                                                                                                               
                                                                                                                                                                        
        public String getCourseName(){                                                                                                                                  
                return this.courseName;                                                                                                                                 
        }                                                                                                                                                               
                                                                                                                                                                        
        public String getCourseInstructor(){                                                                                                                            
                return this.courseInstructor;                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public int getNoofHours(){                                                                                                                                      
                return this.noofHours;                                                                                                                                  
        }                                                                                                                                                               
                                                                                                                                                                        
        public int getNoofCredits(){                                                                                                                                    
                return this.noofCredits;                                                                                                                                
        }                                                                                                                                                               
                                                                                                                                                                        
        static void enroll(int n){                                                                                                                                      
                noofStudentsEnrolled+=n;                                                                                                                                
        }                                                                                                                                                               
                                                                                                                                                                        
        static void drop(int n){                                                                                                                                        
                noofStudentsEnrolled-=n;                                                                                                                                
        }                                                                                                                                                               
                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                return "COURSE:\t"+getCourseName()+"\nINSTRUCTOR:\t"+getCourseInstructor()+"\nNO OF HOURS:\t"+getNoofHours()+"\nNO OF CREDITS:\t"+getNoofCredits()+"\nNO
 OF STUDENTS ENROLLED:\t"+noofStudentsEnrolled+"\n";                                                                                                                    
        }                                                                                                                                                               
}                                                                                                                                                                       
                                                                                                                                                                        
                          