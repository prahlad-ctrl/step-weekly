import java.util.*;
class main {
    static class Transaction {
        String id;
        double fee;
        String timestamp;

        Transaction(String id, double fee, String timestamp) {
            this.id = id;
            this.fee = fee;
            this.timestamp = timestamp;
        }
    }

    static void bubbleSortTransactions(List<Transaction> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).fee > list.get(j + 1).fee) {
                    Collections.swap(list, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    static void insertionSortTransactions(List<Transaction> list) {
        for (int i = 1; i < list.size(); i++) {
            Transaction key = list.get(i);
            int j = i - 1;

            while (j >= 0 &&
                    (list.get(j).fee > key.fee ||
                            (list.get(j).fee == key.fee &&
                                    list.get(j).timestamp.compareTo(key.timestamp) > 0))) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    static void flagHighFee(List<Transaction> list) {
        for (Transaction t : list) {
            if (t.fee > 50) {
                System.out.println("High fee: " + t.id);
            }
        }
    }
}
