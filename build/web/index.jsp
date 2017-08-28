<%-- 
    Document   : index
    Created on : 27-08-2017, 9:10:17
    Author     : Alfonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <title>Libros</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Solicitudes</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                  <a class="nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Libros</a>
                </li>
              </ul>
            </div>
          </nav>
        
        <div class="container">
            <div class="row">
                <div class="col">
                    
                    <form action="LoginServlet" method="POST">
                        <div class="form-group">

                            <label for="txtusuario">Usuario</label>
                            <input type="text" name="txtUsuario" class="form-control">

                        </div>
                        <div class="form-group">

                            <label for="txtPassword">Password</label>
                            <input type="password" name="txtPassword" class="form-control">

                        </div>
                        
                        <input type="submit" class="btn btn-primary" name="btnLogin">
                    </form>
                    
                </div>
                <div class="col">
                    Otras informaciones
                </div>
            </div>
        </div>
        
    </body>
</html>
