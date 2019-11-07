package edu.jspiders.hibernateop.util;

import edu.jspiders.hibernateop.dao.StudentDAO;

public class DeleteUtil
{
	public static void main(String[] args)
	{
		StudentDAO dao = new StudentDAO();
		
		dao.deleteById(2);
	}
}
