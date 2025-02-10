package dev.cachaguercus.proyecto4.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import dev.cachaguercus.proyecto4.enums.enumDangerLevel;
import dev.cachaguercus.proyecto4.enums.enumGhostType;
import dev.cachaguercus.proyecto4.models.GhostBusterModel;
import dev.cachaguercus.proyecto4.models.GhostModel;
import dev.cachaguercus.proyecto4.views.GhostBusterView;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class GhostBusterControllerTest {

   /*  private GhostBusterView view;
    private GhostBusterModel model;
    private GhostBusterController controller;
    private InputStream originalSystemIn; */
/*
    @BeforeEach
    void setUp() {
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterModel model = new GhostBusterModel();
        GhostBusterController controller = new GhostBusterController(model, view);
        originalSystemIn = System.in;
    }

    @AfterEach
    void restoreSystemIn() {
        System.setIn(originalSystemIn);
    } */

    @Test
    @DisplayName("Should ask GhostBusterView to displayWelcomeMessage")
    void testRun() {
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterModel model = new GhostBusterModel();
        String input = "X\n4\n";
       // System.setIn(new ByteArrayInputStream(input.getBytes()));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        GhostBusterController controller = new GhostBusterController(model, view);

        controller.run();
        verify(view, times(1)).displayWelcomeMessage();
    }

    @Test
    @DisplayName("Should ask GhostBusterView to displayInitialMenu")
    void testSelectOptionMainMenu() {
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterModel model = new GhostBusterModel();
        String input = "4\n";
        //System.setIn(new ByteArrayInputStream(input.getBytes()));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        GhostBusterController controller = new GhostBusterController(model, view);

        controller.selectOptionMainMenu();
        verify(view, times(1)).displayInitialMenu();
    }

    @Test
    @DisplayName("Should ask model to set the GhostBuster name")
    void testRunAsksUserForName() {
        GhostBusterView view = new GhostBusterView();
        GhostBusterModel model = Mockito.mock(GhostBusterModel.class);
        String input = "Cachaguercu\n4\n";
        // System.setIn(new ByteArrayInputStream(input.getBytes()));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        GhostBusterController controller = new GhostBusterController(model, view);

        controller.run();
        verify(model, times(1)).setName("Cachaguercu");
    }

   @Test
    @DisplayName("When captureGhost is called, should call model.captureGhost with the correct parameters")
    void testCaptureGhost() {
        GhostBusterModel model = Mockito.mock(GhostBusterModel.class);
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterController controller = new GhostBusterController(model, view);

        when(view.displayCaptureGhost()).thenReturn("Casper");
        when(view.displayGhostTypes()).thenReturn("CLASE_I");
        when(view.displayDangerLevels()).thenReturn("BAJO");
        when(view.displaySpecialSkill()).thenReturn("aparecerse y sonreir");
        when(view.displaySuccessfulCapture("Casper", LocalDate.now())).thenReturn("Ghost Captured");
        controller.captureGhost();
        verify(model, times(1)).captureGhost(argThat(ghost -> ghost.getName().equals("Casper") &&
                ghost.getGhost_type().equals(enumGhostType.CLASE_I) &&
                ghost.getDanger_level().equals(enumDangerLevel.BAJO) &&
                ghost.getSpecial_skill().equals("aparecerse y sonreir") &&
                ghost.getCapture_date().equals(LocalDate.now())));
        verify(view, times(1)).displaySuccessfulCapture("Casper", LocalDate.now());

    }

    @Test
    @DisplayName("Should pass a name to model so that it removes the ghost by removeGhost")
    void testRemoveGhost() {
        GhostBusterModel model = Mockito.mock(GhostBusterModel.class);
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterController controller = new GhostBusterController(model, view);
        GhostModel ghost = new GhostModel(0, "Casper", enumGhostType.CLASE_I, enumDangerLevel.BAJO,
                "aparecerse y sonreir", LocalDate.now());
        model.captureGhost(ghost);
        when(view.displayReleaseGhost()).thenReturn("Casper");
        controller.removeGhost("Casper");
        assertThat(model.getGhostTrap(), not(hasItem(ghost)));
    }

     @Test
    @DisplayName("Should display the list of captured ghosts")
    void testListGhosts() {
        GhostBusterModel model = Mockito.mock(GhostBusterModel.class);
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterController controller = new GhostBusterController(model, view);
        GhostModel ghost = new GhostModel(0, "Casper", enumGhostType.CLASE_I, enumDangerLevel.BAJO,
                "aparecerse y sonreir", LocalDate.now());
        GhostBusterModel.captureGhost(ghost);
        controller.listGhosts();
        verify(view, times(1)).displayGhostTrap();
    }

    @Test
    @DisplayName("Should display exit message")
    void testExitGame() {
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterController controller = new GhostBusterController(null, view);
        controller.exitGame();
        verify(view, times(1)).displayExitMessage();
    }

}