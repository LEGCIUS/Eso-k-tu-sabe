/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;




import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarUsuario {

    /**
     * Este metodo fue generado por ChatGPT, el cual guarda un nuevo usuario en
     * un archivo usuariostxt
     *
     * @param nombre
     * @param correo
     * @param contraseña
     * @param privilegio
     * @return true si insertó el usuario, false no hubo inserción
     */
    public boolean guardarUsuario(String nombre, String correo,
            String contraseña, String numeroID, String institucionEducativa, String areaInteres) {

        String rutaArchivo = "C:\\Users\\usuario\\Music\\USUARIO.txt";
        String Maldades = "123456789ABCDEFGHIJKMNÑOPQRSTUVWXYZ";
        String password="";
        
        password = Codificar(Maldades, password, nombre, correo, contraseña, numeroID, institucionEducativa, areaInteres);
        
        try {

            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter(rutaArchivo, true))) {
                writer.write(password);
              
                writer.newLine();
            }

            System.out.println("Usuario guardado correctamente en el archivo.");
            System.out.println(nombre + "," + correo + ","
                    + password + "," + numeroID + institucionEducativa + areaInteres);
            return true;
        } catch (IOException e) {
            return false;

        }
    }
    
    public static String Codificar(String Maldades, String password, String nombre, String correo,
            String contraseña, String numeroID, String institucionEducativa, String areaInteres) {
        StringBuilder textoCodificado = new StringBuilder();
        password = password.toUpperCase();
        char caracter;
        for (int i = 0; i < password.length(); i++) {
            caracter = password.charAt(i);
            int pos = Maldades.indexOf(caracter);
            if (pos == -1) {
                textoCodificado.append(caracter);
            } else {
                textoCodificado.append(Maldades.charAt((pos + 5) % Maldades.length()));
            }
        }
        return textoCodificado.toString();
    }

}
