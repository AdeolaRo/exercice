package org.example.exercice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servletPlain", value = "/servletPlain")
public class ServletPlain extends HttpServlet {
    private String prenom;

    @Override
    public void init() throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Une requete GET est envoyé à /monservlet");

        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();
        writer.println("Je renvois du texte comme indiqué</h1>");

    }

    @Override
    public void destroy() {
    }
}