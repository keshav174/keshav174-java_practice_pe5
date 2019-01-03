package com.stackroute.unittest.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MaintestTest {
    com.stackroute.unittest.pe5.Maintest obj;

    @Before
    public void setUp() throws Exception {
        obj=new com.stackroute.unittest.pe5.Maintest();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void sortstudent() {
        ArrayList<StudentClass> arr=new ArrayList<StudentClass>();
        arr.add(new StudentClass(150,18,"Keshav"));
        arr.add(new StudentClass(120,15,"Kumar"));
        arr.add(new StudentClass(130,16,"Rahul"));
        arr.add(new StudentClass(140,16,"Mukul"));
        arr.add(new StudentClass(140,16,"Joe"));
        arr.add(new StudentClass(140,18,"Adam"));
        ArrayList<StudentClass>arr1=new ArrayList<StudentClass>();
        arr1.add(new StudentClass(120,15,"Kumar"));
        arr1.add(new StudentClass(140,16,"Joe"));
        arr1.add(new StudentClass(140,16,"Mukul"));
        arr1.add(new StudentClass(130,16,"Rahul"));
        arr1.add(new StudentClass(140,18,"Adam"));
        arr1.add(new StudentClass(150,18,"Keshav"));
        assertEquals("Error in sotring based on age as top priority after Name",arr1.toString(),obj.Sortstudent(arr).toString());

    }

    @Test
    public void sortstudent2() {
        ArrayList<StudentClass> arr=new ArrayList<StudentClass>();
        arr.add(new StudentClass(150,18,"ee"));
        arr.add(new StudentClass(120,15,"d"));
        arr.add(new StudentClass(130,16,"c"));

        ArrayList<StudentClass>arr1=new ArrayList<StudentClass>();

        arr1.add(new StudentClass(120,15,"d"));
        arr1.add(new StudentClass(130,16,"c"));
        arr1.add(new StudentClass(150,18,"ee"));

        assertEquals("Error in sotring based on age as top priority after Name",arr1.toString(),obj.Sortstudent(arr).toString());

    } @Test
    public void sortstudent3() {
        ArrayList<StudentClass> arr=new ArrayList<StudentClass>();
        arr.add(new StudentClass(150,18,"ee"));
        arr.add(new StudentClass(120,18,"d"));
        arr.add(new StudentClass(130,18,"c"));

        ArrayList<StudentClass>arr1=new ArrayList<StudentClass>();

        arr1.add(new StudentClass(130,18,"c"));
        arr1.add(new StudentClass(120,18,"d"));
        arr1.add(new StudentClass(150,18,"ee"));

        assertEquals("Error in sotring based on age as top priority after Name",arr1.toString(),obj.Sortstudent(arr).toString());

    }

}
