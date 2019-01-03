package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class SortedsetTest {
    Sortedset obj;
    @Before
    public void setUp() throws Exception {
        obj=new Sortedset();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void sort_set4() {
        HashSet<String> set=new HashSet<String>();

        ArrayList<String> arr=new ArrayList<String>();


        assertEquals("Error in sorting array of string in output",arr,obj.sortset(set));
    }
    @Test
    public void sort_set5() {
        HashSet<String> set=new HashSet<String>();
        set.add("Bob");
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Bob");


        assertEquals("Error in sorting array of string in output",arr,obj.sortset(set));
    }


    @Test
    public void sort_set() {
        HashSet<String> set=new HashSet<String>();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");

        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Eugene");
        arr.add("Harry");
        arr.add("Olive");
     assertEquals("Error in sorting array of string",arr,obj.sortset(set));
    }

    @Test
    public void sort_set1() {
        HashSet<String> set=new HashSet<String>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");

        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Carner");
        arr.add("Harry");
        arr.add("Olive");
        assertEquals("Error in sorting array of string",arr,obj.sortset(set));
    }
    @Test
    public void sort_set3() {
        HashSet<String> set=new HashSet<String>();
        set.add("123");
        set.add("456");
        set.add("000");
        set.add("984");
        set.add("123");


        ArrayList<String> arr=new ArrayList<String>();
        arr.add("000");
        arr.add("123");
        arr.add("456");
        arr.add("984");

        assertEquals("Error in sorting array of string in output",arr,obj.sortset(set));
    }

    @Test
    public void sort_setFailure() {
        HashSet<String> set=new HashSet<String>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");
        set.add("Keshav");
        set.add("Kumar");

        assertNotNull("Error in sorting array of string in output",obj.sortset(set));

    }

}
