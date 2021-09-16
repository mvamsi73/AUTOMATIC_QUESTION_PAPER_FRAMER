package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import bean.admin;
import projectpack.CRUD;

public class adminLoginValidateTestUnit {

	@Test
	public void testcase1() 
	{
		admin ad=new admin();
		CRUD cd=new CRUD();
		ad.setId(190030286);
		ad.setPassword("mohanvamsi999");
		assertEquals(true,cd.adminvalidate(ad));
	}
	@Test
	public void testcase2() 
	{
		admin ad=new admin();
		CRUD cd=new CRUD();
		ad.setId(190030286);
		ad.setPassword("mohanvamsi");
		assertEquals(false,cd.adminvalidate(ad));
	}

}
