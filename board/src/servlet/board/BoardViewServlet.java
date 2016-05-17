package servlet.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardViewServlet
 */
@WebServlet("/baord/boardViewServlet")
public class BoardViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public BoardViewServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {

	}

}
