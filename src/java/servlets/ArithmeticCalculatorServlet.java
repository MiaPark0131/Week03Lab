package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author meeye
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String defaultMessage = "---";
        request.setAttribute("resultMessage", defaultMessage);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String whichArithmetic = request.getParameter("arithmetic");
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String resultMessage;
        
        try {
            
            int firstInteger = Integer.parseInt(first);
            int secondInteger = Integer.parseInt(second);

            if (whichArithmetic.equals("+"))    {

                resultMessage = "" + (firstInteger + secondInteger);

            } else if (whichArithmetic.equals("-"))  {

                resultMessage = "" + (firstInteger - secondInteger);

            } else if (whichArithmetic.equals("*")) {

                resultMessage = "" + (firstInteger * secondInteger);

            } else  {

                resultMessage = "" + (firstInteger % secondInteger);
            }
        } catch (Exception e)  {
            
            resultMessage = "invalid";
        }
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("resultMessage", resultMessage);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
