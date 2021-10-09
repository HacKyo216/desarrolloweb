/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import ModeloDAO.ClienteDAO;
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
public class ControladorArticulo extends HttpServlet {

    String listar="Vistas/Clientes/listar.jsp";
    String add="Vistas/Clientes/add.jsp";
    String edit="Vistas/Clientes/edit.jsp";
    Cliente p=new Cliente();
    ClienteDAO dao=new ClienteDAO();
    int id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
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
                p.setId_cliente(id);
                p.setNom_cliente(nom);
                p.setApe_cliente(ape);
                p.setDir_cliente(dir);
                p.setCiudad_cliente(ciu);
                p.setTelf_cliente(telf);
                p.setFnaci_cliente(fnaci);
                dao.add(p);
                acceso=listar;
            }
            else if(action.equalsIgnoreCase("editar")){
                request.setAttribute("idper",request.getParameter("id"));
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
                p.setId_cliente(id);
                p.setNom_cliente(nom);
                p.setApe_cliente(ape);
                p.setDir_cliente(dir);
                p.setCiudad_cliente(ciu);
                p.setTelf_cliente(telf);
                p.setFnaci_cliente(fnaci);
                dao.edit(p);
                acceso=listar;
            }
            else if(action.equalsIgnoreCase("eliminar")){
                id=Integer.parseInt(request.getParameter("id"));
                p.setId_cliente(id);
                dao.eliminar(id);
                acceso=listar;
            }
            RequestDispatcher vista=request.getRequestDispatcher(acceso);
            vista.forward(request, response);
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doGet(request, response);
    }
    /*
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    */
}
