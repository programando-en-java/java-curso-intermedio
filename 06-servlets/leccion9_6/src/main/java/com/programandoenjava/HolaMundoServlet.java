package com.programandoenjava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

@WebServlet(
        name = "MiServlet",
        urlPatterns = {"/inicio", "/home"}
)
public class HolaMundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("HolaMundoServlet doGet");
        System.out.println("HolaMundoServlet doGet URI: " + request.getRequestURI());
        System.out.println("HolaMundoServlet doGet method: " + request.getMethod());
        request.getHeaderNames()
                .asIterator()
                .forEachRemaining(header -> System.out.println(header + ": " + request.getHeader(header)));
        System.out.println("HolaServlet doGet cookies: " + Arrays.stream(request.getCookies())
                .map(cookie -> cookie.getName() + "=" + cookie.getValue())
                .toList());

        response.getWriter().println("Hola Mundo");
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
    }

}