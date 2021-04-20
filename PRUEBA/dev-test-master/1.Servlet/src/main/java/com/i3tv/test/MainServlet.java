/**
 * 
 */
package com.i3tv.test;

import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 4884978731059079399L;

	/*
	 * En este ejercicio se debe cumplir: 
	 * 1. El servlet debe recibir peticiones GET en la url: http://localhost:8080/
	 * 2. Debe contar cada
	 * petición y devolver el valor actual.
	 */
	
	 private Integer count;

	   public void init() throws ServletException {
	      // Inicialización valor
		   count = 1;
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      // Tipo de content
	      response.setContentType("text/html");

	      // Mostramos el contador y lo incrementamos
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + count + "</h1>");
	      count++;
	   }

	   public void destroy() {
	   }

}
