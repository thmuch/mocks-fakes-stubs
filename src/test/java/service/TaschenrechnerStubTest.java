package service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TaschenrechnerStubTest {

    @Mock
    Rechenengine engine;

    @Test
    void berechneSchwierigeFormel_liefert_Antwort_auf_alles() {

        // Given

        Taschenrechner taschenrechner = new Taschenrechner(engine);

        when(engine.addiere(anyInt())).thenReturn(42L); // Stubbing

        // When

        String ergebnis = taschenrechner.berechneSchwierigeFormel();

        // Then

        assertThat(ergebnis).isEqualTo("Antwort: 42");
    }
}