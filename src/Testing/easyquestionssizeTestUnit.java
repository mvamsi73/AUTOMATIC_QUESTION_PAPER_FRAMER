package Testing;

import static org.junit.Assert.*;

import org.junit.Test;
import projectpack.CRUD;
public class easyquestionssizeTestUnit {

	@Test
	public void test() {
		CRUD cd=new CRUD();
		boolean res=cd.easyquestionssize()>=0;
		assertEquals(true,res);
	}

}
