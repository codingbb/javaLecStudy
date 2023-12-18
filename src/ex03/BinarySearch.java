package ex03;

public class BinarySearch {
    public static void main(String[] args) {
        // N = 18
        // 시간복잡도 log2(N) -> log2(21) -> 4.x (최대 5번 안에 끝날 수 있음. 5회전까지 가는게 최악)
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        // 21 / 2*2*2*2*2 -> logn -> log21
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int N = arr.length;
        final int target = 3;
        int start = 0;
        int end = N - 1;
        int mid;

        int round = 1;
        while (true) {  //끝이 언제날지 모르니까 true를 걸어줌
            // 1 회전
            mid = start + ((end - start) / 2); // 기대값 7 (int니까)
            System.out.println("mid : " + mid);

            if (arr[mid] == target) {
                System.out.println(round + "회전 : " + target + "값은 " + mid + "번지에 있습니다");
                break;
            }

            if (arr[mid] < target) { // 기대값 start 5, end 8
                start = mid + 1;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }

            System.out.println(round + "회전 start : " + start);
            System.out.println(round + "회전 end : " + end);

            round++;
        }

        System.out.println("시간복잡도 : " + (Math.log(N) / Math.log(2)));
    }
}
