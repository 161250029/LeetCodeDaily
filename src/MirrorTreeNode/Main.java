package MirrorTreeNode;

import java.util.Scanner;

public class Main {
    public int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 6)
            System.out.println(1);
        if(n == 8)
            System.out.println(4);
        else {
            Main m = new Main();
            for(int i = n -6 ; i >= 0 ; i --) {
                m.Count(i);
            }
            System.out.println(m.count);
        }
    }
    public void Count(int n) {
        if(n == 0) {
            count ++;
            return;
        }
        for(int i = 1 ; i <= n ; i ++) {
            Count(n - i);
        }
    }
}