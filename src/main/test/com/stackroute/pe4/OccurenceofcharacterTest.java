package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceofcharacterTest {
    Occurenceofcharacter object;
    @Before
    public void setup()

    {
        object=new Occurenceofcharacter();
    }
    @Test
    public void Findoccurenceofcharacter()
    {
        int result=object.findoccurenceofcharacter("Java is java again java again",'a');
        assertEquals(10,result);
    }
   @Test
    public void Findoccurenceofcharacternotpresent()
    {
        int result=object.findoccurenceofcharacter("Java is java again java again",'x');
        assertEquals(0,result);
    }

}