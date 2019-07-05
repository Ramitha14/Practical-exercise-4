package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterreplacementTest {
    Characterreplacement object;
    @Before
    public void setup()

    {
        object=new Characterreplacement();
    }
    @Test
    public void replacecharacter()
    {
        String result=object.replacethegivencharacter("daily dry");
        assertEquals("faity fry",result);
    }
    /*@Test
    public void replacecharacternotpresent()
    {
        String result=object.replacethegivencharacter("lily");
        assertEquals("tity",result);
    }*/

}