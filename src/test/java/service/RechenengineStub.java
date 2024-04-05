package service;

public class RechenengineStub implements Rechenengine {

    @Override
    public Rechenengine initialisiereMit(int wert) {
        return null;
    }

    @Override
    public long multipliziereMit(int faktor) {
        return 42L;
    }

    @Override
    public long addiere(int summand) {
        return 0;
    }
}
