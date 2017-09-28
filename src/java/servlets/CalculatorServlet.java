//Author: Cameron Steinburg 734972
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Calculations", urlPatterns = {"/Calculations"})
public class CalculatorServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        String firstNumber = request.getParameter("first");
        String secondNumber = request.getParameter("second");
        String operation = request.getParameter("operation");
        int result = 0;
    
        if (operation!=null && firstNumber!=null && secondNumber!=null && !firstNumber.equals("") && !secondNumber.equals("")) {

                int first = Integer.parseInt(firstNumber);
                int second = Integer.parseInt(secondNumber);
                char operationType = operation.charAt(0);
                
                if(operationType == '+'){
                    result = first + second;
                }else if(operationType == '-'){
                    result = first - second;
                }else if(operationType == '*'){
                    result = first * second;
                }else if(operationType == '%'){
                    result = first % second;
                }
            }
        
        request.setAttribute("result", result);
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response); 
    }
   
}
