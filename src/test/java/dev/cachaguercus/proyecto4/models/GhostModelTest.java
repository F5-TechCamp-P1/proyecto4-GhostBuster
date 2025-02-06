package dev.cachaguercus.proyecto4.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.cachaguercus.proyecto4.enums.enumDangerLevel;
import dev.cachaguercus.proyecto4.enums.enumGhostType;
import java.time.LocalDate;

public class GhostModelTest {

    @Test
    @DisplayName("when the GB selects a ghost, all the expected info is provide")
    void testGetGhostModel() {

        GhostModel ghost1 = new GhostModel(1, "ghost1", enumGhostType.CLASE_I, enumDangerLevel.ALTO, "vomitar verde", LocalDate.now());

        int id = ghost1.getId();
        String name = ghost1.getName();
        enumGhostType ghost_type = ghost1.getGhost_type();
        enumDangerLevel danger_level = ghost1.getDanger_level();
        String special_skill = ghost1.getSpecial_skill();
        LocalDate local_date = ghost1.getCapture_date();

        assertEquals(1, id);
        assertEquals("ghost1", name);
        assertEquals(enumGhostType.CLASE_I, ghost_type);
        assertEquals(enumDangerLevel.ALTO, danger_level);
        assertEquals("vomitar verde", special_skill);
        assertEquals(LocalDate.now(), local_date);

    }
}
