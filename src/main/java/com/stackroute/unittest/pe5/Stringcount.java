package com.stackroute.unittest.pe5;

import java.util.HashMap;

public class Stringcount {
    public HashMap<String, Integer>noofcount(String str ) {
        String result = str.replaceAll("[-+.^:,@___<>*?_]", " ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String []str1=result.split("[\\s]");
        for(int i=0;i<str1.length;i++)
        {

            if(map.get(str1[i])==null)
            {
                map.put(str1[i],1);
            }
            else
                map.put(str1[i],map.get(str1[i])+1);
        }
        map.remove("");
        return map;


    }

}
