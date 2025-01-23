package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resourses.SpringConfigFile;

public class main 
{
  public static void main(String[]args) {
	  
	//@SuppressWarnings("resource")
	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
   
   Student std =(Student) context.getBean("stdId1");  //Student std = context.getBean(Student.class):
   std.display();
    System.out.println("------------------------");
   
   Student std1 =(Student) context.getBean("stdId2");
   std1.display();
  }
   
}
