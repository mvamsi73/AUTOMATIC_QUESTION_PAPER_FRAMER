package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.newhardquestionbean;
import projectpack.CRUD;

public class inserthardquestionTestUnit {

	@Test
	public void test() {
		CRUD cd =new CRUD();
		newhardquestionbean hard=new newhardquestionbean();
		hard.setDifficultylevel("Hard");
		hard.setQuestiondescription("Testing Question");
		boolean res=cd.inserthardquestion(hard)>0;
		assertEquals(true,res);
	}

}
