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
    <div id="formhojavida" class="container white z-depth-2">
        <!--PESTAÑAS-->
        <ul class="col s12 tabs blue-grey darken-4">
            <li class="tab col l3 s12 disabled"><a class="white-text active" href="#datospersonales">Datos
                    personales</a></li>
            <li class="tab col l3 s12 disabled"><a class="white-text active" href="#formacionacademica">Formación
                    Académica</a></li>
            <li class="tab col l3 s12 disabled"><a class="white-text active" href="#explaboral">Experiencia Laboral</a>
            </li>
        </ul>

        <!--SECCION DE DATOS PERSONALES-->
        <div id="datospersonales" class="col s12">
            <form class="col s12">
                <div class="form-container">
                    <h3 id="titulologin">Datos Personales</h3>
                    <div class="row">
                        <div class="input-field col l4 s12">
                            <input id="primapellido" type="text" class="validate">
                            <label for="primapellido">Primer apellido</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <input id="segapellido" type="text" class="validate">
                            <label for="segapellido">Segundo apellido</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <input id="nombre" type="text" class="validate">
                            <label for="nombre">Nombre completo</label>
                        </div>
                    </div>
                    <h6 class="center-align">Documento de identificación y nacionalidad</h6>
                    <div class="row">
                        <div class="input-field col l3 s12">
                            <p class="center-align">
                                <label>
                                    <input name="group1" type="radio" checked />
                                    <span>C.C.</span>
                                </label>
                                <label>
                                    <input name="group1" type="radio" checked />
                                    <span>C.E.</span>
                                </label>
                                <label>
                                    <input name="group1" type="radio" checked />
                                    <span>PAS</span>
                                </label>
                            </p>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="numcedula" type="text" class="validate">
                            <label for="numcedula">Número de cédula</label>
                        </div>

                        <div class="input-field col l3 s12">
                            <p class="center-align">
                                <label>
                                    <input name="group1" onclick="pais.disabled = true" type="radio" checked />
                                    <span>COL</span>
                                </label>

                                <label>
                                    <input name="group1" onclick="pais.disabled = false" type="radio" />
                                    <span>Extranjera</span>
                                </label>
                            </p>
                        </div>
                        <div class="input-field col l3 s12">
                            <input name="pais" disabled="diabled" type="text" class="disabled validate">
                            <label for="pais">País</label>
                        </div>
                    </div>
                    <div class="row">
                        <h6 class="center-align">Fecha y lugar de nacimiento</h6>
                        <div class="input-field col l3 s12">
                            <input type="text" id="fechanac" class="datepicker">
                            <label for="fechanac">Fecha de Nacimiento</label>
                        </div>
                        <div class="input input-field col l3 s12">
                            <select>
                                <option value="" disabled selected>Escoja su pais</option>
                                <option value="1">País</option>
                                <option value="2">País</option>
                                <option value="3">País</option>
                            </select>
                            <label>País</label>
                        </div>
                        <div class="input input-field col l3 s12">
                            <select>
                                <option value="" disabled selected>Escoja su departamento</option>
                                <option value="1">Depto</option>
                                <option value="2">Depto</option>
                                <option value="3">Depto</option>
                            </select>
                            <label>Depto</label>
                        </div>
                        <div class="input input-field col l3 s12">
                            <select>
                                <option value="" disabled selected>Escoja su municipio</option>
                                <option value="1">Municipio</option>
                                <option value="2">Municipio</option>
                                <option value="3">Municipio</option>
                            </select>
                            <label>Municipio</label>
                        </div>

                        <div class="row">
                            <h6 class="center-align">Dirección de correspondencia</h6>
                            <div class="input-field col l3 s12">
                                <input id="direccion" type="text" class="validate">
                                <label for="direccion">Dirección</label>
                            </div>
                            <div class="input input-field col l3 s12">
                                <select>
                                    <option value="" disabled selected>Escoja su pais</option>
                                    <option value="1">País</option>
                                    <option value="2">País</option>
                                    <option value="3">País</option>
                                </select>
                                <label>País</label>
                            </div>
                            <div class="input input-field col l3 s12">
                                <select>
                                    <option value="" disabled selected>Escoja su departamento</option>
                                    <option value="1">Depto</option>
                                    <option value="2">Depto</option>
                                    <option value="3">Depto</option>
                                </select>
                                <label>Depto</label>
                            </div>
                            <div class="input input-field col l3 s12">
                                <select>
                                    <option value="" disabled selected>Escoja su municipio</option>
                                    <option value="1">Municipio</option>
                                    <option value="2">Municipio</option>
                                    <option value="3">Municipio</option>
                                </select>
                                <label>Municipio</label>
                            </div>
                        </div>
                        <br>
                        <center>
                            <button class="btn waves-effect waves-light blue-grey darken-4" type="submit" name="action"
                                formaction="form.html#formacionacademica"><i
                                    class="material-icons right">arrow_forward</i>Guardar y Continuar</button>
                        </center>
                    </div>
                </div>
            </form>
        </div>
        <!--SECCION DE FORMACIÓN ACADEMICA-->
        <div id="formacionacademica" class="col s12">
            <form class="col s12">
                <div class="form-container">
                    <h3 id="titulologin">Formación académica</h3>
                    <div class="row">
                        <h6 class="center-align">Educación básica y media</h6>
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja su ultimo grado aprobado</option>
                                <optgroup label="Primaria">
                                    <option value="1">Primero 1°</option>
                                    <option value="2">Segundo 2°</option>
                                    <option value="3">Tercero 3°</option>
                                    <option value="4">Cuarto 4°</option>
                                    <option value="5">Quinto 5°</option>
                                </optgroup>
                                <optgroup label="Secundaria">
                                    <option value="6">Sexto 6°</option>
                                    <option value="7">Séptimo 7°</option>
                                    <option value="8">Octavo 8°</option>
                                    <option value="9">Noveno 9°</option>
                                    <option value="10">Décimo 10°</option>
                                    <option value="11">Undécimo 11°</option>
                                </optgroup>
                            </select>
                        </div>
                        <div class="input-field col l4 s12">
                            <input name="gradobasica" type="text" class="validate">
                            <label for="gradobasica">Título obtenido</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <input name="gradobasica" type="text" class="datepicker">
                            <label for="gradobasica">Fecha de grado</label>
                        </div>
                    </div>
                    <div class="row">
                        <h6 class="center-align">Educación superior</h6>
                        <div class="input-field col l3 s12">
                            <select>
                                <option value="" disabled selected>Modalidad</option>
                                <option value="1">Técnica</option>
                                <option value="2">Tecnología</option>
                                <option value="3">Tecnología Especializada</option>
                                <option value="4">Universitaria</option>
                                <option value="5">Especialización</option>
                                <option value="6">Maestría o Magister</option>
                                <option value="7">Doctorado o PhD</option>
                            </select>
                            <label>Seleccione su modalidad académica</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <p>Graduado
                                <label>
                                    <input onclick="titleobt.disabled=false" name="group1" type="radio" />
                                    <span>SI</span>
                                </label>
                                <label>
                                    <input onclick="titleobt.disabled=true" name="group1" type="radio" checked />
                                    <span>NO</span>
                                </label>
                            </p>
                        </div>
                        <div class="input-field col l3 s12">
                            <input disabled="disabled" class="disabled" type="text" name="titleobt" id="titulobt">
                            <label for="titleobt">Nombre del titulo obtenido</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input name="fechatermina" type="text" class="datepicker">
                            <label for="fechatermina">Fecha de terminación</label>
                        </div>
                    </div>
                    <div class="row">
                        <h6 class="center-align">Idiomas que habla, lee o escribe</h6>
                        <div class="input-field col l6 s12">
                            <textarea id="idioma" class="materialize-textarea"></textarea>
                            <label for="idioma">Textarea</label>
                        </div>
                        <div class="input-field col l6 s12">
                            <p>
                                <label>
                                    <input id="indeterminate-checkbox" type="checkbox" />
                                    <span>Habla</span>
                                </label>
                                <label>
                                    <input id="indeterminate-checkbox" type="checkbox" />
                                    <span>Lee</span>
                                </label>
                                <label>
                                    <input id="indeterminate-checkbox" type="checkbox" />
                                    <span>Escribe</span>
                                </label>
                            </p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l6 s12">
                            <textarea id="idioma" class="materialize-textarea"></textarea>
                            <label for="idioma">Textarea</label>
                        </div>
                        <div class="input-field col l6 s12">
                            <p>
                                <label>
                                    <input id="indeterminate-checkbox" type="checkbox" />
                                    <span>Habla</span>
                                </label>
                                <label>
                                    <input id="indeterminate-checkbox" type="checkbox" />
                                    <span>Lee</span>
                                </label>
                                <label>
                                    <input id="indeterminate-checkbox" type="checkbox" />
                                    <span>Escribe</span>
                                </label>
                            </p>
                        </div>
                    </div>
                    <br>
                    <center>
                        <button class="btn waves-effect waves-light blue-grey darken-4" type="submit" name="action"
                            formaction="form.html#datospersonales"><i class="material-icons left">arrow_back</i>Volver
                            atrás</button>
                        <button class="btn waves-effect waves-light blue-grey darken-4" type="submit" name="action"
                            formaction="form.html#explaboral"><i class="material-icons right">arrow_forward</i>Guardar y
                            Continuar</button>
                    </center>
                </div>
            </form>
        </div>
        <!--SECCION DE EXPERIENCIA LABORAL-->
        <div id="explaboral" class="col s12">
            <form class="col s12">
                <div class="form-container">
                    <h3 id="titulologin">Experiencia Laboral</h3>
                    <h6 class="center-align">Empresa actual o contrato vigente</h6>
                    <div class="row">
                        <div class="input-field col l4 s12">
                            <input id="empresa" type="text" class="validate">
                            <label for="empresa">Nombre de la empresa</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <p>
                                <label>
                                    <input name="group1" type="radio" checked />
                                    <span>Publica</span>
                                </label>
                                <label>
                                    <input name="group1" type="radio" checked />
                                    <span>Privada</span>
                                </label>
                            </p>
                        </div>
                        <div class="input-field col l4 s12">
                            <input id="email" type="email" class="validate">
                            <label for="email">Email de la entidad</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja el país</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>País</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja el depto</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>Departamento</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja el municipio</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>Municipio</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l3 s12">
                            <input id="cargo" type="text" class="validate">
                            <label for="cargo">Cargo o Contrato</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="depen" type="text" class="validate">
                            <label for="depen">Dependencia</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="telf" type="number" class="validate">
                            <label for="telf">Telefono</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="direccion" type="text" class="validate">
                            <label for="direccion">Dirección</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l6 s12">
                            <input id="fechaing" type="text" class="datepicker">
                            <label for="fechaing">Fecha de ingreso</label>
                        </div>
                        <div class="input-field col l6 s12">
                            <input id="fechafin" type="text" class="datepicker">
                            <label for="fechafin">Fecha de retiro</label>
                        </div>
                    </div>
                    <h6 class="center-align">Empresa o contrato anterior</h6>
                    <div class="row">
                        <div class="input-field col l4 s12">
                            <input id="empresa" type="text" class="validate">
                            <label for="empresa">Nombre de la empresa</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <p>
                                <label>
                                    <input name="group1" type="radio" checked />
                                    <span>Publica</span>
                                </label>
                                <label>
                                    <input name="group1" type="radio" checked />
                                    <span>Privada</span>
                                </label>
                            </p>
                        </div>
                        <div class="input-field col l4 s12">
                            <input id="email" type="email" class="validate">
                            <label for="email">Email de la entidad</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja el país</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>País</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja el depto</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>Departamento</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja el municipio</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>Municipio</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l3 s12">
                            <input id="cargo" type="text" class="validate">
                            <label for="cargo">Cargo o Contrato</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="depen" type="text" class="validate">
                            <label for="depen">Dependencia</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="telf" type="number" class="validate">
                            <label for="telf">Telefono</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="direccion" type="text" class="validate">
                            <label for="direccion">Dirección</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l6 s12">
                            <input id="fechaing" type="text" class="datepicker">
                            <label for="fechaing">Fecha de ingreso</label>
                        </div>
                        <div class="input-field col l6 s12">
                            <input id="fechafin" type="text" class="datepicker">
                            <label for="fechafin">Fecha de retiro</label>
                        </div>
                    </div>
                    <h6 class="center-align">Empresa o contrato anterior</h6>
                    <div class="row">
                        <div class="input-field col l4 s12">
                            <input id="empresa" type="text" class="validate">
                            <label for="empresa">Nombre de la empresa</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <p>
                                <label>
                                    <input name="group1" type="radio" checked />
                                    <span>Publica</span>
                                </label>
                                <label>
                                    <input name="group1" type="radio" checked />
                                    <span>Privada</span>
                                </label>
                            </p>
                        </div>
                        <div class="input-field col l4 s12">
                            <input id="email" type="email" class="validate">
                            <label for="email">Email de la entidad</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja el país</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>País</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja el depto</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>Departamento</label>
                        </div>
                        <div class="input-field col l4 s12">
                            <select>
                                <option value="" disabled selected>Escoja el municipio</option>
                                <option value="1">Option 1</option>
                                <option value="2">Option 2</option>
                                <option value="3">Option 3</option>
                            </select>
                            <label>Municipio</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l3 s12">
                            <input id="cargo" type="text" class="validate">
                            <label for="cargo">Cargo o Contrato</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="depen" type="text" class="validate">
                            <label for="depen">Dependencia</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="telf" type="number" class="validate">
                            <label for="telf">Telefono</label>
                        </div>
                        <div class="input-field col l3 s12">
                            <input id="direccion" type="text" class="validate">
                            <label for="direccion">Dirección</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col l6 s12">
                            <input id="fechaing" type="text" class="datepicker">
                            <label for="fechaing">Fecha de ingreso</label>
                        </div>
                        <div class="input-field col l6 s12">
                            <input id="fechafin" type="text" class="datepicker">
                            <label for="fechafin">Fecha de retiro</label>
                        </div>
                    </div>
                    <br>
                    <center>
                        <button class="btn waves-effect waves-light blue-grey darken-4" type="submit" name="action"
                            formaction="form.html#formacionacademica"><i class="material-icons left">arrow_back</i>Volver
                            atrás</button>
                        <button class="btn waves-effect waves-light blue-grey darken-4" type="submit" name="action"
                            formaction="principal.html"><i class="material-icons right">arrow_forward</i>Guardar</button>
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
                        proyecto como si fuera nuestro trabajo de tiempo completo. Cualquier cantidad ayudaría a apoyar
                        y continuar
                        el desarrollo de este proyecto y es muy apreciada.</p>


                </div>
                <div class="col l4 s12">
                    <h5 class="white-text">Enlaces de Interés</h5>
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
                © 2019 Copyright Programación Web-UFPS
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