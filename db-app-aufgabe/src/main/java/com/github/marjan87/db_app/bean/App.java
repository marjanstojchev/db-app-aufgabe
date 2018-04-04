package com.github.marjan87.db_app.bean;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	 public static void main(String args[]) throws IOException{
		 

		HashMap<Integer,Double> avgNote = new HashMap<Integer,Double>();
		HashMap<Integer,Integer> teilnehmerDoz= new HashMap<Integer,Integer>();
		 
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
	
		//retrieve a bean from the container
		Student student1 = context.getBean("student1", Student.class);
		Student student2 = context.getBean("student2", Student.class);
		Student student3 = context.getBean("student3", Student.class);
		Student student4 = context.getBean("student4", Student.class);
		Student student5 = context.getBean("student5", Student.class);
		Student student6 = context.getBean("student6", Student.class);
		Student student7 = context.getBean("student7", Student.class);
		Student student8 = context.getBean("student8", Student.class);
	
		Dozent dozent1 =context.getBean("dozent1", Dozent.class);
		Dozent dozent2 =context.getBean("dozent2", Dozent.class);
	
		Vorlesung vorlesung1=context.getBean("mathematik", Vorlesung.class);
		Vorlesung vorlesung2=context.getBean("physik", Vorlesung.class);
		Vorlesung vorlesung3=context.getBean("oop", Vorlesung.class);
		Vorlesung vorlesung4=context.getBean("multimedia", Vorlesung.class);
		Vorlesung vorlesung5=context.getBean("elektrotechnik", Vorlesung.class);
		
		Teilnahme stud1Math=context.getBean("stud1-math", Teilnahme.class);
		Teilnahme stud1Phy=context.getBean("stud1-phy", Teilnahme.class);
	
		Teilnahme stud2Math=context.getBean("stud2-math", Teilnahme.class);
		Teilnahme stud2Phy=context.getBean("stud2-phy", Teilnahme.class);
		
		Teilnahme stud3Oop=context.getBean("stud3-oop", Teilnahme.class);
		Teilnahme stud3Mm=context.getBean("stud3-mm", Teilnahme.class);
		
		Teilnahme stud4Oop=context.getBean("stud4-oop", Teilnahme.class);
		Teilnahme stud4Mm=context.getBean("stud4-mm", Teilnahme.class);
		
		Teilnahme stud5Mm=context.getBean("stud5-mm", Teilnahme.class);
		Teilnahme stud5Et=context.getBean("stud5-et", Teilnahme.class);
	
		Teilnahme stud6Mm=context.getBean("stud6-mm", Teilnahme.class);
		Teilnahme stud6Et=context.getBean("stud6-et", Teilnahme.class);
	
		Teilnahme stud7Et=context.getBean("stud7-et", Teilnahme.class);
		Teilnahme stud7Math=context.getBean("stud7-math", Teilnahme.class);
	
		Teilnahme stud8Et=context.getBean("stud8-et", Teilnahme.class);
		Teilnahme stud8Math=context.getBean("stud8-math", Teilnahme.class);
	

    	      
    	      Reader reader = Resources.getResourceAsReader("mybatis-configuration.xml");
    	      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
    	      SqlSession session = sqlSessionFactory.openSession();
    	      
    	 
    	      //Database manipulation     
    	      session.insert("Student.insert", student1);
    	      session.insert("Student.insert", student2);
    	      session.insert("Student.insert", student3);
    	      session.insert("Student.insert", student4);
    	      session.insert("Student.insert", student5);
    	      session.insert("Student.insert", student6);
    	      session.insert("Student.insert", student7);
    	      session.insert("Student.insert", student8);
    	      
    	      session.insert("Dozent.insert", dozent1);
    	      session.insert("Dozent.insert", dozent2);
    	      
    	      session.insert("Teilnahme.insert", stud1Phy);
    	      session.insert("Teilnahme.insert", stud1Math);
    	      session.insert("Teilnahme.insert", stud2Phy);
    	      session.insert("Teilnahme.insert", stud2Math);
    	      session.insert("Teilnahme.insert", stud3Oop);
    	      session.insert("Teilnahme.insert", stud3Mm);
    	      session.insert("Teilnahme.insert", stud4Oop);
    	      session.insert("Teilnahme.insert", stud4Mm);
    	      session.insert("Teilnahme.insert", stud5Mm);
    	      session.insert("Teilnahme.insert", stud5Et);
    	      session.insert("Teilnahme.insert", stud6Mm);
    	      session.insert("Teilnahme.insert", stud6Et);
    	      session.insert("Teilnahme.insert", stud7Et);
    	      session.insert("Teilnahme.insert", stud7Math);
    	      session.insert("Teilnahme.insert", stud8Et);
    	      session.insert("Teilnahme.insert", stud8Math);
    	      
    	      session.insert("Vorlesung.insert", vorlesung1);
    	      session.insert("Vorlesung.insert", vorlesung2);
    	      session.insert("Vorlesung.insert", vorlesung3);
    	      session.insert("Vorlesung.insert", vorlesung4);
    	      session.insert("Vorlesung.insert", vorlesung5);
   	      
    	      Student newStudent1 = context.getBean("newStudent1", Student.class);
    	      session.update("Student.update",newStudent1);
    	      session.delete("Student.deleteById", 1);
    	      
    	      session.selectList("Select.avgNote", avgNote);
    	      session.selectList("Select.teilnehmerDoz", teilnehmerDoz);
    	      
    	      session.commit();
    	      session.close();
    	      
    	      context.close();
    	      } 
	 			
}	
	 
