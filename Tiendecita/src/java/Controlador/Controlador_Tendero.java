/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Tendero;
import ModeloDAO.TenderoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andres
 */
public class Controlador_Tendero extends HttpServlet {

    String listar="Vistas/Tendero/listar.jsp";
    String add="Vistas/Tendero/add.jsp";
    String edit="Vistas/Tendero/edit.jsp";
    Tendero p=new Tendero();
    TenderoDAO dao=new TenderoDAO();
    int id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_Tendero</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_Tendero at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String acceso="";
            String action=request.getParameter("accion");
            if(action.equalsIgnoreCase("listar")){
                acceso=listar;
            }else if(action.equalsIgnoreCase("add")){
                acceso=add;
            }
            else if(action.equalsIgnoreCase("Agregar")){
                String Id=request.getParameter("txtId");
                String nom=request.getParameter("txtNom");
                String ape=request.getParameter("txtApe");
                String dir=request.getParameter("txtDir");
                String telf=request.getParameter("txtTelf");
                String fnaci=request.getParameter("txtFnaci");
                String ciu=request.getParameter("txtCiu");
                p.setId_tendero(id);
                p.setNom_tendero(nom);
                p.setApe_tendero(ape);
                p.setDir_tendero(dir);
                p.setCiudad_tendero(ciu);
                p.setTelf_tendero(telf);
                p.setFnaci_tendero(fnaci);
                dao.add(p);
                acceso=listar;
            }
            else if(action.equalsIgnoreCase("editar")){
                request.setAttribute("idtendero",request.getParameter("idtendero"));
                acceso=edit;
            }
            else if(action.equalsIgnoreCase("Actualizar")){
                id=Integer.parseInt(request.getParameter("txtId"));
                String nom=request.getParameter("txtNom");
                String ape=request.getParameter("txtApe");
                String dir=request.getParameter("txtDir");
                String telf=request.getParameter("txtTelf");
                String fnaci=request.getParameter("txtFnaci");
                String ciu=request.getParameter("txtCiu");
                p.setId_tendero(id);
                p.setNom_tendero(nom);
                p.setApe_tendero(ape);
                p.setDir_tendero(dir);
                p.setCiudad_tendero(ciu);
                p.setTelf_tendero(telf);
                p.setFnaci_tendero(fnaci);
                dao.edit(p);
                acceso=listar;
            }
            else if(action.equalsIgnoreCase("eliminar")){
                id=Integer.parseInt(request.getParameter("idtendero"));
                p.setId_tendero(id);
                dao.eliminar(id);
                acceso=listar;
            }
            RequestDispatcher vista=request.getRequestDispatcher(acceso);
            vista.forward(request, response);
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
    }
    /*
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    */
}
