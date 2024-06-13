<%-- 
    Document   : registrar
    Created on : 16 may. 2024, 09:51:53
    Author     : ESTUDIANTE
--%>

<%@page import="archivos.GuardarUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <
            String nombre = request.getParameter("name");
            String correo = request.getParameter("email");
            String contraseña = request.getParameter("password");
            String cedula = request.getParameter("numeroID");
            String institucion = request.getParameter("InstuticionEducativa");
            String areaInteres = request.getParameter("AreadeInteres");
            out.println("Nombre: ");
            out.println("Correo: " + correo);
            out.println("Contraseña: " + contraseña);   
            out.println(request.getLocalAddr());
            GuardarUsuario gu = new GuardarUsuario();
            boolean bandera = gu.guardarUsuario(nombre, correo, contraseña, cedula, institucion, areaInteres);
            if (bandera) {
                    out.print("Insertado Correctamente!");
                }else{
                out.print("No insertado");
            }
        %>
    </body>
</html>
