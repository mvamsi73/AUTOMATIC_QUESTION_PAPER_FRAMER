package Testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.newmediumquestionbean;
import projectpack.CRUD;

public class getmediumquestiondescriptionTestUnit {

	@Test
	public void testcase1() {
		CRUD cd=new CRUD();
		List<newmediumquestionbean> lst=cd.getmediumquestiondescription(2);
		assertEquals(1,lst.size());
	}
	@Test
	public void testcase2() {
		CRUD cd=new CRUD();
		List<newmediumquestionbean> lst=cd.getmediumquestiondescription(0);
		assertEquals(0,lst.size());
	}

}
