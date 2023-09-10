package service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TaschenrechnerIntegrationTest {

    @Test
    void berechneSchwierigeFormel_liefert_Antwort_auf_alles() {

        // Given

        var engine = new RechenengineMitDatenbankanbindungUndKI();

        Taschenrechner taschenrechner = new Taschenrechner(engine);

        // When

        String ergebnis = taschenrechner.berechneSchwierigeFormel();

        // Then

        assertThat(ergebnis).isEqualTo("Antwort: 42");
    }
}