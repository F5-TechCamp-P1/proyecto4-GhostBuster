package dev.cachaguercus.proyecto4.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;
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
        GhostBusterModel ghostBuster = new GhostBusterModel();
        ghostBuster.setName("Cachaguercu");
        ghostBuster.setGhostTrap(new ArrayList<GhostModel>());
        assertEquals(ghostBuster.getName(), "Cachaguercu");
        assertEquals(ghostBuster.getGhostTrap(), new ArrayList<GhostModel>());
        
    }

    

}
