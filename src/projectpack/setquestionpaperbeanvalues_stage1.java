package projectpack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.questionpaperbean;

public class setquestionpaperbeanvalues_stage1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		questionpaperbean qb=new questionpaperbean();
		qb.setPaperid(Integer.parseInt(request.getParameter("paperid")));
		HttpSession ht=request.getSession();
		qb.setCoursename(String.valueOf(ht.getAttribute("cname")));
		qb.setCoursecode(String.valueOf(ht.getAttribute("ccode")));
		qb.setGeneratorid(Integer.parseInt(String.valueOf(ht.getAttribute("id"))));
		qb.setNumofpartAeasyquestions(Integer.parseInt(request.getParameter("easyA")));
		qb.setNumofpartAmediumquestions(Integer.parseInt(request.getParameter("mediumA")));
		qb.setNumofpartAhardquestions(Integer.parseInt(request.getParameter("hardA")));
		qb.setPartAeasyquestionsmarks(Double.parseDouble(request.getParameter("easyAmarks")));
		qb.setPartAmediumquestionsmarks(Double.parseDouble(request.getParameter("mediumAmarks")));
		qb.setPartAhardquestionsmarks(Double.parseDouble(request.getParameter("hardAmarks")));

		qb.setNumofpartBeasyquestions(Integer.parseInt(request.getParameter("easyB")));
		qb.setNumofpartBmediumquestions(Integer.parseInt(request.getParameter("mediumB")));
		qb.setNumofpartBhardquestions(Integer.parseInt(request.getParameter("hardB")));
		qb.setPartBeasyquestionsmarks(Double.parseDouble(request.getParameter("easyBmarks")));
		qb.setPartBmediumquestionsmarks(Double.parseDouble(request.getParameter("mediumBmarks")));
		qb.setPartBhardquestionsmarks(Double.parseDouble(request.getParameter("hardBmarks")));

		qb.setNumofpartCeasyquestions(Integer.parseInt(request.getParameter("easyC")));
		qb.setNumofpartCmediumquestions(Integer.parseInt(request.getParameter("mediumC")));
		qb.setNumofpartChardquestions(Integer.parseInt(request.getParameter("hardC")));
		qb.setPartCeasyquestionsmarks(Double.parseDouble(request.getParameter("easyCmarks")));
		qb.setPartCmediumquestionsmarks(Double.parseDouble(request.getParameter("mediumCmarks")));
		qb.setPartChardquestionsmarks(Double.parseDouble(request.getParameter("hardCmarks")));

		qb.setNumofpartDeasyquestions(Integer.parseInt(request.getParameter("easyD")));
		qb.setNumofpartDmediumquestions(Integer.parseInt(request.getParameter("mediumD")));
		qb.setNumofpartDhardquestions(Integer.parseInt(request.getParameter("hardD")));
		qb.setPartDeasyquestionsmarks(Double.parseDouble(request.getParameter("easyDmarks")));
		qb.setPartDmediumquestionsmarks(Double.parseDouble(request.getParameter("mediumDmarks")));
		qb.setPartDhardquestionsmarks(Double.parseDouble(request.getParameter("hardDmarks")));

		qb.setTotalpartAmarks(qb.getNumofpartAeasyquestions()*qb.getPartAeasyquestionsmarks()+qb.getNumofpartAmediumquestions()*qb.getPartAmediumquestionsmarks()+qb.getNumofpartAhardquestions()*qb.getPartAhardquestionsmarks());
		qb.setTotalpartBmarks(qb.getNumofpartBeasyquestions()*qb.getPartBeasyquestionsmarks()+qb.getNumofpartBmediumquestions()*qb.getPartBmediumquestionsmarks()+qb.getNumofpartBhardquestions()*qb.getPartBhardquestionsmarks());
		qb.setTotalpartCmarks(qb.getNumofpartCeasyquestions()*qb.getPartCeasyquestionsmarks()+qb.getNumofpartCmediumquestions()*qb.getPartCmediumquestionsmarks()+qb.getNumofpartChardquestions()*qb.getPartChardquestionsmarks());
		qb.setTotalpartDmarks(qb.getNumofpartDeasyquestions()*qb.getPartDeasyquestionsmarks()+qb.getNumofpartDmediumquestions()*qb.getPartDmediumquestionsmarks()+qb.getNumofpartDhardquestions()*qb.getPartDhardquestionsmarks());
		RequestDispatcher rd=request.getRequestDispatcher("questionpapergenerator.jsp");
		request.setAttribute("questionpaperbean", qb);
		rd.forward(request, response);
	}

}
