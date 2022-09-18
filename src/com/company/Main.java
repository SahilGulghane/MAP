package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code hereMa
         Map<Character,Integer> map =  new  HashMap<>();
        String  s ="hello my name is sahil and tanisha is my good freind";
        s = s.toUpperCase();
        s = s.replace(" ","");
        char arr[] = s.toCharArray();
        int i =0;
        int size = s.length();
        while (i != size){
            if(map.containsKey(arr[i])==false)
            {
              map.put(arr[i],1);
            }
            else{
                int oval = map.get(arr[1]);
                int nval = oval+1;
                map.put(arr[i],nval);
            }i++;
        }
        Set<Map.Entry<Character,Integer>> hmap = map.entrySet();

        for (Map.Entry<Character,Integer> data: hmap  ) {

            System.out.print(data.getKey()+" ");
            System.out.println(data.getValue());

        }
    }
}
// output
//        A 3
//        D 4
//        E 3
//        F 1
//        G 1
//        H 3
//        I 4
//        L 3
//        M 3
//        N 4
//        O 3
//        R 1
//        S 3
//        T 1
//        Y 3