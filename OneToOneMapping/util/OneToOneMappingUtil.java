package edu.jspiders.onetoonemapping.util;

import edu.jspiders.onetoonemapping.dao.OneToOneMappingDAO;
import edu.jspiders.onetoonemapping.dto.TrainerPersonal;
import edu.jspiders.onetoonemapping.dto.TrainerProfessional;

public class OneToOneMappingUtil 
{
	public static void main(String[] args) 
	{
		TrainerPersonal personal = new TrainerPersonal(1, "Kannada", "Kolar", "Hardcore Single");
		
		TrainerProfessional trainer = new TrainerProfessional(1, "Rakshith", "Kumar", "Male", "Software Developer");
		
		OneToOneMappingDAO dao = new OneToOneMappingDAO();
		
		dao.insert(trainer, personal);
	}
}
