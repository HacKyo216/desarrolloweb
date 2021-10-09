
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Proveedor"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ProveedorDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Lista Proveedor</title>
    </head>
    <body>
        <div class="container">
        <h1>Proveedor</h1>
        <a class="btn btn-success" href="Controlador_Proveedor?accion=add">Agregar Nuevo</a>
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
                <th class="text-center">ACCIONES</th>
            </tr>
        
<%
ProveedorDAO dao=new ProveedorDAO();
List<Proveedor>list=dao.listar();
Iterator<Proveedor>iter=list.iterator();
Proveedor per=null;
while(iter.hasNext()){
per=iter.next();
%>
    <tbody>
    <tr>
        <td class="text-center"><%= per.getId_proveedor()%></td>
        <td><%= per.getNom_proveedor()%></td>
        <td><%= per.getApe_proveedor()%></td>
        <td><%= per.getDir_proveedor()%></td>
        <td><%= per.getCiudad_proveedor()%></td>
        <td><%= per.getTelf_proveedor()%></td>
        <td><%= per.getFnaci_proveedor()%></td>
        <td class="text-center">
            <a class="btn btn-warning" href="Controlador_Proveedor?accion=editar&idproveedor=<%=
            per.getId_proveedor()%>">Editar</a>
            <a class="btn btn-danger" href="Controlador_Proveedor?accion=eliminar&idproveedor=<%=
            per.getId_proveedor()%>">Remove</a>
        </td>
    </tr>
<%}%>
    </tbody>
    </table>
        </div>
    </body>
</html>