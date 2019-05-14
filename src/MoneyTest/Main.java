package MoneyTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        ArrayList<Integer> boys = new ArrayList<>();
        ArrayList<Integer> girls = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++) {
            boys.add(sc.nextInt());
        }
        for(int j = 0 ; j < n ; j ++) {
            girls.add(sc.nextInt());
        }
        double result = 0.0;
        int boysMax = 10000;
        int girlsMax = 10000;
        for(int j = 0 ; j < n ; j ++) {
            if(boys.get(j) < boysMax)
                boysMax = boys.get(j);
            if(girls.get(j) < girlsMax)
                girlsMax = girls.get(j);
        }
        result = 1.5 * n * boysMax;
        if(result > w)
            System.out.println(String.format("%.6f" , (double)w));
        else
            System.out.println(String.format("%.6f" , result));
    }
}
