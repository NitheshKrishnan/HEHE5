package edu.jspiders.hibernatehql.util;

import edu.jspiders.hibernatehql.dao.StudentDAO;

public class DeleteByMarksUtil 
{
	public static void main(String[] args) 
	{
		StudentDAO dao = new StudentDAO();
		
		dao.deleteByMarks(90);
	}
}
