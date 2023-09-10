package service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Beispiel für eine komplexe, langsame Implementierung. NICHT NACHMACHEN!
 */
public class RechenengineMitDatenbankanbindungUndKI implements Rechenengine {

    private final AtomicLong zwischenspeicher = new AtomicLong();

    @Override
    public Rechenengine initialisiereMit(int wert) {
        zwischenspeicher.set(wert);
        return this;
    }

    @Override
    public long multipliziereMit(int faktor) {
        zwischenspeicher.getAndUpdate(alterWert -> alterWert * faktor);

        try {
            TimeUnit.SECONDS.sleep(5); // NICHT NACHMACHEN
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return zwischenspeicher.get();
    }

    @Override
    public long addiere(int summand) {
        zwischenspeicher.getAndAdd(summand);

        try {
            TimeUnit.SECONDS.sleep(5); // NICHT NACHMACHEN
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return zwischenspeicher.get();
    }
}
