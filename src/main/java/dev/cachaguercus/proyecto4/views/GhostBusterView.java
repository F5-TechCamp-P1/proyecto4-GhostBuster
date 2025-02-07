package dev.cachaguercus.proyecto4.views;

public class GhostBusterView {

    public String displayWelcomeMessage() {
        return "Inicio del Programa\n" +
                "============================================\n" +
                "    ¡Bienvenido a la Base Ghostbusters Asturias!\n" +
                "    Gestiona tus fantasmas atrapados y protege la región\n" +
                "============================================\n" +
                "Introduce tu nombre: ";
    }

    public String displayInitialMenu() {
        return "Opciones:\n" +
                "1. Capturar un nuevo fantasma\n" +
                "2. Ver lista de fantasmas capturados\n" +
                "3. Liberar un fantasma\n" +
                "4. Filtrar fantasmas por clase\n" +
                "5. Ver fantasmas capturados en un mes\n" +
                "6. Salir\n" +
                "\n" +
                "Por favor, selecciona una opción (1-6):";
    }

    public String displayCaptureGhost() {
        return "Capturar un Nuevo Fantasma\r\n" + 
                "============================================\r\n" + 
                "Ingresa el nombre del fantasma: "; 
    }

}
