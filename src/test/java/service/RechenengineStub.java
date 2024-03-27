package service;

public class RechenengineStub implements Rechenengine {

    @Override
    public Rechenengine initialisiereMit(int wert) {
        return null;
    }

    @Override
    public long multipliziereMit(int faktor) {
        return 0;
    }

    @Override
    public long addiere(int summand) {
        return 42L;
    }
}
