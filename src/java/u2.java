/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.*;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class u2 extends HttpServlet {

    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = res.getWriter();
        String s1=req.getParameter("c1");{
                pw.println("<a href=u3?id1=" +s1 +">click</a>");
            
        }
        
    }

   
}
