package dev.cachaguercus.proyecto4.views;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GhostBusterViewTest {

    @Test
    @DisplayName("Should display the Welcome message and request a name to the GhostBuster")
    void testDisplayWelcomeMessage() {
        GhostBusterView ghostBusterView = new GhostBusterView();
        ghostBusterView.displayWelcomeMessage();

        String expectedMessage = "Inicio del Programa\n" +
                        "============================================\n" +
                        "    ¡Bienvenido a la Base Ghostbusters Asturias!\n" +
                        "    Gestiona tus fantasmas atrapados y protege la región\n" +
                        "============================================\n" +
                        "Introduce tu nombre: ";
        String actualMessage = ghostBusterView.displayWelcomeMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    @DisplayName("Should display the initial menu ask the user to select an option")
    void testDisplayInitialMenu() {
        GhostBusterView ghostBusterView = new GhostBusterView();
        ghostBusterView.displayInitialMenu();

        String expectedMessage = "Opciones:\n" +
                        "1. Capturar un nuevo fantasma\n" +
                        "2. Ver lista de fantasmas capturados\n" +
                        "3. Liberar un fantasma\n" +
                        "4. Filtrar fantasmas por clase\n" +
                        "5. Ver fantasmas capturados en un mes\n" +
                        "6. Salir\n" +
                        "\n" +
                        "Por favor, selecciona una opción (1-6):" ;

        String actualMessage = ghostBusterView.displayInitialMenu();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    @DisplayName("To initiate the ghost capture, should display a request to enter a ghost name")
    void testDisplayCaptureGhost() {
        GhostBusterView ghostBusterView = new GhostBusterView();
        ghostBusterView.displayCaptureGhost();
        String expectedMessage = "Capturar un Nuevo Fantasma\r\n" + 
                        "============================================\r\n" + 
                        "Ingresa el nombre del fantasma:";
        String actualMessage = ghostBusterView.displayCaptureGhost();
        assertEquals(expectedMessage, actualMessage);
        
    }

    
}
