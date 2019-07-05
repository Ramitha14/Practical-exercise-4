package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingtextinAlphabeticalorderTest {
    SortingtextinAlphabeticalorder object;

    @Before
    public void setup() {
        object = new SortingtextinAlphabeticalorder();
    }

    @Test
    public void  sortingtextinlowercase()
    {
        String result=object.textsorting("i am playing with you");
        assertEquals("am i playing with you",result);
    }
    @Test
    public void  sortingtextincludinguppercase()
    {
        String result=object.textsorting("I am playing with you");
        assertEquals("am I playing with you",result);
    }
}