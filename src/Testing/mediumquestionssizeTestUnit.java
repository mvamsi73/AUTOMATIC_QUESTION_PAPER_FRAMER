package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import projectpack.CRUD;

public class mediumquestionssizeTestUnit {

	@Test
	public void test() {
		CRUD cd=new CRUD();
		boolean res=cd.mediumquestionssize()>=0;
		assertEquals(true,res);
	}

}
