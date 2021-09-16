package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.coursebean;
import projectpack.CRUD;

public class insertcourseTestUnit {

	@Test
	public void testcase1() {
		CRUD cd=new CRUD();
		coursebean course=new coursebean();
		course.setCoursecode("19CS2103");
		course.setCoursename("ENTERPRICE PROGRAMMING");
		course.setNumofstudents(500);
		course.setPaperid(Integer.parseInt(cd.getpaperid())+1);
		boolean res=cd.insertcourse(course)>0;
		assertEquals(true,res);
	}

}
  