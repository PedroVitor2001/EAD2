import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TemperaturaTest {



    @Test
    @DisplayName("Deve retornar 1 se um dia for acima da média")
    void DeveRetornar1SeUmDiaForAcimaDaMedia(){
        assertEquals(1, Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 2, 2, 2, 2, 3 }));
    }

    @Test
    @DisplayName("Deve retornar 2 se dois dias forem acima da média")
    void deveRetornar2SeDoisDiasForemAcimaDaMedia(){
        assertEquals(2, Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 2, 2, 2, 3, 3 }));
    }
    @Test
    @DisplayName("Deve retornar 3 se tres dias forem acima da média")
    void deveRetornar3SeTresDiasForemAcimaDaMedia(){
        assertEquals(3, Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 3, 4, 5, 6, 1 }));
    }


}

