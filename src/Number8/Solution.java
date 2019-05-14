package Number8;

class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.equals(""))
            return 0;
        if(!str.substring(0 , 1).equals("+") && !str.substring(0 , 1).equals("-") && (str.charAt(0) < '0' || str.charAt(0) > '9'))
            return 0;
        long sum = 0;
        boolean flag = true;
        if (str.charAt(0) == '-')
            flag = false;
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9')
            sum = sum * 10 + str.charAt(0) - '0';
        for(int i = 1 ; i < str.length() ; i ++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
                sum = sum * 10 + str.charAt(i) - '0';
            else
                break;
            //这一步很关键，不能把sum计算完了之后再做判断，因为可能会出现long的溢出。
            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
                return flag == true ? 2147483647 : -2147483648;
        }
        return flag == true ? (int)sum : 0 - (int)sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("18446744073709551617"

        ));
    }
}
