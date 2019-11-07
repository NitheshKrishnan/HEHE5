package edu.jspiders.manytoonemapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.jspiders.manytoonemapping.dto.Batches;
import edu.jspiders.manytoonemapping.dto.Feedbacks;

public class ManyToOneMappingDAO 
{
	public void insert()
	{
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Batches batch = session.get(Batches.class, "HEWM14");
		
		if(batch!=null)
		{
			Feedbacks feedback1 = new Feedbacks(1, "Good");
			Feedbacks feedback2 = new Feedbacks(2, "Very Good");
			Feedbacks feedback3 = new Feedbacks(3, "Excellent");
		
			batch.addFeedbacks(feedback1);
			batch.addFeedbacks(feedback2);
			batch.addFeedbacks(feedback3);
			
			session.save(feedback1);
			session.save(feedback2);
			session.save(feedback3);
			
			session.beginTransaction().commit();
		}
		else
		{
			System.out.println("Batch code not present");
		}
	}
	
	public void readBatchByFeedback()
	{
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Feedbacks feedback = session.get(Feedbacks.class, 1);
		
		if(feedback!=null)
		{
			System.out.println("Feedback Details --> "+feedback);
			System.out.println("Batch Details --> "+feedback.getBatch());
		}
		else
		{
			System.out.println("Batch code not present");
		}
	}
	
	public void readFeedbackByBatch()
	{
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Batches batch= session.get(Batches.class, "HEWM14");
		
		if(batch!=null)
		{
			System.out.println("Batch Details --> "+batch);
			System.out.println("Feedback Details");
			System.out.println("----------------");
		
			for(Feedbacks feedback : batch.getFeedbacks())
			{
				System.out.println(feedback);
			}
		}
		else
		{
			System.out.println("Batch code not present");
		}
	}
}
