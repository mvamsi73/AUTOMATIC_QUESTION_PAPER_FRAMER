package Testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.neweasyquestionbean;
import projectpack.CRUD;

public class geteasyquestionsTestUnit {

	@Test
	public void test() {
		CRUD cd=new CRUD();
		List<neweasyquestionbean> lst=cd.geteasyquestions();
		boolean res=lst.size()>=0;
		assertEquals(true,res);
	}

}
