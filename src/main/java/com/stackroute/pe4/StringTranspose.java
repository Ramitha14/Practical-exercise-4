package com.stackroute.pe4;

public class StringTranspose {
    //to transpose the given string
    public String transpose(String str)
    {

        String result="";
        String array[]=str.split(" ");
        for(int i=0;i<array.length;i++) {
            String reverse="";
            char array2[] = array[i].toCharArray();
            for (int j = array2.length - 1; j >= 0; j--) {
                reverse = reverse + array2[j];
            }

            result = result + reverse + " ";

        }
        return result.trim();
    }
}
