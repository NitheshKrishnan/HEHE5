package edu.jspiders.hibernateop.util;

import edu.jspiders.hibernateop.dao.StudentDAO;
import edu.jspiders.hibernateop.dto.StudentDTO;

public class InsertUtil 
{
	public static void main(String[] args) 
	{
		StudentDTO student1 = new StudentDTO(2, "Mahendra", "Singh", "Dhoni", 98.4);

		StudentDAO dao = new StudentDAO();
		dao.create(student1);
	}
}
