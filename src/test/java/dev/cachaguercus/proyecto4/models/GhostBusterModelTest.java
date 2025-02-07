package dev.cachaguercus.proyecto4.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import dev.cachaguercus.proyecto4.enums.enumDangerLevel;
import dev.cachaguercus.proyecto4.enums.enumGhostType;
import dev.cachaguercus.proyecto4.models.GhostModel;

public class GhostBusterModelTest {

    @Test
    @DisplayName("Should get GhostBuster name and Ghost trap")
    void testGetGhostbusterModel() {

        List<GhostModel> ghostTrap = new ArrayList<>();
        GhostBusterModel ghostBuster = new GhostBusterModel("Cachaguercu", ghostTrap);
        String name = ghostBuster.getName();
        List<GhostModel> ghostList = ghostBuster.getGhostTrap();

        assertEquals("Cachaguercu", name);
        assertEquals(ghostTrap, ghostList);
    }

    @Test
    @DisplayName("Should set GhostBuster name and Ghost trap")
    void testSetGhostBusterModel() {
        GhostBusterModel ghostBuster = new GhostBusterModel(null, null);
        ghostBuster.setName("Cachaguercu");
        ghostBuster.setGhostTrap(new ArrayList<GhostModel>());
        assertEquals(ghostBuster.getName(), "Cachaguercu");
        assertEquals(ghostBuster.getGhostTrap(), new ArrayList<GhostModel>());
        
    }

    @Test
    @DisplayName("Should add a new ghost to the trap")
    void testCaptureGhost() {
        GhostBusterModel ghostBusterModel = new GhostBusterModel(null, null);
        GhostModel casper = new GhostModel(1, "casper", enumGhostType.CLASE_I, enumDangerLevel.BAJO, "aparecerse y sonreir", LocalDate.now());
        List<GhostModel> list = ghostBusterModel.getGhostTrap();
        ghostBusterModel.captureGhost(casper);
        assertThat(list, contains(casper));
    }

    @Test
    @DisplayName("Should delete ghost from the trap")
    void testRemoveGhost() {
        GhostBusterModel ghostBusterModel = new GhostBusterModel(null, null);
        GhostModel casper = new GhostModel(1, "casper", enumGhostType.CLASE_I, enumDangerLevel.BAJO, "aparecerse y sonreir", LocalDate.now());
        List<GhostModel> list = ghostBusterModel.getGhostTrap();
        ghostBusterModel.captureGhost(casper);
        ghostBusterModel.removeGhost(casper);
        assertThat(list, not(contains(casper)));
    }

    

}
