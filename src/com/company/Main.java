package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        // write your code hereMa
        Map<Character, Integer> map = new LinkedHashMap<>();
        String s = "sillyspider";
        s = s.toUpperCase();
        s = s.replace(" ", "");
        char arr[] = s.toCharArray();
        int i = 0;
        int size = s.length();
        while (i != size) {
            if (map.containsKey(arr[i]) == false) {
                map.put(arr[i], 1);


            } else {
                int oval = map.get(arr[1]);
                int nval = oval + 1;
                map.put(arr[i], nval);

            }
            i++;
        }
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();


//        for printing key and value pair........
//        for (Map.Entry<Character,Integer> data: hmap  ) {
//
//            System.out.print(data.getKey()+" ");
//            System.out.println(data.getValue());
//
//
//        }


//       to print non repeated character...
//        for (Map.Entry<Character, Integer> data : hmap) {
//
//            if (data.getValue() > 1) {
//                System.out.print(data.getKey() + " ");
//                System.out.println(data.getValue());
//            } else {
//
//            output: S 2
//                    I 2
//                    L 2
//            }
//
//
//        }


//      to check weather string contains unique character....
//        for (Map.Entry<Character,Integer> data: hmap  ) {
//
//            if(data.getValue()>1){
//                System.out.println("string does not contain all unique character");
//                System.exit(0);
//
//            }
//
//
//
//        }
//
//        System.out.println("string contain unique characters ");
            // output :string does not contain all unique character


            // to print 1st non-repeated character....
//        for (Map.Entry<Character, Integer> data : hmap) {
//
//            if (data.getValue() > 1) {
//
//            } else {
//                System.out.print(data.getKey() + " ");
//                System.out.println(data.getValue());
//                break;
//output :Y 1
//            }


//         to print string without repeating character....
//        for (Map.Entry<Character, Integer> data : hmap) {
//            String re ="";
//
//            re = re + data.getKey();
//
//
//            System.out.print(re);
//            // output SILYPDER
//        }

        }

    }
}