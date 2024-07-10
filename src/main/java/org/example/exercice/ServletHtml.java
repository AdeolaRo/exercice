package org.example.exercice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servletHtml", value = "/servletHtml")
public class ServletHtml extends HttpServlet {
    private String prenom;

    @Override
    public void init() throws ServletException {
        prenom = "Roro";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Une requete GET est envoyé à /monservlet");

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        writer.println("<h1>Je renvois du texte simple !!!!</h1>");

        writer.println("<h1>Bonjour " + prenom + "!!</h1>");

    }

    @Override
    public void destroy() {
        System.out.println("Destruction du servlet");
    }
}