package controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Cours;
import models.Etudiant;

/**
 * Servlet implementation class CoursControllers
 */
@WebServlet("/CoursControllers")
public class CoursControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CoursControllers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("./creation/creation.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String     libelle=request.getParameter("libelle");
				   String volume=request.getParameter("volume");
				   String credit=request.getParameter("credit");
				   
			
			       
			Cours c = new Cours((int) (Math.random()*100)+"",libelle,volume,credit);
			int res=c.save1();
			if(res>0){
				request.setAttribute("succes","Enregistrement reussie");
			}else{
				request.setAttribute("erreur", "echec d'enregistrement");
			}
			request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}


