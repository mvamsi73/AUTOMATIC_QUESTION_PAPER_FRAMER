package Testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import bean.questionpaperbean;
import projectpack.CRUD;

public class getgeneratedpapersbyfacultyidTestUnit {
	
	@Test
	public void testcase1() {
		CRUD cd=new CRUD();
		List<questionpaperbean> lst=cd.getgeneratedpapersbyfacid(286);
		boolean res=lst.size()>=0;
		assertEquals(true,res);
	}
	@Test
	public void testcase2() {
		CRUD cd=new CRUD();
		List<questionpaperbean> lst=cd.getgeneratedpapersbyfacid(286);
		assertEquals(286,lst.get(lst.size()-1).getGeneratorid());
	}

}
