package Prototype;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PrototypeServlet", urlPatterns = "/PrototypeServlet")
public class MainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Prototype prototype = new Prototype("Initial Prototype");

        try {
            Prototype clonedPrototype = (Prototype) prototype.clone();
            resp.getWriter().println("Cloned Prototype Name: " + clonedPrototype.getPrototypeName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            resp.getWriter().println("Clone not supported.");
        }
    }
}
