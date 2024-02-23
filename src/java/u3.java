/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.*;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class u3 extends HttpServlet {

    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = res.getWriter();
        String s1=req.getParameter("id1");
        pw.println("Welcome"+ s1);
}
}
                