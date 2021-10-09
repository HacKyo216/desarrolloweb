
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Lista Cliente</title>
    </head>
    <body>
        <div class="container">
        <h1>Cliente</h1>
        <a class="btn btn-success" href="Controlador_Cliente?accion=add">Agregar Nuevo</a>
        <br>
        <br>
        <table class="table table-bordered">
        
            <tr>
                <th class="text-center">ID</th>
                <th class="text-center">NOMBRE</th>
                <th class="text-center">APELLILDO</th>
                <th class="text-center">DIRECCION</th>
                <th class="text-center">CIUDAD</th>
                <th class="text-center">TELEFONO</th>
                <th class="text-center">FECHA NACIMIENTO</th>
                <th class="text-center">CORREO</th>
                <th class="text-center">CONTRASEÑA</th>
                <th class="text-center">ACCIONES</th>
            </tr>
        
<%
ClienteDAO dao=new ClienteDAO();
List<Cliente>list=dao.listar();
Iterator<Cliente>iter=list.iterator();
Cliente per=null;
while(iter.hasNext()){
per=iter.next();
%>
    <tbody>
    <tr class="text-center">
        <td><%= per.getId_cliente()%></td>
        <td><%= per.getNom_cliente()%></td>
        <td><%= per.getApe_cliente()%></td>
        <td><%= per.getDir_cliente()%></td>
        <td><%= per.getCiudad_cliente()%></td>
        <td><%= per.getTelf_cliente()%></td>
        <td><%= per.getFnaci_cliente()%></td>
        <td><%= per.getCorreo_cliente()%></td>
        <td><%= per.getContrasena_cliente()%></td>
        <td class="text-center">
            <a class="btn btn-warning" href="Controlador_Cliente?accion=editar&idcliente=<%=
            per.getId_cliente()%>">Editar</a>
            <a class="btn btn-danger" href="Controlador_Cliente?accion=eliminar&idcliente=<%=
            per.getId_cliente()%>">Remove</a>
        </td>
    </tr>
<%}%>
    </tbody>
    </table>
        </div>
    </body>
</html>