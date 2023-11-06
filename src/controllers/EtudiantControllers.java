package controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import models.Etudiant;


/**
 * Servlet implementation class EtudiantControllers
 */
@WebServlet("/EtudiantControllers")
public class EtudiantControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtudiantControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("./etudiant/formulaire.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom=request.getParameter("nom"),
			   dateN=request.getParameter("dateNaiss"),
			   tel=request.getParameter("telephone"),
			   mail=request.getParameter("mail"),
			   sexe=request.getParameter("sexe");
		
		Date d = null;
		try {
			d = new SimpleDateFormat("yyyy-mm-dd").parse(dateN);
		} catch (java.text.ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace(); 
		}
		
		       
		Etudiant e= new Etudiant((int) (Math.random()*100)+"",nom,d,tel,sexe,(short)1);
		e.setMail(mail);
		int res=e.save();
		if(res>0){
			request.setAttribute("succes","Enregistrement reussie");
		}else{
			request.setAttribute("erreur", "echec d'enregistrement");
		}
		request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
