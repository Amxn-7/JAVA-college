package Class7;
public class insertion {
    static int[] insert(int[] a, int pos, int e) {
        int n = a.length;
        int[] A = new int[n + 1];

        // Copy elements before pos
        for (int i = 0; i < pos; i++) {
            A[i] = a[i];
        }

        // Insert new element
        A[pos] = e;

        // Copy remaining elements
        for (int i = pos; i < n; i++) {
            A[i + 1] = a[i];
        }

        return A;
    }

    public static void main(String[] args) {
        int[] aa = {1, 2, 3, 4, 6};
        int[] as1 = insert(aa, 4, 5);

        for (int s : as1) {
            System.out.print(s + " ");
        }
    }
}