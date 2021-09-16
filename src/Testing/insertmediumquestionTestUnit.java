package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.newmediumquestionbean;
import projectpack.CRUD;

public class insertmediumquestionTestUnit {

	@Test
	public void test() {
		CRUD cd=new CRUD();
		newmediumquestionbean medium=new newmediumquestionbean();
		medium.setQuestiondescription("Testing Question");
		medium.setDifficultylevel("Medium");
		boolean res=cd.insertmediumquestion(medium)>0;
		assertEquals(true,res);
	}

}
