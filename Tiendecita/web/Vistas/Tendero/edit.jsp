<%@page import="Modelo.Tendero"%>
<%@page import="ModeloDAO.TenderoDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Edit Proveedor</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
<%
TenderoDAO dao=new TenderoDAO();
int id=Integer.parseInt((String)request.getAttribute("idtendero"));
Tendero p=(Tendero)dao.list(id);
%>
                <h1>Modificar Cliente</h1>
                <form action="Controlador_Tendero">
                Id:<br>
                <input class="form-control" type="text" name="txtId" value="<%= p.getId_tendero()%>"><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= p.getNom_tendero()%>"><br>
                Apellido: <br>
                <input class="form-control" type="text" name="txtApe" value="<%= p.getApe_tendero()%>"><br>
                Direccion: <br>
                <input class="form-control" type="text" name="txtDir" value="<%= p.getDir_tendero()%>"><br>
                Ciudad: <br>
                <input class="form-control" type="text" name="txtCiu" value="<%= p.getCiudad_tendero()%>"><br>
                Telefono: <br>
                <input class="form-control" type="text" name="txtTelf" value="<%= p.getTelf_tendero()%>"><br>
                Fecha Nacimiento (MM/DD/AA): <br>
                <input class="form-control" type="text" name="txtFnaci" value="<%= p.getFnaci_tendero()%>"><br>
                <input type="hidden" name="txtid" value="<%= p.getId_tendero()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
                <a href="Controlador_Tendero?accion=listar">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
