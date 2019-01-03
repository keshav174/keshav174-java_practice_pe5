package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BooleanMapTest {
  BooleanMap obj;
    @Before
    public void setUp() throws Exception {
        obj=new com.stackroute.unittest.pe5.BooleanMap();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void arrmap() {
        String  arr[] = {"a","b","c","d","a","c","c"};
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals("Error in counting no of words",map,obj.arrmap(arr));
    }
    @Test
    public void arrmap1() {
        String  arr[] = {"a","b","c","e","a","c","c","d"};
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        map.put("e",false);
        assertEquals("Error in counting no of words",map,obj.arrmap(arr));
    }
    @Test
    public void arrmap2() {
        String  arr[] = {"a","a","a","b","b","b","b","b","c"};
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("a",true);
        map.put("b",true);
        map.put("c",false);

        assertEquals("Error in counting no of words",map,obj.arrmap(arr));
    }
    @Test
    public void arrmap3() {
        String  arr[] = {"a"};
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("a",false);
        //map.put("b",true);
        //map.put("c",false);

        assertEquals("Error in counting no of words",map,obj.arrmap(arr));
    }
    @Test
    public void arrmap4() {
        String  arr[] = { };
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();

        assertEquals("Error in counting no of words",map,obj.arrmap(arr));
    }
    @Test
    public void arrmap5() {
        String  arr[] = {"a","b","c"};
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("a",false);
        map.put("b",false);
        map.put("c",false);

        assertEquals("Error in counting no of words",map,obj.arrmap(arr));
    }
    @Test
    public void arrmapFailure() {
        String  arr[] = {"a","a","a","b","b","b","b","b","c"};
        assertNotNull("Error in counting no of words",obj.arrmap(arr));
    }
}
