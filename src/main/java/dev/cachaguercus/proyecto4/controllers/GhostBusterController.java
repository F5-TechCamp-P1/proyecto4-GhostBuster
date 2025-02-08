package dev.cachaguercus.proyecto4.controllers;

import java.time.LocalDate;

import dev.cachaguercus.proyecto4.enums.enumDangerLevel;
import dev.cachaguercus.proyecto4.enums.enumGhostType;
import dev.cachaguercus.proyecto4.models.GhostBusterModel;
import dev.cachaguercus.proyecto4.models.GhostModel;
import dev.cachaguercus.proyecto4.views.GhostBusterView;

public class GhostBusterController {
    private GhostBusterModel model;
    private GhostBusterView view;

    public GhostBusterController(GhostBusterModel model, GhostBusterView view) {
        this.model = model;
        this.view = view;
    }

    public void run(String ghostBurtername){
        view.displayWelcomeMessage();
        model.setName(ghostBurtername);
    }

    public void captureGhost(int id, String name, enumGhostType ghostType, enumDangerLevel dangerLevel, String specialSkill, LocalDate captureDate) {
        GhostModel ghost = new GhostModel(id, name, ghostType, dangerLevel, specialSkill, captureDate);
        model.captureGhost(ghost);
    }
}
