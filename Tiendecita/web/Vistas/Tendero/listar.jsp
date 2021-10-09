
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Tendero"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.TenderoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Lista Tendero</title>
    </head>
    <body>
        <div class="container">
        <h1>Tendero</h1>
        <a class="btn btn-success" href="Controlador_Tendero?accion=add">Agregar Nuevo</a>
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
TenderoDAO dao=new TenderoDAO();
List<Tendero>list=dao.listar();
Iterator<Tendero>iter=list.iterator();
Tendero per=null;
while(iter.hasNext()){
per=iter.next();
%>
    <tbody>
    <tr>
        <td class="text-center"><%= per.getId_tendero()%></td>
        <td><%= per.getNom_tendero()%></td>
        <td><%= per.getApe_tendero()%></td>
        <td><%= per.getDir_tendero()%></td>
        <td><%= per.getCiudad_tendero()%></td>
        <td><%= per.getTelf_tendero()%></td>
        <td><%= per.getFnaci_tendero()%></td>
        <td class="text-center">
            <a class="btn btn-warning" href="Controlador_Tendero?accion=editar&idtendero=<%=
            per.getId_tendero()%>">Editar</a>
            <a class="btn btn-danger" href="Controlador_Tendero?accion=eliminar&idtendero=<%=
            per.getId_tendero()%>">Remove</a>
        </td>
    </tr>
<%}%>
    </tbody>
    </table>
        </div>
    </body>
</html>