package dev.cachaguercus.proyecto4.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

public class GhostBusterModelTest {

    private GhostBusterModel ghostBusterModel;

    @BeforeEach
    void setUp() {
        GhostBusterModel ghostBusterModel = new GhostBusterModel();
    }

    @Test
    @DisplayName("Should get GhostBuster name and Ghost trap")
    void testGetGhostbusterModel() {

        GhostBusterModel cachaguercu = new GhostBusterModel("cachaguercu", List<GhostModel>);
        String name = cachaguercu.getName();
        List<GhostModel> ghostList = cachaguercu.getList();

        assertEquals("cachaguercu", name);
        assertEquals(List<GhostModel> ghostList);
    }

}
