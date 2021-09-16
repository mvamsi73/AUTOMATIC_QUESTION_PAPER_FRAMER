package bean;

import javax.persistence.*;

@Entity
@Table
public class branchbean 
{
	@Id
	private int paperid;
	public int getPaperid() {
		return paperid;
	}
	public void setPaperid(int paperid) {
		this.paperid = paperid;
	}
	private String branch;
	private int numofcourses;
	private int numofstudents;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getNumofcourses() {
		return numofcourses;
	}
	public void setNumofcourses(int numofcourses) {
		this.numofcourses = numofcourses;
	}
	public int getNumofstudents() {
		return numofstudents;
	}
	public void setNumofstudents(int numofstudents) {
		this.numofstudents = numofstudents;
	}
	

}
