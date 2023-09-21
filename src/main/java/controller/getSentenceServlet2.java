package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ReverseSentence;
import model.VowelCounter;

/**
 * Servlet implementation class getsSentanceServlet
 */
@WebServlet("/getSentenceServlet2")
public class getSentenceServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSentenceServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String userSent2 = request.getParameter("userSent2");
		    request.setAttribute("userSentKeep2", userSent2);
		    VowelCounter userSentence2 = new VowelCounter(userSent2);
		    String vowelCount = userSentence2.getvowelCounter(); // Calculate vowel count
		    request.setAttribute("userSentence2", userSentence2); // Set the model object as an attribute
		    request.getRequestDispatcher("VowelRel.jsp").forward(request, response);
		
	}

	

}

