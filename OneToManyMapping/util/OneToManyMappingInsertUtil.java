package edu.jspiders.onetomanymapping.util;

import edu.jspiders.onetomanymapping.dao.OneToManyMappingDAO;

public class OneToManyMappingInsertUtil 
{
	public static void main(String[] args) 
	{
		OneToManyMappingDAO dao = new OneToManyMappingDAO();
		
		//dao.insert(1);
		
		dao.readByEmpId(1);
	}
}
