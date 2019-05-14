package MoneyTest;
import java.util.ArrayList;
import java.util.Scanner;
public class Main2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int result = 0;
            ArrayList<Integer> all = new ArrayList<>();
            for(int i = 0 ; i < n ; i ++) {
                all.add(sc.nextInt());
            }
            if(!isCommon(all)) {
                for(int i = 0 ; i < n ; i ++) {
                    int temp = all.get(i);
                    while(temp > 1) {
                        result += 1;
                        temp = temp/2;
                    }
                }
                System.out.println(result);
            }

        }

        public static boolean isCommon(ArrayList<Integer> all) {
            int Min = getMin(all);
            for(int i = 0 ; i < all.size() ; i ++) {
                if(all.get(i) % Min != 0 || (all.get(i) / Min) % 2 == 1 )
                    return false;
            }
            return true;
        }

        public static int getMin(ArrayList<Integer> all) {
            int Min = 10000000;
            for(int j = 0 ; j < all.size() ; j ++) {
                if(all.get(j) < Min)
                    Min = all.get(j);
            }
            return Min;
        }

}
