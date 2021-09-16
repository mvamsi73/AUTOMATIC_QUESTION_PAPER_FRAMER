package bean;

import javax.persistence.*;

@Entity
@Table
public class coursebean 
{
	@Id
	private int paperid;
	private String coursename;
	private int numofstudents;
	private String coursecode;
	public int getPaperid() {
		return paperid;
	}
	public void setPaperid(int paperid) {
		this.paperid = paperid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getNumofstudents() {
		return numofstudents;
	}
	public void setNumofstudents(int numofstudents) {
		this.numofstudents = numofstudents;
	}
	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	

}
