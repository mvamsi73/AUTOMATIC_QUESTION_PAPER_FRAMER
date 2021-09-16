package bean;
import javax.persistence.*;
@Entity
@Table
public class questionpaperbean 
{
	@Id
	private int paperid;
	private int generatorid;
	private double totalpartAmarks;
	private double totalpartBmarks;
	private double totalpartCmarks;
	private double totalpartDmarks;
	private int numofpartAeasyquestions;
	private int numofpartAmediumquestions;
	private int numofpartAhardquestions;
	private int numofpartBeasyquestions;
	private int numofpartBmediumquestions;
	private int numofpartBhardquestions;
	private int numofpartCeasyquestions;
	private int numofpartCmediumquestions;
	private int numofpartChardquestions;
	private int numofpartDeasyquestions;
	private int numofpartDmediumquestions;
	private int numofpartDhardquestions;
	private double partAeasyquestionsmarks;
	private double partAmediumquestionsmarks;
	private double partAhardquestionsmarks;
	private double partBeasyquestionsmarks;
	private double partBmediumquestionsmarks;
	private double partBhardquestionsmarks;
	private double partCeasyquestionsmarks;
	private double partCmediumquestionsmarks;
	private double partChardquestionsmarks;
	private double partDeasyquestionsmarks;
	private double partDmediumquestionsmarks;
	private double partDhardquestionsmarks;
	public int getNumofpartAeasyquestions() {
		return numofpartAeasyquestions;
	}
	public void setNumofpartAeasyquestions(int numofpartAeasyquestions) {
		this.numofpartAeasyquestions = numofpartAeasyquestions;
	}
	public int getNumofpartAmediumquestions() {
		return numofpartAmediumquestions;
	}
	public void setNumofpartAmediumquestions(int numofpartAmediumquestions) {
		this.numofpartAmediumquestions = numofpartAmediumquestions;
	}
	public int getNumofpartAhardquestions() {
		return numofpartAhardquestions;
	}
	public void setNumofpartAhardquestions(int numofpartAhardquestions) {
		this.numofpartAhardquestions = numofpartAhardquestions;
	}
	public int getNumofpartBeasyquestions() {
		return numofpartBeasyquestions;
	}
	public void setNumofpartBeasyquestions(int numofpartBeasyquestions) {
		this.numofpartBeasyquestions = numofpartBeasyquestions;
	}
	public int getNumofpartBmediumquestions() {
		return numofpartBmediumquestions;
	}
	public void setNumofpartBmediumquestions(int numofpartBmediumquestions) {
		this.numofpartBmediumquestions = numofpartBmediumquestions;
	}
	public int getNumofpartBhardquestions() {
		return numofpartBhardquestions;
	}
	public void setNumofpartBhardquestions(int numofpartBhardquestions) {
		this.numofpartBhardquestions = numofpartBhardquestions;
	}
	public int getNumofpartCeasyquestions() {
		return numofpartCeasyquestions;
	}
	public void setNumofpartCeasyquestions(int numofpartCeasyquestions) {
		this.numofpartCeasyquestions = numofpartCeasyquestions;
	}
	public int getNumofpartCmediumquestions() {
		return numofpartCmediumquestions;
	}
	public void setNumofpartCmediumquestions(int numofpartCmediumquestions) {
		this.numofpartCmediumquestions = numofpartCmediumquestions;
	}
	public int getNumofpartChardquestions() {
		return numofpartChardquestions;
	}
	public void setNumofpartChardquestions(int numofpartChardquestions) {
		this.numofpartChardquestions = numofpartChardquestions;
	}
	public int getNumofpartDeasyquestions() {
		return numofpartDeasyquestions;
	}
	public void setNumofpartDeasyquestions(int numofpartDeasyquestions) {
		this.numofpartDeasyquestions = numofpartDeasyquestions;
	}
	public int getNumofpartDmediumquestions() {
		return numofpartDmediumquestions;
	}
	public void setNumofpartDmediumquestions(int numofpartDmediumquestions) {
		this.numofpartDmediumquestions = numofpartDmediumquestions;
	}
	public int getNumofpartDhardquestions() {
		return numofpartDhardquestions;
	}
	public void setNumofpartDhardquestions(int numofpartDhardquestions) {
		this.numofpartDhardquestions = numofpartDhardquestions;
	}
	public double getPartAeasyquestionsmarks() {
		return partAeasyquestionsmarks;
	}
	public void setPartAeasyquestionsmarks(double partAeasyquestionsmarks) {
		this.partAeasyquestionsmarks = partAeasyquestionsmarks;
	}
	public double getPartAmediumquestionsmarks() {
		return partAmediumquestionsmarks;
	}
	public void setPartAmediumquestionsmarks(double partAmediumquestionsmarks) {
		this.partAmediumquestionsmarks = partAmediumquestionsmarks;
	}
	public double getPartAhardquestionsmarks() {
		return partAhardquestionsmarks;
	}
	public void setPartAhardquestionsmarks(double partAhardquestionsmarks) {
		this.partAhardquestionsmarks = partAhardquestionsmarks;
	}
	public double getPartBeasyquestionsmarks() {
		return partBeasyquestionsmarks;
	}
	public void setPartBeasyquestionsmarks(double partBeasyquestionsmarks) {
		this.partBeasyquestionsmarks = partBeasyquestionsmarks;
	}
	public double getPartBmediumquestionsmarks() {
		return partBmediumquestionsmarks;
	}
	public void setPartBmediumquestionsmarks(double partBmediumquestionsmarks) {
		this.partBmediumquestionsmarks = partBmediumquestionsmarks;
	}
	public double getPartBhardquestionsmarks() {
		return partBhardquestionsmarks;
	}
	public void setPartBhardquestionsmarks(double partBhardquestionsmarks) {
		this.partBhardquestionsmarks = partBhardquestionsmarks;
	}
	public double getPartCeasyquestionsmarks() {
		return partCeasyquestionsmarks;
	}
	public void setPartCeasyquestionsmarks(double partCeasyquestionsmarks) {
		this.partCeasyquestionsmarks = partCeasyquestionsmarks;
	}
	public double getPartCmediumquestionsmarks() {
		return partCmediumquestionsmarks;
	}
	public void setPartCmediumquestionsmarks(double partCmediumquestionsmarks) {
		this.partCmediumquestionsmarks = partCmediumquestionsmarks;
	}
	public double getPartChardquestionsmarks() {
		return partChardquestionsmarks;
	}
	public void setPartChardquestionsmarks(double partChardquestionsmarks) {
		this.partChardquestionsmarks = partChardquestionsmarks;
	}
	public double getPartDeasyquestionsmarks() {
		return partDeasyquestionsmarks;
	}
	public void setPartDeasyquestionsmarks(double partDeasyquestionsmarks) {
		this.partDeasyquestionsmarks = partDeasyquestionsmarks;
	}
	public double getPartDmediumquestionsmarks() {
		return partDmediumquestionsmarks;
	}
	public void setPartDmediumquestionsmarks(double partDmediumquestionsmarks) {
		this.partDmediumquestionsmarks = partDmediumquestionsmarks;
	}
	public double getPartDhardquestionsmarks() {
		return partDhardquestionsmarks;
	}
	public void setPartDhardquestionsmarks(double partDhardquestionsmarks) {
		this.partDhardquestionsmarks = partDhardquestionsmarks;
	}
	
