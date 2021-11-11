package com.NTTData.tomcat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EverisServlet
 */
@WebServlet("/EverisServlet")
public class NTTDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NTTDataServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Respuesta
		response.getWriter().append("NTTData | PRIMER SERVLET | OK");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtencion de parametros
		final String param1 = request.getParameter("param1");
		final String param2 = request.getParameter("param2");

		// Respuesta
		response.getWriter().append("NTTData | PRIMER SERVLET | OK | POST | PARAM 1= "+ param1 + " | PARAM 2 = "+ param2 );
	}

}
