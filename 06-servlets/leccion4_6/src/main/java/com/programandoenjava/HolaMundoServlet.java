package com.programandoenjava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hola")
public class HolaMundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Establecer el tipo de contenido de la respuesta
        response.setContentType("text/html");

        // Obtener el objeto PrintWriter para enviar datos al cliente
        PrintWriter out = response.getWriter();

        // Escribir la respuesta HTML
        out.println("<html><body>");
        out.println("<h1>Hola Mundo desde Servlet!</h1>");
        out.println("</body></html>");
    }
}