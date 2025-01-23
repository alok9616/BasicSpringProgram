package in.sp.resourses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	
	@Bean
   public Student stdId1() 
   {
	   Student std=new Student();
	   
	   std.setName("Alok");
	   std.setRollno(10);
	   std.setEmail("alok@12345");
	   return std;
	   
   }
	
	@Bean
	   public Student stdId2() 
	   {
		   
		   Student std1=new Student();
		   std1.setName("aswani maurya");
		   std1.setRollno(11);
		   std1.setEmail("Aswani@12345");
		
		   return std1;
	   }
}
