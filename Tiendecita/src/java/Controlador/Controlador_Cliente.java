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
public class Controlador_Cliente extends HttpServlet {
    String listar="Vistas/Clientes/listar.jsp";
    String add="Registrar_Cliente.jsp";
    String edit="Actualizar_Cliente.jsp";
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
            out.println("<title>Servlet Controlador_Cliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_Cliente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String acceso="";
            String action=request.getParameter("accion");
                System.out.print(action);
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
                String correo=request.getParameter("txtEmail");
                String pass=request.getParameter("txtpass");
                p.setId_cliente(id);
                p.setNom_cliente(nom);
                p.setApe_cliente(ape);
                p.setDir_cliente(dir);
                p.setCiudad_cliente(ciu);
                p.setTelf_cliente(telf);
                p.setFnaci_cliente(fnaci);
                p.setCorreo_cliente(correo);
                p.setContrasena_cliente(pass);
                dao.add(p);
                System.out.print("Valores "+p);
                //acceso=listar;
            }
            else if(action.equalsIgnoreCase("editar")){
                request.setAttribute("idcliente",request.getParameter("idcliente"));
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
                String correo=request.getParameter("txtEmail");
                String pass=request.getParameter("txtpass");
                p.setId_cliente(id);
                p.setNom_cliente(nom);
                p.setApe_cliente(ape);
                p.setDir_cliente(dir);
                p.setCiudad_cliente(ciu);
                p.setTelf_cliente(telf);
                p.setFnaci_cliente(fnaci);
                p.setCorreo_cliente(correo);
                p.setContrasena_cliente(pass);
                System.out.print(p);
                dao.edit(p);
                acceso=listar;
            }
            else if(action.equalsIgnoreCase("eliminar")){
                id=Integer.parseInt(request.getParameter("idcliente"));
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
            processRequest(request, response);
    }
    
    /*@Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>/*/
    
}
