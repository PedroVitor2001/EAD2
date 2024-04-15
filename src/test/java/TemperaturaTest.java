import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TemperaturaTest {


    @Test
    @DisplayName("Deve retornar 0 se nenhum dia for acima da média")
    void deveRetornar0SeNenhumDiaForAcimaDaMedia(){
        assertEquals(0, Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 2, 2, 2, 2, 2 }));
    }
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

    @Test
    @DisplayName("Deve retornar 4 se quatro dias forem acima da média")
    void deveRetornar4SeQuatroDiasForemAcimaDaMedia(){
        assertEquals(4, Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 2, 3, 3, 3, 3 }));
    }

    @Test
    @DisplayName("Deve retornar 5 se cinco dias forem acima da média")
    void deveRetornar5SeCincoDiasForemAcimaDaMedia(){
        assertEquals(5, Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 3, 3, 3, 3, 3 }));
    }

    @Test
    @DisplayName("Deve retornar 6 se seis dias forem acima da média")
    void deveRetornar6SeSeisDiasForemAcimaDaMedia(){
        assertEquals(6, Temperatura.diasAcimaDaMedia(new int[] { 2, 3, 3, 3, 3, 3, 3 }));
    }

    @Test
    @DisplayName("Deve retornar erro se for uma temperatura inválida positiva")
    void DeveRetornarErroSeForUmaTemperaturaInvalidaPositiva(){
        assertEquals("Erro", Temperatura.diasAcimaDaMedia(new int[] { 2, 2, 2, 2, 2, 2, 101 }));
    }

    @Test
    @DisplayName("Deve retornar erro se for uma temperatura inválida negativa")
    void DeveRetornarErroSeForUmaTemperaturaInvalidaNegativa(){
        assertEquals("Erro", Temperatura.diasAcimaDaMedia(new int[] { -1, 2, 2, 2, 2, 2, 3 }));
    }
}

