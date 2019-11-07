package edu.jspiders.onetoonemapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import edu.jspiders.onetoonemapping.dto.TrainerPersonal;
import edu.jspiders.onetoonemapping.dto.TrainerProfessional;

public class OneToOneMappingDAO 
{
	public void insert(TrainerProfessional trainer, TrainerPersonal personal)
	{
		trainer.setPersonal(personal);
		
		Configuration config = new Configuration().configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		session.save(trainer);
		
		session.beginTransaction().commit();
		
		session.close();
		
		factory.close();
	}
}