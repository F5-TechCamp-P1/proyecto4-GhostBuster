package dev.cachaguercus.proyecto4.models;

import java.util.ArrayList;
import java.util.List;

import dev.cachaguercus.proyecto4.models.GhostModel;

public class GhostBusterModel {
    private String name;
    private List<GhostModel> ghostTrap = new ArrayList<GhostModel>();

    public GhostBusterModel(String name, List<GhostModel> ghostTrap) {
        this.name = name;
        this.ghostTrap = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public List<GhostModel> getGhostTrap() {
        return ghostTrap;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGhostTrap(List<GhostModel> ghostTrap) {
        this.ghostTrap = ghostTrap;
    }

    public void captureGhost(GhostModel ghost) {
        this.ghostTrap.add(ghost);
    }

    
}
