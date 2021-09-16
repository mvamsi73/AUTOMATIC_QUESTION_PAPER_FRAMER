package bean;

import javax.persistence.*;

@Entity
@Table
public class semesterbean 
{
	@Id
	private int paperid;
	private int semnum;
	private String semtype;
	private int numofst;
	private int numofbranch;
	public int getSemnum() {
		return semnum;
	}
	public void setSemnum(int semnum) {
		this.semnum = semnum;
	}
	public String getSemtype() {
		return semtype;
	}
	public void setSemtype(String semtype) {
		this.semtype = semtype;
	}
	public int getPaperid() {
		return paperid;
	}
	public void setPaperid(int paperid) {
		this.paperid = paperid;
	}
	public int getNumofst() {
		return numofst;
	}
	public void setNumofst(int numofst) {
		this.numofst = numofst;
	}
	public int getNumofbranch() {
		return numofbranch;
	}
	public void setNumofbranch(int numofbranch) {
		this.numofbranch = numofbranch;
	}

}
