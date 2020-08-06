package org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.RegisterDao;
import org.dao.RegisterDaoImpl;
import org.model.Register;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Register r=new Register();
		r.setName(request.getParameter("name"));
		r.setEmail(request.getParameter("email"));
		r.setContact(Integer.parseInt(request.getParameter("contact")));
		r.setAdharCard(Integer.parseInt(request.getParameter("adharCard")));
		r.setPanCard(request.getParameter("panCard"));
		r.setLicenceNo(request.getParameter("licenceNo"));
		r.setState(request.getParameter("state"));
		r.setCity(request.getParameter("city"));
		r.setDistrict(request.getParameter("district"));
		System.out.println("Date :" + request.getParameter("birthDate"));
		
		Date date=Date.valueOf(request.getParameter("birthDate"));
		 
		r.setBirthDate(date);
		
		System.out.println(r);
		try {
			RegisterDao registerDao=new RegisterDaoImpl();
			int a=registerDao.isRegister(r);
			if(a > 0 ){
				out.println("Data inserted successfully");
			}else{
				out.println("Data failure while inserting into DB");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
