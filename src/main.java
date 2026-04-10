import java.util.*;
class main {
    static int floor(int[] arr, int target) {
        int res = -1;
        for (int x : arr) {
            if (x <= target) res = x;
        }
        return res;
    }

    static int ceiling(int[] arr, int target) {
        int res = -1;
        for (int x : arr) {
            if (x >= target) {
                res = x;
                break;
            }
        }
        return res;
    }

}
