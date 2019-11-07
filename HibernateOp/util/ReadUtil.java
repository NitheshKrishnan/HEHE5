package edu.jspiders.hibernateop.util;

import edu.jspiders.hibernateop.dao.StudentDAO;

public class ReadUtil
{
	public static void main(String[] args)
	{
		StudentDAO dao = new StudentDAO();
		
		System.out.println(dao.readById(10));
	}
}
