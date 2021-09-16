package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.ProjectSignUpBean;
import projectpack.CRUD;

public class updatedetailsTestUnit {

	@Test
	public void testcase1() 
	{
		CRUD cd=new CRUD();
		ProjectSignUpBean sb=new ProjectSignUpBean();
		sb.setDept("cse");
		sb.setEmail("updatetesting@gmail.com");
		sb.setId(123);
		sb.setName("updatetesting");
		sb.setPassword("testingpassword");
		sb.setPhno("1234567890");
		sb.setPosition("testing");
		sb.setSubject("java");
		assertEquals(1,cd.updatedetails(sb, 123));
	}
	@Test
	public void testcase2() 
	{
		CRUD cd=new CRUD();
		ProjectSignUpBean sb=new ProjectSignUpBean();
		sb.setDept("cse");
		sb.setEmail("updatetesting@gmail.com");
		sb.setId(123);
		sb.setName("updatetesting");
		sb.setPassword("testingpassword");
		sb.setPhno("1234567890");
		sb.setPosition("testing");
		sb.setSubject("java");
		assertEquals(0,cd.updatedetails(sb,0));
	}

}
