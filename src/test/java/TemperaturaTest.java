import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TemperaturaTest {



    @Test
    @DisplayName("Deve retornar 1 se um dia for acima da média")
    void DeveRetornar1SeUmDiaForAcimaDaMedia(){
        assertEquals(1, Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 2, 2, 2, 2, 3 }));
    }
}

