import java.util.*;                                                                                                                                                     
                                                                                                                                                                        
public class Queue{                                                                                                                                                     
                                                                                                                                                                        
        String[] arr;                                                                                                                                                   
                                                                                                                                                                        
        static int capacity;                                                                                                                                            
                                                                                                                                                                        
        static int rear,front=-1;                                                                                                                                       
                                                                                                                                                                        
        Queue(String[] arr,int capacity){                                                                                                                               
                                                                                                                                                                        
                this.arr=arr;                                                                                                                                           
                                                                                                                                                                        
                rear=-1;                                                                                                                                                

                this.capacity=capacity;                                                                                                                                 
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public void insert(String element){                                                                                                                             
                                                                                                                                                                        
                if(rear==0){                                                                                                                                            
                        front=0;                                                                                                                                        
                }                                                                                                                                                       
                                                                                                                                                                        
                if(!isFull()){                                                                                                                                          
                                                                                                                                                                        
                        rear++;                                                                                                                                         
                                                                                                                                                                        
                        arr[rear]=element;                                                                                                                              
                                                                                                                                                                        
                        System.out.println("Element Inserted: "+element+"\n");                                                                                          
                }                                                                                                                                                       
                                                                                                                                                                        
                else                                                                                                                                                    
                        System.out.println("Queue is full! Cannot insert\n");                                                                                           
                                                                                                                                                                        
        }                                                                                                                                                               
                                                                                                                                                                        
        public boolean isFull(){                                                                                                                                        
                                                                                                                                                                        
                if(rear==(capacity-1)) return true;                                                                                                                     

                return false;                                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
        public boolean isEmpty(){                                                                                                                                       
                                                                                                                                                                        
                if(front>rear || front==-1) return true;                                                                                                                

                return false;                                                                                                                                           
        }                                                                                                                                                               
                                                                                                                                                                        
                                                                                                                                                                        
        public void delete(){                                                                                                                                           
                                                                                                                                                                        
                if(isEmpty()){                                                                                                                                          
                                                                                                                                                                        
                        System.out.println("Queue is empty! Cannot delete\n");                                                                                          
                }                                                                                                                                                       
                                                                                                                                                                        
                else{                                                                                                                                                   

                        String x=arr[front];                                                                                                                            
                                                                                                                                                                        
                        front++;                                                                                                                                        
                                                                                                                                                                        
                        System.out.println("Deleted String: "+x+"\n");                                                                                                  
                }                                                                                                                                                       
        }                                                                                                                                                               
}                                   