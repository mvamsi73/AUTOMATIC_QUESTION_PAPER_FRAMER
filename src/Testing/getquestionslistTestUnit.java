package Testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import projectpack.CRUD;

public class getquestionslistTestUnit {

	@Test
	public void testcase1() 
	{
		CRUD cd=new CRUD();
		ArrayList<Integer> lst=cd.getquestionslist(10);
		assertEquals(10,lst.size());
	}
	@Test
	public void testcase2() 
	{
		CRUD cd=new CRUD();
		ArrayList<Integer> lst=cd.getquestionslist(0);
		assertEquals(0,lst.size());
	}

}
