<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDAO.ClienteDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Edit Cliente</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
<%
ClienteDAO dao=new ClienteDAO();
int id=Integer.parseInt((String)request.getAttribute("idcliente"));
Cliente p=(Cliente)dao.list(id);
%>
                <h1>Modificar Cliente</h1>
                <form action="Controlador_Cliente">
                Id:<br>
                <input class="form-control" type="text" name="txtId" readonly value="<%= p.getId_cliente()%>"><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= p.getNom_cliente()%>"><br>
                Apellido: <br>
                <input class="form-control" type="text" name="txtApe" value="<%= p.getApe_cliente()%>"><br>
                Direccion: <br>
                <input class="form-control" type="text" name="txtDir" value="<%= p.getDir_cliente()%>"><br>
                Ciudad: <br>
                <input class="form-control" type="text" name="txtCiu" value="<%= p.getCiudad_cliente()%>"><br>
                Telefono: <br>
                <input class="form-control" type="text" name="txtTelf" value="<%= p.getTelf_cliente()%>"><br>
                Fecha Nacimiento (AA-MM-DD):<br>
                <input class="form-control" type="text" name="txtFnaci" value="<%= p.getFnaci_cliente()%>"><br>
                <input type="hidden" name="txtid" value="<%= p.getId_cliente()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
                <a href="Controlador_Cliente?accion=listar">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
