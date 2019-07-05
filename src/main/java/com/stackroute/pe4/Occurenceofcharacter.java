package com.stackroute.pe4;

public class Occurenceofcharacter {
    //to findout the total occurence of given character in the string
    public  int findoccurenceofcharacter(String str,char ch)
    {
        int count=0;
        int length1,length2;
        length1=str.length();
        length2=str.replace(""+ch,"").length();
        count=length1-length2;
        if(length1!=length2)
        {
            return count;
        }
        else
        {
            return 0;
        }
    }
}
