<%-- 
    Document   : add
    Created on : 2/10/2021, 12:26:50 PM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>add Tendero</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Tendero</h1>
                <form action="Controlador_Tendero">
                ID / NIT: <br>
                <input class="form-control" type="text" name="txtId"><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtNom"><br>
                Apellido: <br>
                <input class="form-control" type="text" name="txtApe"><br>
                Direccion: <br>
                <input class="form-control" type="text" name="txtDir"><br>
                Ciudad: <br>
                <input class="form-control" type="text" name="txtCiu"><br>
                Telefono: <br>
                <input class="form-control" type="text" name="txtTelf"><br>
                Fecha Nacimiento (AA-MM-DD): <br>
                <input class="form-control" type="text" name="txtFnaci"><br>
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                <a href="Controlador_Tendero?accion=listar">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
