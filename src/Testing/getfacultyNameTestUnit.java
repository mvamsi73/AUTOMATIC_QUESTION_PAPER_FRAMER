package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import projectpack.CRUD;

public class getfacultyNameTestUnit {

	@Test
	public void testcase1() 
	{
		CRUD cd=new CRUD();
		assertEquals("vamsi",cd.getfacultyName(286));
	}
	@Test
	public void testcase2() 
	{
		CRUD cd=new CRUD();
		assertEquals(null,cd.getfacultyName(0));
	}
}
