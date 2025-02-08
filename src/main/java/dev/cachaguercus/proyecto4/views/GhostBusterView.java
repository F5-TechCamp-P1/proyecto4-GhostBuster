package dev.cachaguercus.proyecto4.views;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.List;

import dev.cachaguercus.proyecto4.enums.enumDangerLevel;
import dev.cachaguercus.proyecto4.enums.enumGhostType;
import dev.cachaguercus.proyecto4.models.GhostBusterModel;
import dev.cachaguercus.proyecto4.models.GhostModel;

public class GhostBusterView {

    public String displayWelcomeMessage() {
        return "Inicio del Programa\n" +
                "============================================\n" +
                "    ¡Bienvenido a la Base Ghostbusters Asturias!\n" +
                "    Gestiona tus fantasmas atrapados y protege la región\n" +
                "============================================\n" +
                "Introduce tu nombre: ";
    }

    public String displayInitialMenu() {
        return "Opciones:\n" +
                "1. Capturar un nuevo fantasma\n" +
                "2. Ver lista de fantasmas capturados\n" +
                "3. Liberar un fantasma\n" +
                "4. Filtrar fantasmas por clase\n" +
                "5. Ver fantasmas capturados en un mes\n" +
                "6. Salir\n" +
                "\n" +
                "Por favor, selecciona una opción (1-6):";
    }

    public String displayCaptureGhost() {
        return "Capturar un Nuevo Fantasma\r\n" +
                "============================================\r\n" +
                "Ingresa el nombre del fantasma: ";
    }

    public String displayGhostTypes(){
        return "Selecciona la clase del fantasma:\r\n" +
                "1. Clase I - Manifestación menor\r\n" +
                "2. Clase II - Aparición móvil\r\n" +
                "3. Clase III - Entidad inteligente\r\n" +
                "4. Clase IV - Fantasma histórico\r\n" +
                "5. Clase V - Espíritu antropomorfo\r\n" +
                "6. Clase VI - Espíritu demoníaco\r\n" +
                "7. Clase VII - Entidad ultraterrena";
    }

    public String displayDangerLevels(){
        return "Selecciona el nivel de peligro (Bajo, Medio, Alto, Crítico):";
    }

    public String displaySpecialSkill(){
        return "Añade la habilidad especial del fantasma: ";
    }

    public String displaySuccessfulCapture(String name, LocalDate capture_date) {
        return MessageFormat.format("Fantasma {0} capturado exitosamente con nivel de afinidad ectoplásmica {1}.", name, capture_date);
    }

    public String displayGhostTrap(){
        GhostBusterModel ghostBusterModel = new GhostBusterModel(null, null);
        List<GhostModel> list = ghostBusterModel.getGhostTrap();
        String tableline;
        StringBuilder table = new StringBuilder();
        table.append("Ver Lista de Fantasmas Capturados\r\n")
                .append("============================================\r\n")
                .append("ID    Nombre                           Clase       Nivel de Peligro   Fecha de Captura\r\n");
        for (GhostModel ghost : list) {
            int id = ghost.getId();
            String name = ghost.getName();
            enumGhostType type = ghost.getGhost_type();
            enumDangerLevel danger = ghost.getDanger_level();
            LocalDate capture_date = ghost.getCapture_date();

            tableline = MessageFormat.format("{0} {1} {2} {3} {4}", id, name, type, danger, capture_date);
            table.append("------------------------------------------------------------------------------------\r\n")
            .append(tableline);
        }
        return table.toString();
    }

    public String displayReleaseGhost(){
        return "Ingresa el nombre del fantasma que quieres liberar: ";
    }

    public String displaySuccessfulRelease(){
        return "Fantasma liberado con éxito";
    }

    public String displayExitMessage(){
        return "Salir del Programa\n" +
                        "============================================\n" +
                        "    ¡Gracias por proteger Asturias!\n" +
                        "    ¡Nos vemos en la próxima cacería paranormal!\n" +
                        "============================================";
    }

}
