import java.util.*;                                                                                                                                                     
                                                                                                                                                                        

public class Course{                                                                                                                                                    

                                                                                                                                                                        
        String courseName;                                                                                                                                              

        int courseId;                                                                                                                                                   
                                                                                                                                                                        
        int noofCredits;                                                                                                                                                
                                                                                                                                                                        

        Course(){                                                                                                                                                       

                                                                                                                                                                        
                courseName=null;                                                                                                                                        
                                                                                                                                                                        
                courseId=0;                                                                                                                                             
                                                                                                                                                                        
                noofCredits=0;                                                                                                                                          
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        
        Course(int courseId,String courseName,int noofCredits){                                                                                                         
                                                                                                                                                                        

                                                                                                                                                                        
                this.courseName=courseName;                                                                                                                             

                this.courseId=courseId;                                                                                                                                 
                                                                                                                                                                        
                this.noofCredits=noofCredits;                                                                                                                           
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        
        public void setCourseName(String courseName){                                                                                                                   
                                                                                                                                                                        
                this.courseName=courseName;                                                                                                                             
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        

        public void setCourseId(int courseId){                                                                                                                          

                this.courseId=courseId;                                                                                                                                 

        }                                                                                                                                                               

                                                                                                                                                                        
        public void setNoofCredits(int n){                                                                                                                              
                                                                                                                                                                        
                this.noofCredits=n;                                                                                                                                     
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        
        public String getCourseName(){                                                                                                                                  
                                                                                                                                                                        
                return this.courseName;                                                                                                                                 
                                                                                                                                                                        
        }                                                                                                                                                               

                                                                                                                                                                        
        public int getcourseId(){                                                                                                                                       
                                                                                                                                                                        
                return this.courseId;                                                                                                                                   
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        

                                                                                                                                                                        
        public int getNoofCredits(){                                                                                                                                    
                                                                                                                                                                        
                return this.noofCredits;                                                                                                                                
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        


                                                                                                                                                                        
        public String toString(){                                                                                                                                       
                                                                                                                                                                        
               return "COURSE:\t"+getCourseName()+"\nCOURSE ID:\t"+getcourseId()+"\nNO OF CREDITS:\t"+getNoofCredits()+"\n";                                            
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
}                          