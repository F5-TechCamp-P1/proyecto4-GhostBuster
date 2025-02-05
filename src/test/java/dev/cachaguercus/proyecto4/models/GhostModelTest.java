package dev.cachaguercus.proyecto4.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.cachaguercus.proyecto4.enums.enumDangerLevel;
import dev.cachaguercus.proyecto4.enums.enumGhostType;
import java.time.LocalDate;

public class GhostModelTest {

    @Test
    @DisplayName("when the GB selects a ghost, all the expected info is provide")
    void testGetGhostModel() {

        GhostModel ghost1 = new GhostModel(1, "ghost1", enumGhostType.CLASE_I, enumDangerLevel.ALTO, "vomitar verde", LocalDate.now());

        /* GhostModel ghost1 = new GhostModel(ghost1.id, ghost1.name, ghost1.ghost_type, ghost1.danger_level, ghost1.special_skill, ghost1.capture_date);
 */
        ghost1.getId();
        ghost1.getName();
        ghost1.getGhost_type();
        ghost1.getDanger_level();
        ghost1.getSpecial_skill();
        ghost1.getCapture_date();

        assertEquals(ghost1.id, ghost1.getId());
        assertEquals(ghost1.name, ghost1.getName());
        assertEquals(ghost1.ghost_type, ghost1.getGhost_type());
        assertEquals(ghost1.danger_level, ghost1.getDanger_level());
        assertEquals(ghost1.special_skill, ghost1.getSpecial_skill());
        assertEquals(ghost1.capture_date, ghost1.getCapture_date());

    }
}
