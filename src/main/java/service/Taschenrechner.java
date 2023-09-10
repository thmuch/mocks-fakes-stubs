package service;

import jakarta.inject.Inject;

public class Taschenrechner {

    private final Rechenengine engine;

    @Inject
    public Taschenrechner(Rechenengine engine) {
        this.engine = engine;
    }

    public String berechneSchwierigeFormel() {
        engine.initialisiereMit(2);

        engine.multipliziereMit(3);

        long ergebnis = engine.multipliziereMit(7);

        return "Antwort: %d".formatted(ergebnis);
    }
}
