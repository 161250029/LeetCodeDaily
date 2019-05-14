package btest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("请输入要排序的数字: ");

        Scanner sn=new Scanner(System.in);

        StringBuffer str = new StringBuffer("abc");
        str.append("test");
        str.deleteCharAt(0);
        str.delete(0 , 1);
        str.insert(0 , "true");
        str.reverse();
        str.setCharAt(0 , 'e');
        System.out.println(str.toString());
        List<Integer> list=new ArrayList<Integer>();

        while(sn.hasNext())
        {
            list.add(sn.nextInt());
        }
        System.out.println(list);

    }
}
