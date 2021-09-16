package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.ProjectSignUpBean;
import projectpack.CRUD;

public class deleteaccountTestUnit {

	@Test
	public void testcase1() {
		CRUD cd=new CRUD();
		assertEquals(1,cd.deleteaccount(1234));
		ProjectSignUpBean sb=new ProjectSignUpBean();
		sb.setId(1234);
		sb.setDept("cse");
		sb.setEmail("signupbeantesting@gmail.com");
		sb.setName("signupbeantesting");
		sb.setPassword("testingpassword");
		sb.setPhno("1234567890");
		sb.setPosition("student");
		sb.setSubject("java");
		cd.insert(sb);
	}
	@Test
	public void testcase2() {
		CRUD cd=new CRUD();
		assertEquals(0,cd.deleteaccount(0));
	}
}
