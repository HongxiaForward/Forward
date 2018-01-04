public class Solution {
    public static void main(String[] args) {
        Solution sol =new Solution();
        int result=sol.reverse(-123);
        System.out.println(result);
    }
    public int reverse(int x) {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
    }




