package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose object;
    @Before
    public void setup()

    {
        object=new StringTranspose();
    }
    @Test
    public void transposeofastring()
    {
        String result=object.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }
   /* @Test
    public void Findoccurenceofcharacternotpresent()
    {
        int result=object.transpose("Java is java again java again",'x');
        assertEquals(0,result);
    }*/


}