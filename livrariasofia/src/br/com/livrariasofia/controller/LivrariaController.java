package br.com.livrariasofia.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class LivrariaController
 */
public class LivrariaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LivrariaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String titulo = request.getParameter("titulo");
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/teste.jsp");
			
			
			
			dispatcher.forward(request, response);
			
	}

}
