package Basics.Datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        String s1= "hello";
        s1+="he";
        System.out.println(s1);


        Long start = System.currentTimeMillis();


        String s2= "Bye";

        for(int i=0;i<10000;i++) {
            s1+=s2;
        }

        Long end =System.currentTimeMillis();

        System.out.println(end-start);

        /////////////////


        Long start1 = System.currentTimeMillis();


        StringBuffer sb =new StringBuffer("hello");

        for(int i=0;i<10000;i++) {
            sb.append(s2);
        }

        Long end1 =System.currentTimeMillis();

        System.out.println(end1-start1);


        System.out.println(" rupali sahu is a good ".trim());
        String caccstart="ZOOR16003914123";
        Integer sequenceNo=Integer.valueOf(caccstart.substring(9,15));

        HashMap<String ,Boolean> map=new HashMap<String, Boolean>();
        System.out.println(map.keySet().isEmpty());
        System.out.println(sequenceNo);
        String text ="outputPath" + 306
                +202+ 105;
        System.out.println(text);
        int[] seq=new int[]{1};
        List<Integer> items=new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
           items.add(i);
        }
        List<Integer> zrCitations=items.stream()
                .map(item->{
                    Integer x= (int) Math.pow(item,seq[0]++);
                    if(x==9){
                        seq[0]--;
                    }
                    return x;
                }).collect(Collectors.toList());
        System.out.println(zrCitations);
    }

}
