package FabricMethod;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/shape")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String shapeType = req.getParameter("shape");

        ShapeFactory factory;

        if ("1".equals(shapeType)) {
            factory = new CircleFactory();
        } else {
            factory = new RectangleFactory();
        }

        Shape shape = factory.createShape();
        req.setAttribute("shapeName", shape.getName());
        req.getRequestDispatcher("/shape.jsp").forward(req, resp);
    }
}