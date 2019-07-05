package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementationofRegularexpressionTest {

            ImplementationofRegularexpression object;

        @Before
        public void setup() {
            object = new ImplementationofRegularexpression();
        }

        @Test
        public void  presenceofname()
        {
            Boolean result=object.regularexpression("This is Harry","Harry");
            assertEquals(true,result);
        }
        @Test
        public void absenceofname()
        {
            Boolean result=object.regularexpression("This is Henry","Harry");
            assertEquals(false,result);
        }
    }

