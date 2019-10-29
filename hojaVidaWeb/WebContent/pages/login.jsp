<!DOCTYPE html>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0" />
    <link rel="shortcut icon" href="https://img.icons8.com/officexs/16/000000/set-as-resume.png" type="image/x-icon">
    <title>Guarda tu hoja de vida | CVCheckpoint</title>

    <!-- CSS  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="../css/materialize.css">
    <link rel="stylesheet" href="../css/style.css">

</head>

<body>
    <!--ENCABEZADO-->
    <header>
        <div class="navbar-fixed blue-grey darken-1">
            <nav>
                <div class="nav-wrapper blue-grey darken-1">
                    <a href="../index.html" class="brand-logo truncate flow-text"><i
                            class="material-icons left">person_pin</i>CV
                        Checkpoint</a>
                    <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
                    <ul class="right hide-on-med-and-down">
                        <li><a href="#footer">Acerca de</a></li>
                        <li><a href="#footer">Quienes somos</a></li>
                    </ul>
                </div>
            </nav>
        </div>

        <!--SIDENAV-->
        <ul class="sidenav blue-grey darken-1" id="mobile-demo">

            <li>
                <div class="divider"></div>
            </li>
            <li><a class="white-text" href="#footer"><i class="material-icons">group_work</i>Acerca de</a></li>
            <li><a class="white-text" href="#footer"><i class="material-icons">group_work</i>Quienes somos</a></li>
        </ul>
    </header>

    <!--FORMULARIO-->
    <div id="formlogin" class="container white z-depth-2">
        <ul class="col s12 tabs blue-grey darken-4">
            <li class="tab col s3"><a class="white-text active" href="#login">ingresar</a></li>
            <li class="tab col s3"><a class="white-text tooltipped" data-position="top"
                    data-tooltip="No tienes una cuenta? Registrate" href="#register">registrar</a></li>
        </ul>

        <!--INICIO DE SESION-->
        <div id="login" class="col s12">
            <form class="col s12">
                <div class="form-container">
                    <h3 id="titulologin">Ingresar</h3>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="email" type="email" class="validate">
                            <label for="email">Correo E-mail</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="password" type="password" class="validate">
                            <label for="password">Contrase�a</label>
                        </div>
                    </div>
                    <br>
                    <center>
                        <button class="btn waves-effect waves-light blue-grey darken-4" type="submit" name="action"
                            formaction="principal.html">INGRESAR</button>
                    </center>
                </div>
            </form>
        </div>

        <!--REGISTRO DEL USUARIO-->
        <div id="register" class="col s12" style="display: none;">
            <form class="col s12" action="../src/co.hojavida.controller/PersonaController.java" method="POST">
                <div class="form-container">
                    <h3 id="titulologin">Registrate</h3>
                    <div class="row">
                        <div class="input-field col l8 s6">
                            <input id="cedula" type="number" class="validate">
                            <label for="cedula">Numero de documento</label>
                        </div>
                        <div class="input-field col l4 s6">
                            <select>
                                <option value="" disabled selected>Tipo de documento</option>
                                <option id="CC" name="CC" value="1">Cedula de ciudadania</option>
                                <option id="CE" name="CE" value="2">Cedula de extranjeria</option>
                                <option id="PAS" name="PAS" value="3">Pasaporte</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l6 s12">
                            <input type="text" id="nombres" name="nombres" class="validate">
                            <label for="nombre">Nombre completo</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input type="text" id="primerapellido" name="primerapellido" class="validate">
                            <label for="primapellido">Primer Apellido</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input type="text" id="segundoapellido" name="segundoapellido" class="validate">
                            <label for="segapellido">Segundo Apellido</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12 l3">
                            <input type="text" id="fechanacimiento" name="fechanacimiento" class="datepicker">
                            <label for="fechanac">Fecha de nacimiento</label>
                        </div>
                        <div class="input-field col s12 l3">
                            <select>
                                <option value="" disabled selected>Pais</option>
                                <option id="1" name="1" value="1">Colombia</option>
                                <!--<option value="2">Option 2</option>
                                <option value="3">Option 3</option>-->
                            </select>
                            <label>Pa�s de nacimiento</label>
                        </div>
                        <div class="input-field col s12 l3">
                            <select>
                                <option value="" disabled selected>Departamento</option>
                                <option id="22" name="22" value="1">Norte De Santander</option>
                                <!-- <option value="2">Option 2</option>
                                <option value="3">Option 3</option>-->
                            </select>
                            <label>Depto. de nacimiento</label>
                        </div>
                        <div class="input-field col s12 l3">
                            <select>
                                <option value="" disabled selected>Municipio</option>
                                <option id="109" name="109" value="1">Cucuta</option>
                                <!-- <option value="2">Option 2</option>
                                <option value="3">Option 3</option>-->
                            </select>
                            <label>Municipio de nacimiento</label>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col l4 s12">
                            <input type="email" id="correo" name="correo" class="validate">
                            <label for="email">Correo Electronico</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <input type="password" id="password" name="password" class="validate">
                            <label for="password">Contrase�a</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Sexo</option>
                                <option id="M" name="M" value="1">Masculino</option>
                                <option id="F" name="F" value="2">Femenino</option>
                            </select>
                            <label>Sexo</label>
                        </div>
                    </div>
                    <center>
                        <button class="btn waves-effect waves-light blue-grey darken-4 modal-trigger" href="#terminos"
                            type="submit" name="action">Registrar</button>
                    </center>
                </div>
            </form>
        </div>
    </div>


    <!--PIE DE PAGINA-->
    <footer id="footer" class="page-footer blue-grey darken-1">
        <div class="container">
            <div class="row">
                <div class="col l8 s12">
                    <h5 class="white-text">Checkpoint</h5>
                    <p class="grey-text text-lighten-4">Somos un equipo de estudiantes universitarios que trabajan en
                        este
                        proyecto como si fuera nuestro trabajo de tiempo completo. Cualquier cantidad ayudar�a a apoyar
                        y continuar
                        el desarrollo de este proyecto y es muy apreciada.</p>


                </div>
                <div class="col l4 s12">
                    <h5 class="white-text">Enlaces de Inter�s</h5>
                    <ul>
                        <li><a class="white-text" href="#!">Repo GitHub</a></li>
                        <li><a class="white-text" href="#!">Sitio UFPS</a></li>
                        <li><a class="white-text" href="#!">Medium</a></li>
                        <li><a class="white-text" href="#!">LinkedIn</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="footer-copyright">
            <div class="container">
                � 2019 Copyright Programaci�n Web-UFPS
                <a class="right white-text" href="#!">Redes Sociales</a>
            </div>
        </div>
    </footer>

    <!--  Scripts-->
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script src="../js/materialize.js"></script>
    <script src="../js/init.js"></script>
</body>

</html>