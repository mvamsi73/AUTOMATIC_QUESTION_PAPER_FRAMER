package Testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.questionpaperbean;
import projectpack.CRUD;

public class getgeneratedpaperspaperidTestUnit {
	
//	This test will check if the returned list from the called method has length exactly one because papers have only unique paper IDs
	@Test
	public void testcase1() {
		CRUD cd=new CRUD();
		List<questionpaperbean> lst=cd.getgeneratedpaperspaperid(6);
		boolean res=lst.size()==1;
		assertEquals(true,res);
	}
	//This test will check the resulted list has the requested paper with specified paper ID or not
	@Test
	public void testcase2() {
		CRUD cd=new CRUD();
		List<questionpaperbean> lst=cd.getgeneratedpaperspaperid(6);
		assertEquals(6,lst.get(0).getPaperid());
	}
}
