package org.example;

import org.example.custom_collection.Custom_Collection;

public class Main_Class
{
    public static void main( String[] args )
    {
        Object[] list={'a',"Hello",12,2.2,true,'b',"Hi",10,'a',null};
        Custom_Collection col=new Custom_Collection();
        for (Object o:list){
            col.add(o);
        }
        System.out.println(col.size());
        col.print(0,col.size());
        col.remove(1);
        col.print(0,col.size());
        System.out.println(col.get(6));
    }
}
