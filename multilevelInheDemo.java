import java.io.*;

class dept
 {  
   protected int dept_no;
	     String dept_name;
    dept(String dept_name,int dept_no)
    {
      this.dept_name=dept_name;
      this.dept_no=dept_no; 
    }
    void display1()
    {
      System.out.println("Dept Number:"+dept_no);
      System.out.println("Dept name:"+dept_name);
    }
 }//end dept
 
 class course extends dept
  {
     protected String course_name;
    
    course(String dept_name,String course_name,int dept_no)
    {
        super(dept_name,dept_no);
        this.course_name=course_name;
      
    }
    
  }//end course
  
  class student extends course
   {
     protected String s_name;
     
     student(String dept_name,String course_name,int dept_no,String s_name)
     {
       super(dept_name,course_name,dept_no);
       this.s_name=s_name;
      }
     void display()
     {
       System.out.println("Name of Student: "+s_name);
       System.out.println("Name of Course: "+course_name);
       System.out.println("Name of Department: "+dept_name);
       System.out.println("Department Number: "+dept_no);
            
       
     } 
   }//end student
   
   class multilevelInheDemo
   {
      public static void main(String args[])
      {
          String dname,cname,sname;
          int dno;
          dname=args[0];
          cname=args[1];
          sname=args[2];
          dno=Integer.parseInt(args[3]);
          
          student s=new student(dname,cname,dno,sname);
          s.display();
      }
   }//end main class
