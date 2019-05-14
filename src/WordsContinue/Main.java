package WordsContinue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = sc.next();
        int Max = -1;
        for(int i = 0 ; i < str.length() ; i ++) {
            int temp = 0 ;
            int count = m;
            for(int j = i ; j < str.length() ; j ++) {
                if(str.substring(j , j + 1).equals("a")) {
                       temp ++;
                       Max = Math.max(temp , Max);
                }
                else {
                    if (count > 0) {
                        count --;
                        temp ++;
                        Max = Math.max(temp , Max);
                    }
                    else
                        break;
                }
            }
        }
        System.out.println(Max);
    }
}
