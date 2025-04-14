package com.programandoenjava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(
        name = "MiServlet",
        urlPatterns = {"/inicio", "/home"}
)
public class HolaMundoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>¡Hola, mundo desde un Servlet!</h1>");
    }

    @Override
    public void init() throws ServletException {
        // Inicialización del Servlet
        System.out.println("Servlet inicializado.");
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Procesamiento de la solicitud
        System.out.println("Solicitud recibida.");
        // Lógica de negocio...
    }

    @Override
    public void destroy() {
        // Liberación de recursos antes de destruir el Servlet
        System.out.println("Servlet destruido.");
    }
}