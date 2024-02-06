package Proxy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/proxyServlet")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProxyService proxy = new ProxyService();
        proxy.doAction();

        req.setAttribute("message", "Proxy Service called successfully!");
        req.getRequestDispatcher("proxy.jsp").forward(req, resp);
    }
}
