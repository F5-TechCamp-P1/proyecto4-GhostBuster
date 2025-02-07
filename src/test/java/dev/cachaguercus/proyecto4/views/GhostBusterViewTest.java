package dev.cachaguercus.proyecto4.views;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        String actualMessage = ghostBusterView.getWelcomeMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}
