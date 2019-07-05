package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementationofRegularexpression {
  //to find the presence of name harry in the string
    public boolean regularexpression(String str1,String str2)
    {
        Pattern pattern = Pattern.compile(str2);
        Matcher matcher = pattern.matcher(str1);
        if(matcher.find())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
