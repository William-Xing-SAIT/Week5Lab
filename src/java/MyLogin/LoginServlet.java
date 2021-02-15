package MyLogin;

import MyLogin.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author 814545
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        HttpSession session = request.getSession();
        
        //User user = (User)session.getAttribute("users");
        if(username!= null && password != null && username.length() != 0 && password.length() != 0){
        User user = (User) new AccountService().login(username, password);
        
        session.setAttribute("users", user);
        if(user != null){
            response.sendRedirect("HomeServlet");
            //getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request,response);
        }
        
        if(user == null){
            String error = "Invalid username or password!";
            request.setAttribute("prompt", error);
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        }
    }
    }
}