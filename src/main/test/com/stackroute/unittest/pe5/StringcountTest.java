package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class StringcountTest {
    Stringcount obj;
    @Before
    public void setUp() throws Exception {
        obj=new Stringcount();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void no_of_count() {
        String str="one one -one___two,,three,one @three*one?two";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);

        assertEquals("error",map,obj.noofcount(str));

    }
    @Test
    public void no_of_count1() {
        String str="two one -two_two,,three,one @three*one?two";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("one",3);
        map.put("two",4);
        map.put("three",2);

        assertEquals("error",map,obj.noofcount(str));

    }
    @Test
    public void no_of_count2() {
        String str="one two three one two three one two three";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("one",3);
        map.put("two",3);
        map.put("three",3);

        assertEquals("Error in output",map,obj.noofcount(str));

    }
    @Test
    public void no_of_countFailure() {
        String str="one two three one two three one two three";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("one",3);
        map.put("two",3);
        map.put("three",3);

        assertNotNull("Error in output",obj.noofcount(str));

    }
}
