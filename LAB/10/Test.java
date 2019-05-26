//Servlet Program Test.java (Server Side Program)

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		ArrayList<String> list=new ArrayList<String>();
		
		PrintWriter out=response.getWriter();
		list.add(request.getParameter("ename"));
		list.add(request.getParameter("enum"));
		list.add(request.getParameter("edept"));
		list.add(request.getParameter("edoj"));
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8889/emp","root","Ravi.619@sql");
			Statement st=con.createStatement();
			int row=st.executeUpdate("Insert into employee values('"+list.get(0)+"','"+list.get(1)+"','"+list.get(2)+"','"+list.get(3)+"');");
			if(row>0){
				Iterator itr=list.iterator();  
				while(itr.hasNext()){  
				out.println(itr.next());  
				  }  
				out.print("Above Data Inserted Succesfully");	
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


