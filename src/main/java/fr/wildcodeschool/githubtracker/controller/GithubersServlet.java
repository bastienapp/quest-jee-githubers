package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GithubersServlet", urlPatterns = "/githubers")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Githuber> githubers = new ArrayList<Githuber>();
        githubers.add(new Githuber("Bastien Krettly", "bastien@wildcodeschool.fr", "bastienwcs", "29610890", "https://avatars1.githubusercontent.com/u/29610890"));
        githubers.add(new Githuber("Benoît Hubert", "benoit.hubert@wildcodeschool.fr ", "bhubr", "15270070", "https://avatars1.githubusercontent.com/u/15270070"));

        request.setAttribute("githubers", githubers);
        this.getServletContext().getRequestDispatcher("/githubers.jsp")
                .forward(request, response);
    }
}
