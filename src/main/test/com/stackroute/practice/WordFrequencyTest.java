package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    WordFrequency wordFrequency;
    @Before
    public void setUp() throws Exception {
        wordFrequency=new WordFrequency();
    }

    @After
    public void tearDown() throws Exception {
        wordFrequency=null;
    }

    @Test
    public void checkFrequency() {
        String expected="{one=5, two=2, three=2}";
        String actual=wordFrequency.checkFrequency("one one -one___two,,three,one @three*one?two");
        assertEquals(expected,actual);
    }

    @Test
    public void checkFrequencyNull() {

        String actual=wordFrequency.checkFrequency(null);
        assertNull(actual);
    }
    @Test
    public void checkFrequencyNotNull() {

        String actual=wordFrequency.checkFrequency("i am Batman");
        assertNotNull(actual);
    }
}