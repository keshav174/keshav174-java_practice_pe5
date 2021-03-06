package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class MapObjectTest {
     MapObject obj;
    @Before
    public void setUp() throws Exception {
        obj=new MapObject();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void modify() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<String, String>();
        hm.put("val1","java");
        hm.put("val2","c++");
        HashMap<String ,String>res=new HashMap<String, String>();
        res.put("val1"," ");
        res.put("val2","java");

        assertEquals("Error in interchanging the values",res,obj.modify(hm));
    }
    @Test
    public void modify1() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<String, String>();
        hm.put("val1","keshav");
        hm.put("val2","kumar");
        HashMap<String ,String>res=new HashMap<String, String>();
        res.put("val1"," ");
        res.put("val2","keshav");

        assertEquals("Error in interchanging the values in output",res,obj.modify(hm));
    }
    @Test
    public void modify2() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<String, String>();
        hm.put("val1"," ");
        hm.put("val2"," ");
        HashMap<String ,String>res=new HashMap<String, String>();
        res.put("val1"," ");
        res.put("val2"," ");

        assertEquals("Error in interchanging the values in output",res,obj.modify(hm));
    }
    @Test
    public void modify3() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<String, String>();
        hm.put("val1","123");
        hm.put("val2","234");
        HashMap<String ,String>res=new HashMap<String, String>();
        res.put("val1"," ");
        res.put("val2","123");

        assertEquals("Error in interchanging the values in output",res,obj.modify(hm));
    }
    @Test
    public void modifyFailure() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<String, String>();
        hm.put("val1","keshav");
        hm.put("val2","kumar");


       assertNotNull("Error in interchanging the values in output",obj.modify(hm));
    }
}
