package com.stackroute.pe4;

public class SortingtextinAlphabeticalorder {
    //sorting text in alphabetical order
    public String textsorting(String str)
    {
        String result="";
        String temp;
        String array[]=str.split(" ");
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if (array[i].compareToIgnoreCase(array[j])>0)
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
       for(int i=0;i<array.length;i++)
       {
           result=result+array[i]+" ";
       }
       return result.trim();
    }
}
