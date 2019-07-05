package com.stackroute.pe4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleoccurenceofwordTest {

        Multipleoccurenceofword object;

        @Before
        public void setup() {
            object = new Multipleoccurenceofword();
        }

        @Test
        public void checkforoccurence()
        {
            String result=object.multipleoccurence("She sells seashells by the seashore","se");
            assertEquals("4-6 10-12 27-29",result);
        }
}