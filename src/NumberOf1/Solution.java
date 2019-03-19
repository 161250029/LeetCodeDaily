package NumberOf1;

public class Solution {
    public int NumberOf1(int n) {
        int result = 0;
        if(n >= 0) {
            while(n > 0) {
                result += n %2;
                n = n/2;
            }
        }
        else {
            String temp = "";
            int m = -n;
            while(m > 0) {
                temp = n %2 + temp;
                n = n/2;
            }
            int carrier = 0;
            for(int i = 0 ; i < temp.length(); i ++) {
                if(temp.charAt(i) == '0')
                  temp = temp.substring(0 , i) + "1" +temp.substring(i + 1);
                else
                    temp = temp.substring(0 , i) + "0" +temp.substring(i + 1);
            }
            for(int i = 0 ; i < temp.length(); i ++) {
                if(temp.charAt(i) == '0') {
                    if(carrier != 0) {
                        result += 1;
                        carrier = 0;
                    }
                }
                if(temp.charAt(i) == '1') {
                    if(carrier != 0) {
                        carrier = 1;
                    }
                    else {
                        result += 1;
                    }
                }
            }
            result += carrier;
        }
        return result;
    }
}