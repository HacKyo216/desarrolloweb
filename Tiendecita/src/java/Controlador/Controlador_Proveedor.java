/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Proveedor;
import ModeloDAO.ProveedorDAO;
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
public class Controlador_Proveedor extends HttpServlet {

    String listar="Vistas/Proveedor/listar.jsp";
    String add="Vistas/Proveedor/add.jsp";
    String edit="Vistas/Proveedor/edit.jsp";
    Proveedor p=new Proveedor();
    ProveedorDAO dao=new ProveedorDAO();
    int id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_Proveedor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_Proveedor at " + request.getContextPath() + "</h1>");
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
                p.setId_proveedor(id);
                p.setNom_proveedor(nom);
                p.setApe_proveedor(ape);
                p.setDir_proveedor(dir);
                p.setCiudad_proveedor(ciu);
                p.setTelf_proveedor(telf);
                p.setFnaci_proveedor(fnaci);
                dao.add(p);
                acceso=listar;
            }
            else if(action.equalsIgnoreCase("editar")){
                request.setAttribute("idproveedor",request.getParameter("idproveedor"));
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
                p.setId_proveedor(id);
                p.setNom_proveedor(nom);
                p.setApe_proveedor(ape);
                p.setDir_proveedor(dir);
                p.setCiudad_proveedor(ciu);
                p.setTelf_proveedor(telf);
                p.setFnaci_proveedor(fnaci);
                dao.edit(p);
                acceso=listar;
            }
            else if(action.equalsIgnoreCase("eliminar")){
                id=Integer.parseInt(request.getParameter("idproveedor"));
                p.setId_proveedor(id);
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
