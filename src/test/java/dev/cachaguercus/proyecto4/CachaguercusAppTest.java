package dev.cachaguercus.proyecto4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import dev.cachaguercus.proyecto4.controllers.GhostBusterController;
import dev.cachaguercus.proyecto4.models.GhostBusterModel;
import dev.cachaguercus.proyecto4.views.GhostBusterView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
public class CachaguercusAppTest {
    @Test
    @DisplayName("When main is called, should run the program, display a Welcome message and request a name to the GhostBuster")
    void testWelcomeMessageAndRequestName() {

        String input = "Casper\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        GhostBusterView mockView = Mockito.mock(GhostBusterView.class);
        when(mockView.displayWelcomeMessage()).thenReturn("============================================\n" +
                        "    ¡Bienvenido a la Base Ghostbusters Asturias!\n" +
                        "    Gestiona tus fantasmas atrapados y protege la región\n" +
                        "============================================\n" +
                        "Introduce tu nombre: ");
        GhostBusterModel model = new GhostBusterModel("Cachaguercu", null);
        GhostBusterController controller = new GhostBusterController(model, mockView);
        GhostBusterView view = new GhostBusterView();

        CachaguercusApp app = new CachaguercusApp(controller, view);

        app.run(controller);

        String expectedOutput = "============================================\n" +
                        "    ¡Bienvenido a la Base Ghostbusters Asturias!\n" +
                        "    Gestiona tus fantasmas atrapados y protege la región\n" +
                        "============================================\n" +
                        "Introduce tu nombre: Casper\n" +
                        "============================================\n";

        String actualOutput = out.toString();

        assertTrue(actualOutput.contains(expectedOutput));

        System.setIn(System.in);
        System.setOut(System.out);

    }
}
