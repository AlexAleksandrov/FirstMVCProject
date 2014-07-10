import dto.User;
import service.LoginService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Created by AALEKSANDROV on 07.07.14.
 */

public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId =request.getParameter("userId");
        String password =request.getParameter("password");

        LoginService loginService = new LoginService();
        boolean loginSuccess = loginService.authentificate(userId,password);
        if (loginSuccess){
            User user = loginService.getUser(userId);
            request.setAttribute("user", user);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
            requestDispatcher.forward(request,response);
//            response.sendRedirect("success.jsp");
            return;
        } else {
            response.sendRedirect("LoginPage.jsp");
            return;
        }
    }




}
