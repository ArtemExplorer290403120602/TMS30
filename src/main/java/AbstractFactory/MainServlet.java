package AbstractFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/product")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productType = req.getParameter("type");

        AbstractFactory abstractFactory;
        if ("A".equals(productType)) {
            abstractFactory = new ConcreteFactoryA();
        } else {
            abstractFactory = new ConcreteFactoryB();
        }

        Product product = abstractFactory.createProduct();
        req.setAttribute("productName", product.getName());
        req.getRequestDispatcher("/product.jsp").forward(req, resp);
    }
}