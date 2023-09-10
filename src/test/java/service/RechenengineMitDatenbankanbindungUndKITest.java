package service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RechenengineMitDatenbankanbindungUndKITest {

    @Test
    void multipliziert() {

        // Given

        var engine = new RechenengineMitDatenbankanbindungUndKI();

        // When

        long ergebnis = engine.initialisiereMit(3).multipliziereMit(4);

        // Then

        assertThat(ergebnis).isEqualTo(12);
    }

    @Test
    void addiert() {

        // Given

        var engine = new RechenengineMitDatenbankanbindungUndKI();

        // When

        long ergebnis = engine.initialisiereMit(3).addiere(4);

        // Then

        assertThat(ergebnis).isEqualTo(7);
    }
}