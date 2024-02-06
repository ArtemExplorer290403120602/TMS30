package Builder;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/builder")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        int age = Integer.parseInt(req.getParameter("age"));

        Person person = new Person.Builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .build();

        req.setAttribute("person", person);
        RequestDispatcher dispatcher = req.getRequestDispatcher("builder.jsp");
        dispatcher.forward(req, resp);
    }
}
