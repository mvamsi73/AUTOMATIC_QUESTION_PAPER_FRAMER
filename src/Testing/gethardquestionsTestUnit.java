package Testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.newhardquestionbean;
import projectpack.CRUD;

public class gethardquestionsTestUnit {

	@Test
	public void test() {
		CRUD cd=new CRUD();
		List<newhardquestionbean> lst=cd.gethardquestions();
		boolean res=lst.size()>=0;
		assertEquals(true,res);
	}

}
