
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Tiendecita</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <link href="css/sb-admin-2.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
      </head>
    <body>
        <!-- NAV -->
        <nav class="navbar navbar-expand-sm navbar-dark bg-primary">
            <div class="container-fluid">
                
                <a class="navbar-brand" href="index.jsp">
                    <img src="img/logo_editado.png" class="w-75"/>
                </a>
                
                <button class="navbar-toggler" 
                        type="button" 
                        data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent"
                        aria-expanded="false"
                        aria-label="Toogle navigation">                        
                    <span class="navbar-toggler-icon"></span>
                </button>
                
                <div class="collapse navbar-collapse" id="navbarSupportedContent" >
                    <ul class="navbar-nav ml-auto" >
                        <li class="nav-item nav justify-content-center"><a class="nav-link" href="#" >Home</a></li>
                        <li class="nav-item nav justify-content-center"><a class="nav-link" href="#">Contacto</a></li>
                        <li class="nav-item nav justify-content-center"><a class="nav-link" href="#">Nosotros</a></li>
                        <li class="nav-item nav justify-content-center"><a class="nav-link" href="Login.jsp">Iniciar Seccion</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        
        <!-- Registrar -->
        
    <div class="container">
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-login-image">
                                 <img src="img/loginimg.jpg" class="w-100" alt=""/>
                            </div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">Registrarse!</h1>
                                    </div>
                                    <div class="d-grid gap-2 col-6 mx-auto align-content-center">
                                        
                                        <img src="img/Cliente.png" alt="" class="w-50 align-content-center"/>
                                        <a class="btn btn-primary" href="Registrar_Cliente.jsp">Cliente</a>
                                        <img src="img/tendero.png" alt="" class="w-50"/>
                                        <a class="btn btn-primary" href="Registrar_Tendero.jsp">Tendero</a>
                                        <img src="img/proveedor.png" alt="" class="w-50"/>
                                        <a class="btn btn-primary" href="Registrar_Proveedor.jsp">Proveedor</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>
        
    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>
    </body>
</html>
