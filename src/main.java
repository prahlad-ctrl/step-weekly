import java.util.*;
class main {
    static class Asset {
        String name;
        double returnRate;
        double volatility;

        Asset(String name, double r, double v) {
            this.name = name;
            this.returnRate = r;
            this.volatility = v;
        }
    }

    // Merge Sort for Assets
    static void mergeSortAssets(Asset[] arr, int l, int r) {
        if (l >= r) return;

        int m = (l + r) / 2;
        mergeSortAssets(arr, l, m);
        mergeSortAssets(arr, m + 1, r);
        mergeAssets(arr, l, m, r);
    }

    static void mergeAssets(Asset[] arr, int l, int m, int r) {
        Asset[] temp = new Asset[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (arr[i].returnRate <= arr[j].returnRate)
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++)
            arr[l + x] = temp[x];
    }

}
