package bean;
import javax.persistence.*;
@Entity
@Table
public class neweasyquestionbean 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionnumber;
	private String questiondescription;
	private String difficultylevel;
	public int getQuestionnumber() {
		return questionnumber;
	}
	public void setQuestionnumber(int questionnumber) {
		this.questionnumber = questionnumber;
	}
	public String getQuestiondescription() {
		return questiondescription;
	}
	public void setQuestiondescription(String questiondescription) {
		this.questiondescription = questiondescription;
	}
	public String getDifficultylevel() {
		return difficultylevel;
	}
	public void setDifficultylevel(String difficultylevel) {
		this.difficultylevel = difficultylevel;
	}
	

}
