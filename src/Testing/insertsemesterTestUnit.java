package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.semesterbean;
import projectpack.CRUD;

public class insertsemesterTestUnit {

	@Test
	public void test() 
	{
		CRUD cd=new CRUD();
		semesterbean sb=new semesterbean();
		sb.setPaperid(Integer.parseInt(cd.getpaperid())+1);
		sb.setNumofbranch(4);
		sb.setNumofst(1800);
		sb.setSemnum(4);
		sb.setSemtype("even");
		boolean res=cd.insertsemester(sb)>0;
		assertEquals(true,res);
	}

}
