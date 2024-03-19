package ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet request");
		// 1. request 객체에서 피연산자와 연산자 받아와서 계산 
		// - > 로그인과 비밀번호를 받아온다 
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String result = "로그인 실패";
		
		if(id.equals("person") && pw.equals("1234")) {
			result = id + "님 반갑습니다";
		} 
			
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<html><body><h2>로그인 서블릿</h2><hr>")
		.append( result + "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		
		
		doGet(request, response);
	}

}
