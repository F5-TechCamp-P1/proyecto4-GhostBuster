package dev.cachaguercus.proyecto4.models;

import java.time.LocalDate;

import dev.cachaguercus.proyecto4.enums.enumDangerLevel;
import dev.cachaguercus.proyecto4.enums.enumGhostType;

public class GhostModel {
    private int id;
    private String name;
    private enumGhostType ghost_type;
    private enumDangerLevel danger_level;
    private String special_skill;
    private LocalDate capture_date;
}
