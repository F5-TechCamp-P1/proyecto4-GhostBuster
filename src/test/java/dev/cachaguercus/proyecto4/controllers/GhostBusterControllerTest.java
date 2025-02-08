package dev.cachaguercus.proyecto4.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.cachaguercus.proyecto4.enums.enumDangerLevel;
import dev.cachaguercus.proyecto4.enums.enumGhostType;
import dev.cachaguercus.proyecto4.models.GhostBusterModel;
import dev.cachaguercus.proyecto4.views.GhostBusterView;

import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import java.time.LocalDate;


public class GhostBusterControllerTest {

    

    @Test
    @DisplayName("Should ask GhostBusterView to displayWelcomeMessage")
    void testRun() {
        GhostBusterModel model = Mockito.mock(GhostBusterModel.class);
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterController controller = new GhostBusterController(model, view);

        String ghostBusterName = "Cachaguercu";

        when(view.displayWelcomeMessage()).thenReturn("Cachaguercu");
        
        controller.run(ghostBusterName);

        verify(view, times(1)).displayWelcomeMessage();
        verify(model, times(1)).setName(ghostBusterName);
    }
    @Test
    @DisplayName("Should ask GhostBusterView to displayInitialMenu")
    void testSelectOptionMainMenu() {
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterController controller = new GhostBusterController(null, view);
        controller.selectOptionMainMenu();
        verify(view, times(1)).displayInitialMenu();
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
        controller.captureGhost(0, "Casper", enumGhostType.CLASE_I, enumDangerLevel.BAJO, "aparecerse y sonreir", LocalDate.now());
        verify(model, times(1)).captureGhost(argThat(ghost ->
            ghost.getName().equals("Casper") &&
            ghost.getGhost_type().equals(enumGhostType.CLASE_I) &&
            ghost.getDanger_level().equals(enumDangerLevel.BAJO) &&
            ghost.getSpecial_skill().equals("aparecerse y sonreir") &&
            ghost.getCapture_date().equals(LocalDate.now())
        ));
    }
    
    @Test
    @DisplayName("Should pass a name to model so that it removes the ghost by removeGhost")
    void testRemoveGhost() {
        GhostBusterModel model = Mockito.mock(GhostBusterModel.class);
        GhostBusterView view = Mockito.mock(GhostBusterView.class);
        GhostBusterController controller = new GhostBusterController(model, view);

        when(view.displayReleaseGhost()).thenReturn("Casper");
        controller.removeGhost(null, "Casper", null, null, null, null);
        verify(model, times(1)).removeGhost(argThat(ghost ->
            ghost.getName().equals("Casper") )
        );
       
    }

}