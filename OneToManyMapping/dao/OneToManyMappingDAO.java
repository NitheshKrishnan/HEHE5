package edu.jspiders.onetomanymapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.jspiders.onetomanymapping.dto.Batches;
import edu.jspiders.onetomanymapping.dto.TrainerProfessional;

public class OneToManyMappingDAO 
{
	public void insert(int empId)
	{
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		TrainerProfessional trainer = session.get(TrainerProfessional.class, empId);
		
		if(trainer!= null)
		{
			Batches batch1 = new Batches("HEWM14", "Web Tech");
			Batches batch2 = new Batches("HEJA14", "J2ee");
			Batches batch3 = new Batches("HEHE5", "Hibernate");
			
			trainer.addBatch(batch1);
			trainer.addBatch(batch2);
			trainer.addBatch(batch3);
			
			session.save(batch1);
			session.save(batch2);
			session.save(batch3);
			
			session.beginTransaction().commit();
			
			session.close();
		}
		else
		{
			System.out.println("Trainer with the given emp Id is not Present");
		}
	}
	
	public void readByEmpId(int empId)
	{
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		TrainerProfessional trainer = session.get(TrainerProfessional.class, empId);
		
		if(trainer!= null)
		{
			System.out.println("Trainer Information --> "+trainer);
			System.out.println("Batches Info for the Trainer");
			System.out.println("----------------------------");
			
			for(Batches batch : trainer.getBatches())
			{
				System.out.println(batch);
			}
		}
		else
		{
			System.out.println("Trainer with the given emp Id is not Present");
		}
	}
}