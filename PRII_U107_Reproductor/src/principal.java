/*
    Desarrollar un reproductor de mp3
    
    Debe contener una lista de canciones, a las cuales se les podrá pedir "play" 
    y "stop". La lista puede recibir nombres de canciones nuevas, que podrán 
    agregarse mediante un botón.

    En esta versión no se puede explorar los directorios en busca de archivos
 */
public class principal {


    public static void main(String[] args) {
        ventana v = new ventana();
        v.setTitle("Reproductor");
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
}
