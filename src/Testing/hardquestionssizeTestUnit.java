package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import projectpack.CRUD;

public class hardquestionssizeTestUnit {

	@Test
	public void test() {
		CRUD cd=new CRUD();
		boolean res=cd.hardquestionssize()>=0;
		assertEquals(true,res);
	}

}
