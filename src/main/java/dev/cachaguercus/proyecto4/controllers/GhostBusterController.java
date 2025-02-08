package dev.cachaguercus.proyecto4.controllers;

import java.util.Scanner;

import dev.cachaguercus.proyecto4.views.GhostBusterView;

public class GhostBusterController {
    private Scanner scanner = new Scanner(System.in);
    private GhostBusterView ghostBusterView = new GhostBusterView();
    Scanner gbInputScanner = new Scanner(System.in);
    String selectedoption = scanner.nextLine();

    public String captureGhost(String selectedoption) {
        if (selectedoption.equals("1")) {
            System.out.println(ghostBusterView.displayCaptureGhost());
            return "método ok";
        } else {
            System.out.println("Opción no valida");
            return "método no ok";
        }
    }

    public void closeScanners() {
        scanner.close();
        gbInputScanner.close();
    }
}
