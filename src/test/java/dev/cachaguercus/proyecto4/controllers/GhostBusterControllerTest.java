package dev.cachaguercus.proyecto4.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class GhostBusterControllerTest {

    @Test
    @DisplayName("When the ghostbuster select option 1 from main menu, should display a request to enter the name of the ghost")
    void testCaptureGhost(){
        GhostBusterController ghostBusterController = new GhostBusterController();
        String selectedoption = "1";
        String message = ghostBusterController.captureGhost(selectedoption);
        assertThat(message, is("método ok"));
        ghostBusterController.closeScanners();
    }
}
