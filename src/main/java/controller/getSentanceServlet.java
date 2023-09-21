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
@WebServlet("/getSentanceServlet")
public class getSentanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSentanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String userSent = request.getParameter("userSent");
	        ReverseSentence userSentence = new ReverseSentence(userSent);

	      
	        request.setAttribute("reverseSentence", userSentence.getReverseSentence());

	        
	        request.getRequestDispatcher("result.jsp").forward(request, response);
	    }
		
	}

	


