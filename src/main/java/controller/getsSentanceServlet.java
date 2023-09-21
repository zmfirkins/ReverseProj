package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ReverseSentence;

/**
 * Servlet implementation class getsSentanceServlet
 */
@WebServlet("/getsSentanceServlet")
public class getsSentanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getsSentanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userSent = request.getParameter("userSent");
		request.setAttribute("userSentKeep", userSent);getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		ReverseSentence userSentence = ReverseSentence(userSent);
		PrintWriter writer = response.getWriter();
		writer.println(userSentence);
		writer.close();
	}

	private ReverseSentence ReverseSentence(String userSent) {
		// TODO Auto-generated method stub
		return null;
	}

}
