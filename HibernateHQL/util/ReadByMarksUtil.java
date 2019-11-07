package edu.jspiders.hibernatehql.util;

import edu.jspiders.hibernatehql.dao.StudentDAO;

public class ReadByMarksUtil 
{
	public static void main(String[] args) 
	{
		StudentDAO dao = new StudentDAO();
		
		dao.readByMarks(55);
	}
}
