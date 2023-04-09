package com.example.fintechlab2;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.fintechlab2.Utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void getCharsCountGiven_EmptyString_Result_Zero() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCountGiven_TenChar_result_Ten() {
        String givenString = "1234567890";
        int expectedValue = 10;
        int actualValue = TextCounter.getCharsCount(givenString);

        assertEquals(expectedValue, actualValue);
    }
    @Test (expected = NullPointerException.class)
    public void getCharsCountGiven_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextCounter.getCharsCount(givenString);
    }

    @Test (expected = NullPointerException.class)
    public void countWords_NullString_Result_Exception() {
        String givenString = null;
        int actualValue = TextCounter.countWords(givenString);
    }

    @Test public void countWords_ExpectedBehaviour() {
        String givenString = "Hello World";
        int expectedValue = 2;
        int actualValue = TextCounter.countWords(givenString);

        assertEquals(expectedValue, actualValue);
    }

    @Test public void countWords_EmptySpace() {
        String givenString = " ";
        int expectedValue = 1;
        int actualValue = TextCounter.countWords(givenString);

        assertEquals(expectedValue, actualValue);

    }

}