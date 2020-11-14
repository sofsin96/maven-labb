package com.example;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {
    private final TextProcessor textProcessor = new TextProcessor();

    @RepeatedTest(5)
    void checkToSeeIf_StringToUpperCase_Works() {
        String input = "java";
        assertNotNull(textProcessor.inputToUpperCase(input));
    }

    @Test
    void checkToSeeIf_StringToLowerCase_Works() {
        String input = "";
        assertTrue(textProcessor.inputToLowerCase(input).isEmpty());
    }

    @Test
    void checkToSeeIf_ReverseString_Works() {
        String input = "java";
        assertEquals("avaj", textProcessor.reverseInput(input));
    }
}
