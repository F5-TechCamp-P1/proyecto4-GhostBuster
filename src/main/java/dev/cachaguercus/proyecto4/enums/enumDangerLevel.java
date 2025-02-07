package dev.cachaguercus.proyecto4.enums;

public enum enumDangerLevel {

    BAJO(1),
    MEDIO(2),
    ALTO(3),
    CRITICO(4);

    private final int numericLevel;

    enumDangerLevel(int nivelNumerico) {
        this.numericLevel = nivelNumerico;
    }

    public int getNumericLevel() {
        return numericLevel;
    }

}
