package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.Collection;

public class UpdateArrays {
    public static ArrayList<String> update(ArrayList<String>list,int i,String str)
    {
        if(list.isEmpty())
            return null;
        list.remove(i);
        list.add(i,str);
        return list;
    }
    public static ArrayList<String> remove(ArrayList<String> list)
    {
        if(list.isEmpty())
            return null;
        list.removeAll(list);
        return list;
    }

}
