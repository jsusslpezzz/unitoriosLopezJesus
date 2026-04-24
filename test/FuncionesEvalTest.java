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
        // Casos normales (números que sabemos que son perfectos)
        assertTrue(FuncionesEval.esPerfecto(6));   // 1+2+3 = 6
        assertTrue(FuncionesEval.esPerfecto(28));  // 1+2+4+7+14 = 28

        // Casos normales (no perfectos)
        assertFalse(FuncionesEval.esPerfecto(10));

        // Casos límite
        assertFalse(FuncionesEval.esPerfecto(1));  // El 1 no se considera perfecto
        assertFalse(FuncionesEval.esPerfecto(-6)); // Números negativos
    }

    @Test
    void testGetTipoClima() {
        assertEquals("Frio", FuncionesEval.getTipoClima(0));      // Caso frío
        assertEquals("Templado", FuncionesEval.getTipoClima(20));  // Caso templado
        assertEquals("Calor", FuncionesEval.getTipoClima(40));    // Caso calor

        // Caso límite (justo en el cambio de categoría)
        // Si el código dice que a partir de 30 es calor:
        assertEquals("Calor", FuncionesEval.getTipoClima(30));
    }

    @Test
    void testInvertirArray() {
        // Caso normal
        int[] entrada = {1, 2, 3, 4};
        int[] esperado = {4, 3, 2, 1};
        assertArrayEquals(esperado, FuncionesEval.invertirArray(entrada));

        // Caso límite: array con un solo elemento
        int[] unico = {5};
        assertArrayEquals(new int[]{5}, FuncionesEval.invertirArray(unico));

        // Caso límite: array vacío
        assertArrayEquals(new int[]{}, FuncionesEval.invertirArray(new int[]{}));
    }

}
