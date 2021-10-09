<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Tiendecita</title>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link href="css/sb-admin-2.min.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
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
        
     <!-- CARRUSEL -->   
         
        <div id="carouselExampleInterval" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active" data-bs-interval="2000">
                <img src="img/promo.png" class="d-block w-100" alt=""/>
              </div>
              <div class="carousel-item" data-bs-interval="2000">
                <img src="img/promonavidad.jpg" class="d-block w-100" alt=""/>
              </div>
              <div class="carousel-item" data-bs-interval="2000">
                <img src="img/ventaprivada.png" class="d-block w-100" alt=""/>
              </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Next</span>
            </button>
        </div>
     
         <!-- IMG SEPARADORA -->
            
         <div id="ribbon" class="container-fluid">
             <div id="ribbon2" class="container w-50 p-lg-5">
                 <div class="row align-items-center">
                     <div class="col-sm p-3">
                         <img src="img/productos.png" class="w-100 mx-auto d-block" alt=""/>
                     </div>
                     
                     <div class="col-sm p-3 text-light text-center">
                         <h4 class="h2 text-shadow"><p>Productos</p></h4>
                     </div>
                 </div>
             </div>
         </div>
     
        <!-- SEPARADOR -->
        
        <div id="separador">
            <div class="content bg-warning">|</div>
        </div>
        
        <!-- CATEGORIA PRODUCTOS -->
        <div id="prod">
            <div class="container-md p-5">
                <div class="row pt-5"></div>
                <div class="row pt-5" >
                    <div class="col-sm">
                        <div class="card text-center w-100 card-border mb-5">
                            <img src="img/carnes2.png" class="w-100"/>
                            <div class="card-body">
                              <h5 class="card-title">Carnes Frias</h5>
                              <a href="#" class="btn btn-primary">Ingresar</a>
                            </div>
                         </div>
                    </div>
                    
                    <div class="col-sm">
                        <div class="card text-center w-100 card-border mb-5">
                            <img src="img/Lacteos.png" class="w-100"/>
                            <div class="card-body">
                              <h5 class="card-title">Lacteos</h5>
                              <a href="#" class="btn btn-primary">Ingresar</a>
                            </div>
                         </div>
                    </div>
                    
                    <div class="col-sm">
                        <div class="card text-center w-100 card-border mb-5">
                            <img src="img/Abarrotes2.png" class="w-100"/>
                            <div class="card-body">
                              <h5 class="card-title">Abarrotes</h5>
                              <a href="#" class="btn btn-primary">Ingresar</a>
                            </div>
                         </div>
                    </div>
                    
                    <div class="col-sm">
                        <div class="card text-center w-100 card-border mb-5">
                            <img src="img/Congelados.png" class="w-100"/>
                            <div class="card-body">
                              <h5 class="card-title">Alimentos Congelados</h5>
                              <a href="#" class="btn btn-primary">Ingresar</a>
                            </div>
                         </div>
                    </div>
                    
                    <div class="col-sm">
                        <div class="card text-center w-100 card-border mb-5">
                            <img src="img/Bebidas.png" class="w-100"/>
                            <div class="card-body">
                              <h5 class="card-title">Bebidas</h5>
                              <a href="#" class="btn btn-primary">Ingresar</a>
                            </div>
                         </div>
                    </div>
                    
                    <div class="col-sm">
                        <div class="card text-center w-100 card-border mb-5">
                            <img src="img/FrutasVerduras.png" class="w-100"/>
                            <div class="card-body">
                              <h5 class="card-title">Frutas y Verduras</h5>
                              <a href="#" class="btn btn-primary">Ingresar</a>
                            </div>
                         </div>
                    </div>
                </div>
            </div>
        </div>
        
        <!-- #Footer-->
        <div>
        <footer class="bg-primary text-white py-3">
            <div class="container">
              <nav class="navbar navbar-expand-sm navbar-dark bg-primary">
                <!-- #logo-->
                <a href="#" class="col-3 text-reset text-uppercase d-flex align-items-centeer">
                <img src="img/logo_editado.png" alt="Tiendecita" class="mr-2">
                </a>
                <!-- #logo-->
                <ul class="col-3 list-unstyled">
                    <li class="font-weight-bold text-uppercase">Resource</li>
                    <li><a href="url" class="text-reset">Link 1</a></li>
                    <li><a href="url" class="text-reset">Link 2</a></li>
                    <li><a href="url" class="text-reset">Link 3</a></li>
                </ul>
                <!-- #logo-->
                <ul class="col-3 list-unstyled">
                    <li class="font-weight-bold text-uppercase">Quick Link</li>
                    <li><a href="url" class="text-reset">Link 1</a></li>
                    <li><a href="url" class="text-reset">Link 2</a></li>
                    <li><a href="url" class="text-reset">Link 3</a></li>
                </ul>
                <!-- #logo-->
                <ul class="col-3 list-unstyled">
                    <li class="font-weight-bold text-uppercase align-content-md-center">Redes Sociales</li>
                    <li class="d-flex justify-content-between">
                        <a href="url" class="text-reset">
                            <i class="fab fa-facebook "></i>
                        </a>
                        <a href="url" class="text-reset">
                            <i class="fab fa-twitter"></i>
                        </a>
                        <a href="url" class="text-reset">
                            <i class="fab fa-youtube"></i>
                        </a>
                    </li>
                </ul>
              </nav>
            </div>
        </footer>
      </div>
        
        
         
        <!-- Productos       
                <div class="card" style="width: 18rem;">
                    <img src="..." class="card-img-top" alt="...">
                    <div class="card-body">
                      <h5 class="card-title">Card title</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                 </div>
        --> 
        <!--<script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-3.6.0.min.js"></script>-->
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    </body>
<!-- comment <a class="btn btn-success btn-lg" href="Controlador_Cliente?accion=listar">Listar Cliente</a>
            <a class="btn btn-success btn-lg" href="Controlador_Tendero?accion=listar">Listar Tendero</a>
            <a class="btn btn-success btn-lg" href="Controlador_Proveedor?accion=listar">Listar Proveedor</a>-->
</html>
