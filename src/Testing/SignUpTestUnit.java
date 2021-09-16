package Testing;

import static org.junit.Assert.*;

import org.hibernate.query.Query;
import org.junit.Test;
import bean.ProjectSignUpBean;
import projectpack.*;
public class SignUpTestUnit {
	@Test
	public void testcase1() 
	{
		ProjectSignUpBean sb=new ProjectSignUpBean();
		CRUD cd=new CRUD();
		config con=new config();
		Query q=con.session.createQuery("delete from ProjectSignUpBean where id=:id");
		q.setParameter("id", 1234);
		q.executeUpdate();
		sb.setId(1234);
		sb.setDept("cse");
		sb.setEmail("signupbeantesting@gmail.com");
		sb.setName("signupbeantesting");
		sb.setPassword("testingpassword");
		sb.setPhno("1234567890");
		sb.setPosition("student");
		sb.setSubject("java");
		boolean res=cd.insert(sb)>0;
		con.session.close();
		con.sf.close();
		assertEquals(true,res);
	}
	@Test
	public void testcase2()
	{
		ProjectSignUpBean sb=new ProjectSignUpBean();
		CRUD cd=new CRUD();
		sb.setId(1234);
		sb.setDept("cse");
		sb.setEmail("signupbeantesting@gmail.com");
		sb.setName("signupbeantesting");
		sb.setPassword("testingpassword");
		sb.setPhno("1234567890");
		sb.setPosition("student");
		sb.setSubject("java");
		assertEquals(0,cd.insert(sb));
	}

}