	public double getTotalpartAmarks() {
		return totalpartAmarks;
	}
	public void setTotalpartAmarks(double totalpartAmarks) {
		this.totalpartAmarks = totalpartAmarks;
	}
	public double getTotalpartBmarks() {
		return totalpartBmarks;
	}
	public void setTotalpartBmarks(double totalpartBmarks) {
		this.totalpartBmarks = totalpartBmarks;
	}
	public double getTotalpartCmarks() {
		return totalpartCmarks;
	}
	public void setTotalpartCmarks(double totalpartCmarks) {
		this.totalpartCmarks = totalpartCmarks;
	}
	public double getTotalpartDmarks() {
		return totalpartDmarks;
	}
	public void setTotalpartDmarks(double totalpartDmarks) {
		this.totalpartDmarks = totalpartDmarks;
	}
	public void setTotalpartDmarks(int totalpartDmarks) {
		this.totalpartDmarks = totalpartDmarks;
	}
	private String question1;
	private String question2;
	private String question3;
	private String question4;
	private String question5;
	private String question6;
	private String question7;
	private String question8;
	private String question9;
	private String question10;
	private String question11;
	private String question12;
	private String question13;
	private String question14;
	private String question15;
	private String question16;
	private String question17;
	private String question18;
	private String question19;
	private String question20;
	private String coursename;
	private String coursecode;
	private double question1marks;
	private double question2marks;
	private double question3marks;
	private double question4marks;
	private double question5marks;
	private double question6marks;
	private double question7marks;
	private double question8marks;
	private double question9marks;
	private double question10marks;
	private double question11marks;
	private double question12marks;
	private double question13marks;
	private double question14marks;
	private double question15marks;
	private double question16marks;
	private double question17marks;
	private double question18marks;
	private double question19marks;
	private double question20marks;
	public double getQuestion1marks() {
		return question1marks;
	}
	public void setQuestion1marks(double question1marks) {
		this.question1marks = question1marks;
	}
	public double getQuestion2marks() {
		return question2marks;
	}
	public void setQuestion2marks(double question2marks) {
		this.question2marks = question2marks;
	}
	public double getQuestion3marks() {
		return question3marks;
	}
	public void setQuestion3marks(double question3marks) {
		this.question3marks = question3marks;
	}
	public double getQuestion4marks() {
		return question4marks;
	}
	public void setQuestion4marks(double question4marks) {
		this.question4marks = question4marks;
	}
	public double getQuestion5marks() {
		return question5marks;
	}
	public void setQuestion5marks(double question5marks) {
		this.question5marks = question5marks;
	}
	public double getQuestion6marks() {
		return question6marks;
	}
	public void setQuestion6marks(double question6marks) {
		this.question6marks = question6marks;
	}
	public double getQuestion7marks() {
		return question7marks;
	}
	public void setQuestion7marks(double question7marks) {
		this.question7marks = question7marks;
	}
	public double getQuestion8marks() {
		return question8marks;
	}
	public void setQuestion8marks(double question8marks) {
		this.question8marks = question8marks;
	}
	public double getQuestion9marks() {
		return question9marks;
	}
	public void setQuestion9marks(double question9marks) {
		this.question9marks = question9marks;
	}
	public double getQuestion10marks() {
		return question10marks;
	}
	public void setQuestion10marks(double question10marks) {
		this.question10marks = question10marks;
	}
	public double getQuestion11marks() {
		return question11marks;
	}
	public void setQuestion11marks(double question11marks) {
		this.question11marks = question11marks;
	}
	public double getQuestion12marks() {
		return question12marks;
	}
	public void setQuestion12marks(double question12marks) {
		this.question12marks = question12marks;
	}
	public double getQuestion13marks() {
		return question13marks;
	}
	public void setQuestion13marks(double question13marks) {
		this.question13marks = question13marks;
	}
	public double getQuestion14marks() {
		return question14marks;
	}
	public void setQuestion14marks(double question14marks) {
		this.question14marks = question14marks;
	}
	public double getQuestion15marks() {
		return question15marks;
	}
	public void setQuestion15marks(double question15marks) {
		this.question15marks = question15marks;
	}
	public double getQuestion16marks() {
		return question16marks;
	}
	public void setQuestion16marks(double question16marks) {
		this.question16marks = question16marks;
	}
	public double getQuestion17marks() {
		return question17marks;
	}
	public void setQuestion17marks(double question17marks) {
		this.question17marks = question17marks;
	}
	public double getQuestion18marks() {
		return question18marks;
	}
	public void setQuestion18marks(double question18marks) {
		this.question18marks = question18marks;
	}
	public double getQuestion19marks() {
		return question19marks;
	}
	public void setQuestion19marks(double question19marks) {
		this.question19marks = question19marks;
	}
	public double getQuestion20marks() {
		return question20marks;
	}
	public void setQuestion20marks(double question20marks) {
		this.question20marks = question20marks;
	}
	public String getQuestion1difficultylevel() {
		return question1difficultylevel;
	}
	public void setQuestion1difficultylevel(String question1difficultylevel) {
		this.question1difficultylevel = question1difficultylevel;
	}
	public String getQuestion2difficultylevel() {
		return question2difficultylevel;
	}
	public void setQuestion2difficultylevel(String question2difficultylevel) {
		this.question2difficultylevel = question2difficultylevel;
	}
	public String getQuestion3difficultylevel() {
		return question3difficultylevel;
	}
	public void setQuestion3difficultylevel(String question3difficultylevel) {
		this.question3difficultylevel = question3difficultylevel;
	}
	public String getQuestion4difficultylevel() {
		return question4difficultylevel;
	}
	public void setQuestion4difficultylevel(String question4difficultylevel) {
		this.question4difficultylevel = question4difficultylevel;
	}
	public String getQuestion5difficultylevel() {
		return question5difficultylevel;
	}
	public void setQuestion5difficultylevel(String question5difficultylevel) {
		this.question5difficultylevel = question5difficultylevel;
	}
	public String getQuestion6difficultylevel() {
		return question6difficultylevel;
	}
	public void setQuestion6difficultylevel(String question6difficultylevel) {
		this.question6difficultylevel = question6difficultylevel;
	}
	public String getQuestion7difficultylevel() {
		return question7difficultylevel;
	}
	public void setQuestion7difficultylevel(String question7difficultylevel) {
		this.question7difficultylevel = question7difficultylevel;
	}
	public String getQuestion8difficultylevel() {
		return question8difficultylevel;
	}
	public void setQuestion8difficultylevel(String question8difficultylevel) {
		this.question8difficultylevel = question8difficultylevel;
	}
	public String getQuestion9difficultylevel() {
		return question9difficultylevel;
	}
	public void setQuestion9difficultylevel(String question9difficultylevel) {
		this.question9difficultylevel = question9difficultylevel;
	}
	public String getQuestion10difficultylevel() {
		return question10difficultylevel;
	}
	public void setQuestion10difficultylevel(String question10difficultylevel) {
		this.question10difficultylevel = question10difficultylevel;
	}
	public String getQuestion11difficultylevel() {
		return question11difficultylevel;
	}
	public void setQuestion11difficultylevel(String question11difficultylevel) {
		this.question11difficultylevel = question11difficultylevel;
	}
	public String getQuestion12difficultylevel() {
		return question12difficultylevel;
	}
	public void setQuestion12difficultylevel(String question12difficultylevel) {
		this.question12difficultylevel = question12difficultylevel;
	}
	public String getQuestion13difficultylevel() {
		return question13difficultylevel;
	}
	public void setQuestion13difficultylevel(String question13difficultylevel) {
		this.question13difficultylevel = question13difficultylevel;
	}
	public String getQuestion14difficultylevel() {
		return question14difficultylevel;
	}
	public void setQuestion14difficultylevel(String question14difficultylevel) {
		this.question14difficultylevel = question14difficultylevel;
	}
	public String getQuestion15difficultylevel() {
		return question15difficultylevel;
	}
	public void setQuestion15difficultylevel(String question15difficultylevel) {
		this.question15difficultylevel = question15difficultylevel;
	}
	public String getQuestion16difficultylevel() {
		return question16difficultylevel;
	}
	public void setQuestion16difficultylevel(String question16difficultylevel) {
		this.question16difficultylevel = question16difficultylevel;
	}
	public String getQuestion17difficultylevel() {
		return question17difficultylevel;
	}
	public void setQuestion17difficultylevel(String question17difficultylevel) {
		this.question17difficultylevel = question17difficultylevel;
	}
	public String getQuestion18difficultylevel() {
		return question18difficultylevel;
	}
	public void setQuestion18difficultylevel(String question18difficultylevel) {
		this.question18difficultylevel = question18difficultylevel;
	}
	public String getQuestion19difficultylevel() {
		return question19difficultylevel;
	}
	public void setQuestion19difficultylevel(String question19difficultylevel) {
		this.question19difficultylevel = question19difficultylevel;
	}
	public String getQuestion20difficultylevel() {
		return question20difficultylevel;
	}
	public void setQuestion20difficultylevel(String question20difficultylevel) {
		this.question20difficultylevel = question20difficultylevel;
	}
	private String question1difficultylevel;
	private String question2difficultylevel;
	private String question3difficultylevel;
	private String question4difficultylevel;
	private String question5difficultylevel;
	private String question6difficultylevel;
	private String question7difficultylevel;
	private String question8difficultylevel;
	private String question9difficultylevel;
	private String question10difficultylevel;
	private String question11difficultylevel;
	private String question12difficultylevel;
	private String question13difficultylevel;
	private String question14difficultylevel;
	private String question15difficultylevel;
	private String question16difficultylevel;
	private String question17difficultylevel;
	private String question18difficultylevel;
	private String question19difficultylevel;
	private String question20difficultylevel;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	public String getQuestion19() {
		return question19;
	}
	public void setQuestion19(String question19) {
		this.question19 = question19;
	}
	public String getQuestion20() {
		return question20;
	}
	public void setQuestion20(String question20) {
		this.question20 = question20;
	}
	public int getPaperid() {
		return paperid;
	}
	public void setPaperid(int paperid) {
		this.paperid = paperid;
	}
	public int getGeneratorid() {
		return generatorid;
	}
	public void setGeneratorid(int generatorid) {
		this.generatorid = generatorid;
	}
	public String getQuestion1() {
		return question1;
	}
	public void setQuestion1(String question1) {
		this.question1 = question1;
	}
	public String getQuestion2() {
		return question2;
	}
	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	public String getQuestion3() {
		return question3;
	}
	public void setQuestion3(String question3) {
		this.question3 = question3;
	}
	public String getQuestion4() {
		return question4;
	}
	public void setQuestion4(String question4) {
		this.question4 = question4;
	}
	public String getQuestion5() {
		return question5;
	}
	public void setQuestion5(String question5) {
		this.question5 = question5;
	}
	public String getQuestion6() {
		return question6;
	}
	public void setQuestion6(String question6) {
		this.question6 = question6;
	}
	public String getQuestion7() {
		return question7;
	}
	public void setQuestion7(String question7) {
		this.question7 = question7;
	}
	public String getQuestion8() {
		return question8;
	}
	public void setQuestion8(String question8) {
		this.question8 = question8;
	}
	public String getQuestion9() {
		return question9;
	}
	public void setQuestion9(String question9) {
		this.question9 = question9;
	}
	public String getQuestion10() {
		return question10;
	}
	public void setQuestion10(String question10) {
		this.question10 = question10;
	}
	public String getQuestion11() {
		return question11;
	}
	public void setQuestion11(String question11) {
		this.question11 = question11;
	}
	public String getQuestion12() {
		return question12;
	}
	public void setQuestion12(String question12) {
		this.question12 = question12;
	}
	public String getQuestion13() {
		return question13;
	}
	public void setQuestion13(String question13) {
		this.question13 = question13;
	}
	public String getQuestion14() {
		return question14;
	}
	public void setQuestion14(String question14) {
		this.question14 = question14;
	}
	public String getQuestion15() {
		return question15;
	}
	public void setQuestion15(String question15) {
		this.question15 = question15;
	}
	public String getQuestion16() {
		return question16;
	}
	public void setQuestion16(String question16) {
		this.question16 = question16;
	}
	public String getQuestion17() {
		return question17;
	}
	public void setQuestion17(String question17) {
		this.question17 = question17;
	}
	public String getQuestion18() {
		return question18;
	}
	public void setQuestion18(String question18) {
		this.question18 = question18;
	}
	
}