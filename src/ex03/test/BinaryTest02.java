package ex03.test;

public class BinaryTest02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int N = arr.length;

        int target = 8;
        int mid = N/2;
        int start = 0;
        int end = N-1; //배열은 0부터 시작하니까

        if (target == arr[mid]) {
            System.out.println("찾았습니다.");
        }

        if (target > arr[mid]) {
            start = arr[mid] + 1;
        }

        if (target < arr[mid]) {
            start = arr[mid] - 1;

        }


    }
}
