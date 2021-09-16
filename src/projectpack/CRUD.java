package projectpack;
import java.sql.*;
import java.util.*;
import bean.*;
import org.hibernate.Query;
public class CRUD 
{
	public int insert(ProjectSignUpBean s)
	{
		config con=new config();
		Query q=con.session.createQuery("from ProjectSignUpBean");
		List<ProjectSignUpBean> lst=q.list();
		for(ProjectSignUpBean i:lst)
		{
			if(i.getId()==s.getId()||i.getEmail().equals(s.getEmail()))
			{
				return 0;
			}
		}
		int i=(Integer) con.session.save(s);
		con.t.commit();
		con.session.close();
		con.sf.close();
		return i;
	}
	
	public List<ProjectSignUpBean> display()
	{
		config con=new config();
		Query q=con.session.createQuery("from ProjectSignUpBean");
		List<ProjectSignUpBean> lst=q.list();
		con.session.close();
		con.sf.close();
		return lst;
	}
	public boolean validate(ProjectLogInBean lb)
	{
		config con=new config();
		Query q=con.session.createQuery("from ProjectSignUpBean");
		List<ProjectSignUpBean> projectloginbean= (List<ProjectSignUpBean>) q.list();
		con.session.close();
		con.sf.close();
		for(ProjectSignUpBean i:projectloginbean)
		{
			if(i.getId()==lb.getId()&&i.getPassword().equals(lb.getPassword()))
			{
				return true;
			}
		}		
		return false;
	}
	public String getfacultyName(int id)
	{
		config con=new config();
		Query q=con.session.createQuery("select name from ProjectSignUpBean where id=:id");
		q.setParameter("id", id);
		String name=(String) q.uniqueResult();
		System.out.println(name+" "+id);
		con.session.close();
		con.sf.close();
		return name;
	}
	public boolean adminvalidate(admin ab)
	{
		config con=new config();
		Query q=con.session.createQuery("from admin");
		List<admin> lst=q.list();
		for(admin i:lst)
		{
			if(i.getId()==ab.getId() && i.getPassword().equals(ab.getPassword()))
			{
				con.session.close();
				con.sf.close();
				return true;
			}
		}
		con.session.close();
		con.sf.close();
		return false;
	}
	public List<ProjectSignUpBean> getdetailsbyid(int id)
	{
		config con=new config();
		Query q=con.session.createQuery("from ProjectSignUpBean where id=:key");
		q.setParameter("key", id);
		List<ProjectSignUpBean> lst=q.list();
		con.session.close();
		con.sf.close();
		return lst;
	}
	public int updatedetails(ProjectSignUpBean pb,int key)
	{
		config con=new config();
		Query q=con.session.createQuery("update ProjectSignUpBean set id=:id,name=:name,position=:pos,email=:email,phno=:phno,dept=:dept,subject=:sub,password=:pass where id=:key");
		q.setParameter("id", pb.getId());
		q.setParameter("name", pb.getName());
		q.setParameter("pos", pb.getPosition());
		q.setParameter("email", pb.getEmail());
		q.setParameter("phno", pb.getPhno());
		q.setParameter("dept", pb.getDept());
		q.setParameter("sub", pb.getSubject());
		q.setParameter("pass", pb.getPassword());
		q.setParameter("key", key);
		int i=q.executeUpdate();
		con.session.close();
		con.sf.close();
		return i;
	}
	public int deleteaccount(int key)
	{
		config con=new config();
		Query q=con.session.createQuery("delete from ProjectSignUpBean where id=:key");
		q.setParameter("key", key);
		int i=q.executeUpdate();
		con.session.close();
		con.sf.close();
		return i;
	}
	public int insertsemester(semesterbean sb)
	{
		config con=new config();
		int i=Integer.parseInt(String.valueOf(con.session.save(sb)));
		con.t.commit();
		con.session.close();
		con.sf.close();
		return i;
	}
	public int insertbranch(branchbean bb)
	{
		config con=new config();
		int i=Integer.parseInt(String.valueOf(con.session.save(bb)));
		con.t.commit();
		con.session.close();
		con.sf.close();
		return i;
	}
	public int insertcourse(coursebean cb)
	{
		config con=new config();
		int i=Integer.parseInt(String.valueOf(con.session.save(cb)));
		con.t.commit();
		con.session.close();
		con.sf.close();
		return i;
	}
	public int inserteasyquestion(neweasyquestionbean qb)
	{
		config con=new config();
		int i=Integer.parseInt(String.valueOf(con.session.save(qb)));
		con.t.commit();
		con.session.close();
		con.sf.close();
		return i;
	}
	public int insertmediumquestion(newmediumquestionbean qb)
	{
		config con=new config();
		int i=Integer.parseInt(String.valueOf(con.session.save(qb)));
		con.t.commit();
		con.session.close();
		con.sf.close();
		return i;
	}
	public int inserthardquestion(newhardquestionbean qb)
	{
		config con=new config();
		int i=Integer.parseInt(String.valueOf(con.session.save(qb)));
		con.t.commit();
		con.session.close();
		con.sf.close();
		return i;
	}
	public List<neweasyquestionbean> geteasyquestions()
	{
		config con=new config();
		Query q=con.session.createQuery("from neweasyquestionbean");
		List<neweasyquestionbean> easy=q.list();
		con.session.close();
		con.sf.close();
		return easy;
	}
	public List<newmediumquestionbean> getmediumquestions()
	{
		config con=new config();
		Query q=con.session.createQuery("from newmediumquestionbean");
		List<newmediumquestionbean> medium=q.list();
		con.session.close();
		con.sf.close();
		return medium;
	}
	public List<newhardquestionbean> gethardquestions()
	{
		config con=new config();
		Query q=con.session.createQuery("from newhardquestionbean");
		List<newhardquestionbean> hard=q.list();
		con.session.close();
		con.sf.close();
		return hard;
	}
	public ArrayList<Integer> getquestionslist(int size)
	{
		ArrayList<Integer> randomlst=new ArrayList<Integer>();
		for(int i=1;i<=size;i++)
		{
			randomlst.add(i);
		}
		Collections.shuffle(randomlst);
		return randomlst;
	}
	public void emptyproject()
	{
		config con=new config();
		Query q=con.session.createQuery("delete from branchbean");
		q.executeUpdate();
		Query q1=con.session.createQuery("delete from coursebean");
		q1.executeUpdate();
		Query q2=con.session.createQuery("delete from semesterbean");
		q2.executeUpdate();
		System.out.println("Tables Cleared ");
		con.session.close();
		con.sf.close();
	}
	public int easyquestionssize()
	{
		config con=new config();
		Query q=con.session.createQuery("select max(questionnumber) from neweasyquestionbean");
		int size=(Integer) q.uniqueResult();
		con.session.close();
		con.sf.close();
		return size;
	}
	public int mediumquestionssize()
	{
		config con=new config();
		Query q=con.session.createQuery("select max(questionnumber) from newmediumquestionbean");
		int size=(Integer) q.uniqueResult();
		con.session.close();
		con.sf.close();
		return size;
	}
	public int hardquestionssize()
	{
		config con=new config();
		Query q=con.session.createQuery("select max(questionnumber) from newhardquestionbean");
		int size=(Integer) q.uniqueResult();
		con.session.close();
		con.sf.close();
		return size;
	}
	public List<neweasyquestionbean> geteasyquestiondescription(int qnnum)
	{
		config con=new config();
		Query q=con.session.createQuery("from neweasyquestionbean where questionnumber=:qnnum");
		q.setParameter("qnnum", qnnum);
		List<neweasyquestionbean> lst=q.list();
		con.session.close();
		con.sf.close();
		return lst;
	}
	public List<newmediumquestionbean> getmediumquestiondescription(int qnnum)
	{
		config con=new config();
		Query q=con.session.createQuery("from newmediumquestionbean where questionnumber=:qnnum");
		q.setParameter("qnnum", qnnum);
		List<newmediumquestionbean> lst=q.list();
		con.session.close();
		con.sf.close();
		return lst;
	}
	public List<newhardquestionbean> gethardquestiondescription(int qnnum)
	{
		config con=new config();
		Query q=con.session.createQuery("from newhardquestionbean where questionnumber=:qnnum");
		q.setParameter("qnnum", qnnum);
		List<newhardquestionbean> lst=q.list();
		con.session.close();
		con.sf.close();
		return lst;
	}
	public int insertnewqpaper(questionpaperbean qb)
	{
		config con=new config();
		int i=Integer.parseInt(String.valueOf(con.session.save(qb)));
		con.t.commit();
		con.session.close();
		con.sf.close();
		return i;
	}
	public List<questionpaperbean> getgeneratedpapersbyfacid(int id)
	{
		config con=new config();
		Query q=con.session.createQuery("from questionpaperbean where generatorid=:id");
		q.setParameter("id", id);
		List<questionpaperbean> data=q.list();
		return data;
	}
	public List<questionpaperbean> getgeneratedpaperspaperid(int id)
	{
		config con=new config();
		Query q=con.session.createQuery("from questionpaperbean where paperid=:id");
		q.setParameter("id", id);
		List<questionpaperbean> data=q.list();
		return data;
	}
	public String getpaperid()
	{
		config con=new config();
		Query q=con.session.createQuery("select max(paperid) from semesterbean");
		String paperid=String.valueOf(q.uniqueResult());
		return paperid;
	}
}
