package array1;

// 배열 활용 정렬
public class SortClass {

    public static void main(String[] args) {


        // 선택정렬
        //selctionSort();


        // 버블정렬
        int[] arr = {25, 15, 7, 4, 12, 9, 17, 16, 20, 13};
        //bubbleSort();


        // 삽입정렬
        //int[] arr = {1, 2, 3, 4, 5, 6};
        //insertionSort();









    }


    private static void insertionSort() {
        int[] arr = {25, 15, 7, 4, 12, 9, 17, 16, 20, 13};
        //int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    private static void bubbleSort() {
        int[] arr = {25, 15, 7, 4, 12, 9, 17, 16, 20, 13};
        //int[] arr = {1, 2, 3, 4, 5, 6};
//        for (int i = 1; i < arr.length; i++) {
//            boolean flag = true;
//            for (int j = 0; j < arr.length - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int ch = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = ch;
//                    // cnt++;
//                    flag = false;
//                }
//            }
//            if (flag) {
//                break;
//            }
//        }

        // 2
//        boolean flag = false;
//        int cnt = 1;
//        do {
//            flag = false;
//            for (int i = 0; i < arr.length - cnt; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int ch = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = ch;
//                    flag = true;
//                }
//            }
//            cnt++;
//        } while (flag);


        // 3
        boolean flag = true;
        for (int i = 1; flag; i++) {
            flag = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
        }


        for (int i : arr) {
            System.out.print(i + "  ");
        }

    }

    private static void selctionSort() {
        int[] arr = {25, 15, 7, 4, 12, 9, 17, 16, 20, 13};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int ch = arr[i];
                    arr[i] = arr[j];
                    arr[j] = ch;
                }
            }
            System.out.print(arr[i] + "  ");
        }
    }

}
