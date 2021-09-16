package Testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.ProjectSignUpBean;
import projectpack.CRUD;

public class DisplayDetailsTestUnit {

	@Test
	public void testcase1() 
	{
		CRUD cd=new CRUD();
		List<ProjectSignUpBean> lst=cd.display();
		boolean res=lst.size()>=0;
		assertEquals(true,res);
	}

}
