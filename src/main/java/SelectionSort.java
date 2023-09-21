import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] arr = {5,3,1,2,4};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) { // > 오름차순
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//
//                }
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        int n = sc.nextInt();
        int temp;

        // 입력받는 수의 배열
        int[] arr = new int[n]; // 크기가 n인 배열을 생성.

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n-1; i++) {
            for(int j=1+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i<n; i++) {
            System.out.println(arr[i]);
        }


        int[] arr2 = {6, 7, 7, 5, 4, 2};
        sortBySelection(arr2);

        System.out.println(Arrays.toString(arr2));

    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public static void sortBySelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);

        }
    }
}
