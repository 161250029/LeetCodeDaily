package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    int count;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> lists = new ArrayList<Integer>();
        int number = 0;
        int max = 0;
            number = in.nextInt();
            max = in.nextInt();
            for(int i = 0 ; i < max ; i ++) {
                lists.add(in.nextInt());
            }
        Collections.sort(lists);
        Main main = new Main();
        main.getMaxCount(max - 1 , lists , number);
        System.out.println(main.count);
    }
    public boolean getMaxCount(int index , ArrayList<Integer> list, int left) {
        int n = left/list.get(index);
        if (left == 0)
            return false;
        if (index == 0)
            if(left % list.get(index) != 0)
                return false;
            else {
                if (count == -1)
                    count = 0 + left/list.get(index);
                else
                    count = count + left/list.get(index);
                return true;
            }
        while(n > 0){
            if(getMaxCount(index - 1 , list , left - n * list.get(index))) {
                if (count == -1)
                    count = 0 + n;
                else
                    count = count + n;
                return true;
            }
            else
                n--;
        }
        count = -1;
        return false;
    }
}
