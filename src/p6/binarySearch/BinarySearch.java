package p6.binarySearch;

public class BinarySearch {

    static int binarySearch(int[] ar, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if(ar[mid] == target) {
                return mid;
            } else if(ar[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ar = {1, 3, 4, 5, 6, 8, 9};

        int result = binarySearch(ar, 8, 0, ar.length);

        System.out.println(result);

    }
}
