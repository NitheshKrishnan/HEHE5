package edu.jspiders.hibernatehql.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.jspiders.hibernatehql.dto.StudentDTO;

public class StudentDAO 
{
	public void readByMarks()
	{
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM StudentDTO where marks > 85";
		
		Query query = session.createQuery(hql);
		
		List<StudentDTO> students = query.list();
		
		for(StudentDTO student : students)
		{
			System.out.println(student);
		}
	}
	
	public void readByMarks(double marks)
	{
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		String hql = "FROM StudentDTO where marks > :var";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("var", marks);
		
		List<StudentDTO> students = query.list();
		
		for(StudentDTO student : students)
		{
			System.out.println(student);
		}
	}
	
	public void deleteByMarks(double marks)
	{
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		String hql = "DELETE FROM StudentDTO where marks > :var";
		
		Query query = session.createQuery(hql);
		
		query.setParameter("var", marks);
		
		int count = query.executeUpdate();
		
		System.out.println("Query OK, "+count+" no. of rows Affected");
	}
}