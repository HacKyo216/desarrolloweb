<%@page import="Modelo.Proveedor"%>
<%@page import="ModeloDAO.ProveedorDAO"%>

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
ProveedorDAO dao=new ProveedorDAO();
int id=Integer.parseInt((String)request.getAttribute("idproveedor"));
Proveedor p=(Proveedor)dao.list(id);
%>
                <h1>Modificar Proveedor</h1>
                <form action="Controlador_Proveedor">
                Id:<br>
                <input class="form-control" type="text" name="txtId" readonly value="<%= p.getId_proveedor()%>"><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtNom" value="<%= p.getNom_proveedor()%>"><br>
                Apellido: <br>
                <input class="form-control" type="text" name="txtApe" value="<%= p.getApe_proveedor()%>"><br>
                Direccion: <br>
                <input class="form-control" type="text" name="txtDir" value="<%= p.getDir_proveedor()%>"><br>
                Ciudad: <br>
                <input class="form-control" type="text" name="txtCiu" value="<%= p.getCiudad_proveedor()%>"><br>
                Telefono: <br>
                <input class="form-control" type="text" name="txtTelf" value="<%= p.getTelf_proveedor()%>"><br>
                Fecha Nacimiento (AA-MM-DD):<br>
                <input class="form-control" type="text" name="txtFnaci" value="<%= p.getFnaci_proveedor()%>"><br>
                <input type="hidden" name="txtid" value="<%= p.getId_proveedor()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
                <a href="Controlador_Proveedor?accion=listar">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
