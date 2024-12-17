package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MainFunctionsTest {

    public MainFunctions mainFunctions = new MainFunctions();

    @org.junit.jupiter.api.Test
    @DisplayName("Найти максимальное количество И")
    @Timeout(value = 10, unit = TimeUnit.SECONDS)
    void testFindMaxOccurrencesOfI() {
        assertEquals("ИИИ", mainFunctions.findMaxOccurrencesOfI("ИИИ и ии иии"));
        assertEquals("иии", mainFunctions.findMaxOccurrencesOfI("иии и ии иии"));
        assertNotEquals("и", mainFunctions.findMaxOccurrencesOfI("и ИИИИИИ ии ИИИИИИИИИИ"));
        assertEquals("", mainFunctions.findMaxOccurrencesOfI(""));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Найти диагональную сумму в матрице")
    void testCalculateDiagonalSum() {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertEquals(15, mainFunctions.calculateDiagonalSum(matrix1));

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        assertEquals(34, mainFunctions.calculateDiagonalSum(matrix2));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Сгенерировать аббревиатуру")
    void testExtractInitialLetters() {
        assertEquals("HL", mainFunctions.extractInitialLetters("Half Life"));
        assertEquals("CS", mainFunctions.extractInitialLetters("counter strike"));
        assertEquals("", mainFunctions.extractInitialLetters(""));
    }

    @ParameterizedTest
    @ValueSource(booleans = {true})
    @DisplayName("Проверка на Throw Exception")
    void testParamMethod(boolean a1) {
        assertThrows(RuntimeException.class, () -> mainFunctions.paramMethod(a1));
    }

    @BeforeEach
    void beforeTest() throws Exception {
        System.out.println("Начало тестирования");
    }

    @AfterEach
    void afterTest() throws Exception {
        System.out.println("Тестирование выполнено");
    }
}