package Testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.newmediumquestionbean;
import projectpack.CRUD;

public class getmediumquestionsTestUnit {

	@Test
	public void test() {
		CRUD cd=new CRUD();
		List<newmediumquestionbean> lst=cd.getmediumquestions();
		boolean res=lst.size()>=0;
		assertEquals(true,res);
	}

}
