package dev.cachaguercus.proyecto4.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.cachaguercus.proyecto4.views.GhostBusterView;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class GhostBusterControllerTest {

    @Test
    @DisplayName("When the ghostbuster select option 1 from main menu, should display a request to enter the name of the ghost")
    void testCaptureGhost(){
        Scanner gbInputScanner = new Scanner(System.in);
        String selectedoption = scanner.nextLine();
        GhostBusterView ghostBusterView = new GhostBusterView();
        String expectedMessage = ghostBusterView.displayCaptureGhost();
        selectedoption.equals("1");
        GhostBusterController ghostBusterController = new GhostBusterController();
        ghostBusterController.captureGhost();
        String actualMessage = ghostBusterView.displayCaptureGhost();
        assertEquals(expectedMessage, actualMessage);
    }
}
