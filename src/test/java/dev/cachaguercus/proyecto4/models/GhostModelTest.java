package dev.cachaguercus.proyecto4.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GhostModelTest {

    @Test
    @DisplayName("when the GB selects a ghost, all the expected info is provide")
    void testGetGhostModel() {

        GhostModel ghost1 = new GhostModel(ghost1.id, ghost1.name, ghost1.ghost_type, ghost1.danger_level, ghost1.special_skill, ghost1.capture_date);

        assertEquals(ghost1.id, ghost1.getId());
        assertEquals(ghost1.name, ghost1.getName());
        assertEquals(ghost1.ghost_type, ghost1.getGhostType());
        assertEquals(ghost1.danger_level, ghost1.getDangerLevel());
        assertEquals(ghost1.special_skill, ghost1.getSpecialSkill());
        assertEquals(ghost1.capture_date, ghost1.getCaptureDate());

    }
}
