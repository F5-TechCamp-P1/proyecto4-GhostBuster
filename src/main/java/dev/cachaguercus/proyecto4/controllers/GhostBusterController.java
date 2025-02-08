package dev.cachaguercus.proyecto4.controllers;

import java.util.Scanner;

import dev.cachaguercus.proyecto4.views.GhostBusterView;

public class GhostBusterController {
    private Scanner scanner = new Scanner(System.in);
    private GhostBusterView ghostBusterView = new GhostBusterView();

    public void captureGhost(){
        Scanner gbInputScanner = new Scanner(System.in);
        String selectedoption = scanner.nextLine();
        if (selectedoption == "1") {
           System.out.println(ghostBusterView.displayCaptureGhost());
        }
           else {
               System.out.println("Opción no valida");
           }
           gbInputScanner.close();
    }
}
