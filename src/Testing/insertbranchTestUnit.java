package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.branchbean;
import projectpack.CRUD;

public class insertbranchTestUnit {

	@Test
	public void testcase1() 
	{
		CRUD cd=new CRUD();
		branchbean branch=new branchbean();
		branch.setBranch("CSE");
		branch.setNumofcourses(5);
		branch.setNumofstudents(1000);
		branch.setPaperid(Integer.parseInt(cd.getpaperid())+1);
		boolean res=cd.insertbranch(branch)>0;
		assertEquals(true,res);
	}

}
