package edu.jspiders.hibernateop.util;

import edu.jspiders.hibernateop.dao.StudentDAO;

public class UpdateUtil
{
	public static void main(String[] args)
	{
		StudentDAO dao = new StudentDAO();
		
		dao.updateById(1);
	}
}
