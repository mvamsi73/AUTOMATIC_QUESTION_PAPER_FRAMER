package Testing;

import static org.junit.Assert.*;

import org.junit.Test;
import bean.ProjectLogInBean;
import projectpack.CRUD;
public class LogInValidateTestUnit {

	@Test
	public void testcase1() 
	{
		ProjectLogInBean lb=new ProjectLogInBean();
		lb.setId(123);
		lb.setPassword("testingpassword");
		CRUD cd=new CRUD();
		assertEquals(true,cd.validate(lb));
	}
	@Test
	public void testcase2() 
	{
		ProjectLogInBean lb=new ProjectLogInBean();
		lb.setId(0);
		lb.setPassword("testingpassword");
		CRUD cd=new CRUD();
		assertEquals(false,cd.validate(lb));
	}

}
