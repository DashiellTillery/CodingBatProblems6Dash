public class Runner {
    public static void main(String[] args) {
    }

    //warmup 1
    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 && talking == true || hour > 20 && talking == true) {
            return true;
        } else {
            return false;
        }
    }

    //array 1
    public int sum3(int[] nums) {
        int n = nums[0] + nums[1];
        n = n + nums[2];
        return n;
    }

    //logic 1
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars <= 60 && cigars >= 40 || isWeekend == true && cigars >= 40) {
            return true;
        } else {
            return false;
        }
    }

    //logic 2
    public int loneSum(int a, int b, int c) {
        if (a == c && a == b) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (a == c) {
            return b;
        } else {
            return a + b + c;
        }
    }

    //string 2
    public String repeatSeparator(String word, String sep, int count) {
        String n = "";
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                n = n + word;
            } else {

                n = n + word + sep;
            }
        }
        return n;
    }

    //array 2
    public boolean has12(int[] nums) {
        int n = 0;
        int c = 0;
        int v = 0;
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                n = i;
                c++;
            }
            if (nums[i] == 2) {
                v = i;
                x++;
            }
        }
        if (x == 0 || c == 0) {
            return false;
        } else if (v < n) {
            return false;
        } else {
            return true;
        }


    }
}
