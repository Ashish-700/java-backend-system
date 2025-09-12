package mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String JDBCDRIVER = "com.mysql.cj.jdbc.Driver";
		String DB_url = "jdbc:mysql://localhost:3306/Ashish";
		
		String user="root";
		String pass="root";
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
			int cno=Integer.parseInt(request.getParameter("num"));
			String cname=request.getParameter("name");
			
			out.println("<html>");
			out.println("<head><title>DB_insert</title></head>");
			out.println("<body style='disply:flex;flex-direction:column;align-items:center;background:red;border:1px solid white;'>");
			try {
				Class.forName(JDBCDRIVER);
				
				Connection conn=(Connection)DriverManager.getConnection(DB_url,user,pass);
				PreparedStatement ps=conn.prepareStatement("insert into client(cno,cname) values(?,?)");
				
			
				
				ps.setInt(1,cno);
				ps.setString(2,cname);
						
				int i=ps.executeUpdate();
				if(i>0) {
					out.println("<fieldset> you are successfully inserted </fieldset>");
					
				}
				out.print("</body></html>");
			}catch(Exception ex) {
				out.println("Error: " + ex.getMessage());
				ex.printStackTrace();
			}
			out.close();
			

			
				
			
			
			
	
	}

}
