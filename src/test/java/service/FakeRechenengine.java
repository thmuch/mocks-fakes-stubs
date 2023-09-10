package service;

public class FakeRechenengine implements Rechenengine {

    private long zwischenspeicher;

    @Override
    public Rechenengine initialisiereMit(int wert) {
        zwischenspeicher = wert;
        return this;
    }

    @Override
    public long multipliziereMit(int faktor) {
        zwischenspeicher *= faktor;
        return zwischenspeicher;
    }

    @Override
    public long addiere(int summand) {
        zwischenspeicher += summand;
        return zwischenspeicher;
    }
}
