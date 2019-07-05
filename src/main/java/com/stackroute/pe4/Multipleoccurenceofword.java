package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Multipleoccurenceofword {
  //to findout the multiple occurence of the string
    public String multipleoccurence(String str1,String str2)
    {
        String  result="";
        int start=0,end=0;
        Pattern pattern = Pattern.compile(str2);
        Matcher matcher = pattern.matcher(str1);
        while(matcher.find()) {
            start = matcher.start();
            end = matcher.end();

            result = result + start + "-" + end + " ";
        }
        return result.trim();
    }

}
