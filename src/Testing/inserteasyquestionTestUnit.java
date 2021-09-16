package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.neweasyquestionbean;
import projectpack.CRUD;

public class inserteasyquestionTestUnit {

	@Test
	public void test() 
	{
		CRUD cd=new CRUD();
		neweasyquestionbean easy=new neweasyquestionbean();
		easy.setQuestiondescription("Testing Question");
		easy.setDifficultylevel("Easy");
		boolean res=cd.inserteasyquestion(easy)>0;
		assertEquals(true,res);
	}

}
