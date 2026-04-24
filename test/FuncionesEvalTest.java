import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionesEvalTest {

    @Test
    void contarApariciones() {
        // Estas pruebas verifican cuántas veces aparece un número en un array
        assertEquals(2, FuncionesEval.contarApariciones(new int[]{1, 2, 3, 1, 4}, 1));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{5, 6, 7}, 2));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{}, 5));
    }

    @Test
    void testEncontrarMayor() {
        // Caso normal: array con varios números
        int[] array1 = {1, 3, 2, 5, 4};
        assertEquals(5, FuncionesEval.encontrarMayor(array1));

        // Caso con números negativos
        int[] array2 = {-1, -2, -3, -4};
        assertEquals(-1, FuncionesEval.encontrarMayor(array2));

        // Caso con un solo elemento
        int[] array3 = {10};
        assertEquals(10, FuncionesEval.encontrarMayor(array3));

        // Casos límite: array vacío o nulo (deben lanzar excepción)
        int[] array4 = {};
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array4));

        int[] array5 = null;
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(array5));
    }

    @Test
    void testEsPerfecto() {
        assertTrue(FuncionesEval.esPerfecto(6));
        assertTrue(FuncionesEval.esPerfecto(28));
        assertFalse(FuncionesEval.esPerfecto(10));

        // Para números negativos o cero, el test debe esperar la excepción
        assertThrows(ArithmeticException.class, () -> FuncionesEval.esPerfecto(-6));
        assertThrows(ArithmeticException.class, () -> FuncionesEval.esPerfecto(0));
    }


    @Test
    void testGetTipoClima() {
        assertEquals("FRIO", FuncionesEval.getTipoClima(5));
        assertEquals("NUBLADO", FuncionesEval.getTipoClima(20));
        assertEquals("CALUROSO", FuncionesEval.getTipoClima(25));
        assertEquals("TROPICAL", FuncionesEval.getTipoClima(35));
    }
}
//PUSH
