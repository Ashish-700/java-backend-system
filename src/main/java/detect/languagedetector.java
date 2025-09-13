package detect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

/**
 * Servlet implementation class languagedetector
 */
@WebServlet("/languagedetector")
public class languagedetector extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public languagedetector() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 // Extract locale from the request (browser language setting)
        Locale locale = request.getLocale();

        // Put values into request scope
        request.setAttribute("languageCode", locale.getLanguage());
        request.setAttribute("languageName", locale.getDisplayLanguage());
        request.setAttribute("countryCode", locale.getCountry());
        request.setAttribute("countryName", locale.getDisplayCountry());

        // Forward the request to your JSP
        request.getRequestDispatcher("/languagedetecter.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
