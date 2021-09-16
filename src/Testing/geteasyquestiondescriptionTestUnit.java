package Testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.neweasyquestionbean;
import projectpack.CRUD;

public class geteasyquestiondescriptionTestUnit {

	@Test
	public void testcase1() {
		CRUD cd=new CRUD();
		List<neweasyquestionbean> lst=cd.geteasyquestiondescription(2);
		assertEquals(1,lst.size());
	}
	@Test
	public void testcase2() {
		CRUD cd=new CRUD();
		List<neweasyquestionbean> lst=cd.geteasyquestiondescription(0);
		assertEquals(0,lst.size());
	}
}
