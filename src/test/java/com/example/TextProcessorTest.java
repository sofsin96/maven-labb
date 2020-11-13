package com.example;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {
    private final TextProcessor textProcessor = new TextProcessor();

    @RepeatedTest(5)
    void checkToSeeIf_StringToUpperCase_Works() {
        String input = "java";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertNotNull(textProcessor.inputToUpperCase(input));
    }

    @Test
    void checkToSeeIf_StringToLowerCase_Works() {
        String input = "";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertTrue(textProcessor.inputToLowerCase(input).isEmpty());
    }

    @Test
    void checkToSeeIf_ReverseString_Works() {
        String input = "java";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertEquals("avaj", textProcessor.reverseInput(input));
    }
}
