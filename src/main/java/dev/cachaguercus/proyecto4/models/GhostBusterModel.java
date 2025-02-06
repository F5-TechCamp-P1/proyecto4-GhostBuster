package dev.cachaguercus.proyecto4.models;

import java.util.ArrayList;
import java.util.List;

import dev.cachaguercus.proyecto4.models.GhostModel;

public class GhostBusterModel {
    private String name;
    private List<GhostModel> ghostTrap = new ArrayList<GhostModel>();

    public GhostBusterModel(String name, List<GhostModel> ghostTrap) {
        this.name = name;
        this.ghostTrap = ghostTrap;
    }
    public String getName() {
        return name;
    }
    public List<GhostModel> getGhostTrap() {
        return ghostTrap;
    }





}
