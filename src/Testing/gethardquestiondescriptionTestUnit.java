package Testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.newhardquestionbean;
import projectpack.CRUD;

public class gethardquestiondescriptionTestUnit {

	@Test
	public void testcase1() {
		CRUD cd=new CRUD();
		List<newhardquestionbean> lst=cd.gethardquestiondescription(2);
		assertEquals(1,lst.size());
	}
	@Test
	public void testcase2() {
		CRUD cd=new CRUD();
		List<newhardquestionbean> lst=cd.gethardquestiondescription(0);
		assertEquals(0,lst.size());
	}

}
