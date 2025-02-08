package dev.cachaguercus.proyecto4;

import dev.cachaguercus.proyecto4.controllers.GhostBusterController;
import dev.cachaguercus.proyecto4.models.GhostBusterModel;
import dev.cachaguercus.proyecto4.views.GhostBusterView;

public final class CachaguercusApp {
    private CachaguercusApp() {}

    public static void main(String[] args) {
        GhostBusterModel model = new GhostBusterModel("Cachaguercu", null);
        GhostBusterView view = new GhostBusterView();
        GhostBusterController controller = new GhostBusterController(model, view);
        new CachaguercusApp().run(controller);
    }

    public void run(GhostBusterController controller) {
        controller.run();

    }
}
