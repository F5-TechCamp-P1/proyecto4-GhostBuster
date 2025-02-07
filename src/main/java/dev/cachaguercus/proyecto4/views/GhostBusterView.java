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

    public String displayGhostTypes(){
        return "Selecciona la clase del fantasma:\r\n" + 
                "1. Clase I - Manifestación menor\r\n" + 
                "2. Clase II - Aparición móvil\r\n" + 
                "3. Clase III - Entidad inteligente\r\n" + 
                "4. Clase IV - Fantasma histórico\r\n" + 
                "5. Clase V - Espíritu antropomorfo\r\n" + 
                "6. Clase VI - Espíritu demoníaco\r\n" + 
                "7. Clase VII - Entidad ultraterrena";
    }

    public String displayDangerLevels(){
        return "Selecciona el nivel de peligro (Bajo, Medio, Alto, Crítico):";
    }

}
