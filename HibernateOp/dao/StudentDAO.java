package edu.jspiders.hibernateop.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.jspiders.hibernateop.dto.StudentDTO;

public class StudentDAO 
{
	public void create(StudentDTO student)
	{
		Configuration config = new Configuration().configure();
		
		config.addAnnotatedClass(StudentDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.save(student);
		
		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		session.close();
		
		factory.close();
	}
	
	public StudentDTO readById(int studentId)
	{
		Configuration config = new Configuration().configure();
		
		config.addAnnotatedClass(StudentDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		StudentDTO student = session.get(StudentDTO.class, studentId);
		
		session.close();
		
		factory.close();
		
		return student;
	}
	
	public void updateById(int studentId)
	{
		Scanner sc = new Scanner(System.in);
		
		Configuration config = new Configuration().configure();
		
		config.addAnnotatedClass(StudentDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		StudentDTO student = session.get(StudentDTO.class, studentId);
		
		if(student!= null)
		{
			System.out.println("1. First Name 2. middle name 3. last name 4. marks");
			
			int choice = sc.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Enter new first name");
				student.setFirstName(sc.next());
			}
			else if(choice == 2)
			{
				System.out.println("Enter new middle name");
				student.setMiddleName(sc.next());
			}
			else if(choice == 3)
			{
				System.out.println("Enter new last name");
				student.setLastName(sc.next());
			}
			else if(choice == 4)
			{
				System.out.println("Enter new marks");
				student.setMarks(sc.nextDouble());
			}
			
			session.update(student);
		
			session.beginTransaction().commit();
		}
		
		session.close();
		
		factory.close();
	}
	
	public void deleteById(int studentId)
	{
		Configuration config = new Configuration().configure();
		
		config.addAnnotatedClass(StudentDTO.class);
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		StudentDTO student = session.get(StudentDTO.class, studentId);
		
		if(student!= null)
		{
			session.delete(student);
			
			session.beginTransaction().commit();
		}
		else
			System.out.println("Student with the given Id is not present");
		
		session.close();
		
		factory.close();
	}
}