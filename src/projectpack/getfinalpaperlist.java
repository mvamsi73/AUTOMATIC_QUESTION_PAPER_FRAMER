package projectpack;

import java.util.*;
import bean.*;
public class getfinalpaperlist 
{
	public ArrayList<String> getfinalpaper(questionpaperbean qb)
	{
		int easyA=qb.getNumofpartAeasyquestions(),mediumA=qb.getNumofpartAmediumquestions(),hardA=qb.getNumofpartAhardquestions();
		int easyB=qb.getNumofpartBeasyquestions(),mediumB=qb.getNumofpartBmediumquestions(),hardB=qb.getNumofpartBhardquestions();
		int easyC=qb.getNumofpartCeasyquestions(),mediumC=qb.getNumofpartCmediumquestions(),hardC=qb.getNumofpartChardquestions();
		int easyD=qb.getNumofpartDeasyquestions(),mediumD=qb.getNumofpartDmediumquestions(),hardD=qb.getNumofpartDhardquestions();
	CRUD cd=new CRUD();
	ArrayList<Integer> easyquestions=cd.getquestionslist(cd.easyquestionssize());
	ArrayList<Integer> mediumquestions=cd.getquestionslist(cd.mediumquestionssize());
	ArrayList<Integer> hardquestions=cd.getquestionslist(cd.hardquestionssize());
	ArrayList<String> finalpaper=new ArrayList<String>();
	ArrayList<Double> qmarks=new ArrayList<Double>();
	ArrayList<String> difflevel=new ArrayList<String>();
	for(int i=0;i<easyA;i++)
	{
		List<neweasyquestionbean> easy=cd.geteasyquestiondescription(easyquestions.get(i));
		finalpaper.add(easy.get(0).getQuestiondescription());
		qmarks.add(qb.getPartAeasyquestionsmarks());
		difflevel.add(easy.get(0).getDifficultylevel());
	}
	for(int i=0;i<mediumA;i++)
	{
		List<newmediumquestionbean> medium=cd.getmediumquestiondescription(mediumquestions.get(i));
		finalpaper.add(medium.get(0).getQuestiondescription());
		qmarks.add(qb.getPartAmediumquestionsmarks());
		difflevel.add(medium.get(0).getDifficultylevel());
	}
	for(int i=0;i<hardA;i++)
	{
		List<newhardquestionbean> hard=cd.gethardquestiondescription(hardquestions.get(i));
		finalpaper.add(hard.get(0).getQuestiondescription());
		qmarks.add(qb.getPartAhardquestionsmarks());
		difflevel.add(hard.get(0).getDifficultylevel());
	}
	for(int i=easyA;i<easyA+easyB;i++)
	{
		List<neweasyquestionbean> easy=cd.geteasyquestiondescription(easyquestions.get(i));
		finalpaper.add(easy.get(0).getQuestiondescription());
		qmarks.add(qb.getPartBeasyquestionsmarks());
		difflevel.add(easy.get(0).getDifficultylevel());
	}
	for(int i=mediumA;i<mediumA+mediumB;i++)
	{
		List<newmediumquestionbean> medium=cd.getmediumquestiondescription(mediumquestions.get(i));
		finalpaper.add(medium.get(0).getQuestiondescription());
		qmarks.add(qb.getPartBmediumquestionsmarks());
		difflevel.add(medium.get(0).getDifficultylevel());
	}
	for(int i=hardA;i<hardA+hardB;i++)
	{
		List<newhardquestionbean> hard=cd.gethardquestiondescription(hardquestions.get(i));
		finalpaper.add(hard.get(0).getQuestiondescription());
		qmarks.add(qb.getPartBhardquestionsmarks());
		difflevel.add(hard.get(0).getDifficultylevel());
	}
	for(int i=easyA+easyB;i<easyA+easyB+easyC;i++)
	{
		List<neweasyquestionbean> easy=cd.geteasyquestiondescription(easyquestions.get(i));
		finalpaper.add(easy.get(0).getQuestiondescription());
		qmarks.add(qb.getPartCeasyquestionsmarks());
		difflevel.add(easy.get(0).getDifficultylevel());
	}
	for(int i=mediumA+mediumB;i<mediumA+mediumB+mediumC;i++)
	{
		List<newmediumquestionbean> medium=cd.getmediumquestiondescription(mediumquestions.get(i));
		finalpaper.add(medium.get(0).getQuestiondescription());
		qmarks.add(qb.getPartCmediumquestionsmarks());
		difflevel.add(medium.get(0).getDifficultylevel());
	}
	for(int i=hardA+hardB;i<hardA+hardB+hardC;i++)
	{
		List<newhardquestionbean> hard=cd.gethardquestiondescription(hardquestions.get(i));
		finalpaper.add(hard.get(0).getQuestiondescription());
		qmarks.add(qb.getPartChardquestionsmarks());
		difflevel.add(hard.get(0).getDifficultylevel());
	}
	for(int i=easyA+easyB+easyC;i<easyA+easyB+easyC+easyD;i++)
	{
		List<neweasyquestionbean> easy=cd.geteasyquestiondescription(easyquestions.get(i));
		finalpaper.add(easy.get(0).getQuestiondescription());
		qmarks.add(qb.getPartDeasyquestionsmarks());
		difflevel.add(easy.get(0).getDifficultylevel());
	}
	for(int i=mediumA+mediumB+mediumC;i<mediumA+mediumB+mediumC+mediumD;i++)
	{
		List<newmediumquestionbean> medium=cd.getmediumquestiondescription(mediumquestions.get(i));
		finalpaper.add(medium.get(0).getQuestiondescription());
		qmarks.add(qb.getPartDmediumquestionsmarks());
		difflevel.add(medium.get(0).getDifficultylevel());
	}
	for(int i=hardA+hardB+hardC;i<hardA+hardB+hardC+hardD;i++)
	{
		List<newhardquestionbean> hard=cd.gethardquestiondescription(hardquestions.get(i));
		finalpaper.add(hard.get(0).getQuestiondescription());
		qmarks.add(qb.getPartDhardquestionsmarks());
		difflevel.add(hard.get(0).getDifficultylevel());
	}
	qb.setQuestion1marks(qmarks.get(0));
	qb.setQuestion2marks(qmarks.get(1));
	qb.setQuestion3marks(qmarks.get(2));
	qb.setQuestion4marks(qmarks.get(3));
	qb.setQuestion5marks(qmarks.get(4));
	qb.setQuestion6marks(qmarks.get(5));
	qb.setQuestion7marks(qmarks.get(6));
	qb.setQuestion8marks(qmarks.get(7));
	qb.setQuestion9marks(qmarks.get(8));
	qb.setQuestion10marks(qmarks.get(9));
	qb.setQuestion11marks(qmarks.get(10));
	qb.setQuestion12marks(qmarks.get(11));
	qb.setQuestion13marks(qmarks.get(12));
	qb.setQuestion14marks(qmarks.get(13));
	qb.setQuestion15marks(qmarks.get(14));
	qb.setQuestion16marks(qmarks.get(15));
	qb.setQuestion17marks(qmarks.get(16));
	qb.setQuestion18marks(qmarks.get(17));
	qb.setQuestion19marks(qmarks.get(18));
	qb.setQuestion20marks(qmarks.get(19));
	qb.setQuestion1difficultylevel(difflevel.get(0));
	qb.setQuestion2difficultylevel(difflevel.get(1));
	qb.setQuestion3difficultylevel(difflevel.get(2));
	qb.setQuestion4difficultylevel(difflevel.get(3));
	qb.setQuestion5difficultylevel(difflevel.get(4));
	qb.setQuestion6difficultylevel(difflevel.get(5));
	qb.setQuestion7difficultylevel(difflevel.get(6));
	qb.setQuestion8difficultylevel(difflevel.get(7));
	qb.setQuestion9difficultylevel(difflevel.get(8));
	qb.setQuestion10difficultylevel(difflevel.get(9));
	qb.setQuestion11difficultylevel(difflevel.get(10));
	qb.setQuestion12difficultylevel(difflevel.get(11));
	qb.setQuestion13difficultylevel(difflevel.get(12));
	qb.setQuestion14difficultylevel(difflevel.get(13));
	qb.setQuestion15difficultylevel(difflevel.get(14));
	qb.setQuestion16difficultylevel(difflevel.get(15));
	qb.setQuestion17difficultylevel(difflevel.get(16));
	qb.setQuestion18difficultylevel(difflevel.get(17));
	qb.setQuestion19difficultylevel(difflevel.get(18));
	qb.setQuestion20difficultylevel(difflevel.get(19));
	return finalpaper;
	}
}
