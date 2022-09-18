package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code hereMa
         Map<Character,Integer> map =  new LinkedHashMap<>();
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
//           H 3
//           E 3
//           L 3
//           O 3
//           M 3
//           Y 3
//           N 4
//           A 3
//           I 4
//           S 3
//           D 4
//           T 1
//           G 1
//           F 1
//           R 1
