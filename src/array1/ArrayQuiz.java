package array1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 띠 계산
        //year(sc);


        // 점수 계산
        //score();

        // 로또
        //lotto1();
        //lotto2(sc);


        // 1~25까지의 수를 ㄹ자모양으로 채워 출력
        //revers();


        // A~Y가지의 영문자를 5*5배열에 채워 출력
        //alphabetRevers();


        // 4행 5열의 배열에 1~20까지의 수를 출력
        //hold();

        // 역직삼각형 1~15 5*5배열
        //triangle();

        // 대각선모양으로 1~25까지 출력
        //diagonal();

        // A~Z까지 난수를 이용하요 발생문자를 4*4배열에 0행0열부터
        // 행우선으로 대입 하여 출력
        // 대입 문자는 중복 안됨
        //randomAlphabet();

        // 1~25까지 달팽이모양으로 출력
        // 0,1 0,2 0,3 0,4
        // 1,4 2,4 3,4
        // 4,3 4,2 4,1
        // 3,0 2,0 1,0
        // 1,1 1,2 1,3
        // 2,3 3,3
        // 3,2 3,1
        // 2,1
        // 2,2
        




        // 마방진



        sc.close();
    }

    private static void randomAlphabet() {
        char[][] crr = new char[4][4];


        for (int i = 0 ; i<crr.length;i++){
            for (int j=0; j<crr[i].length; j++){
                crr[i][j] = (char) ((Math.random() * 26) + 65);
                label :
                for (int k = 0 ; k<=i; k++){
                    for (int l = 0; l<crr[k].length; l++){
                        if (k==i && l>=j){
                            break label;
                        }
                        if (crr[i][j] == crr[k][l]){
                            j--;
                            break label;
                        }
                    }
                }
            }
        }

        for (char[] chars : crr) {
            for (char aChar : chars) {
                System.out.print(aChar + "\t");
            }
            System.out.println();
        }
    }

    private static void diagonal() {
        int[][] arr = new int[5][5];
        int n = 0 ;

        int k;
        for (int i = 0 ; i<9; i++){
            for (int j = 0; j<5; j++){
                k = i-j;
                if(k < 0 || k >4){
                    continue;
                }
                arr[j][k] = ++n;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static void triangle() {
        int[][] arr = new int[5][5];
        int num = 0;

        for (int i = 0 ; i<arr.length;i++){
            for (int j = i; j<arr[i].length; j++){
                arr[i][j] = ++num;
            }
        }

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j] != 0) {
                    System.out.print(arr[i][j] + "\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    private static void hold() {
        int[][] arr = new int[4][5];


        int num = 0;
        int num1;
        for (int i = 0 ; i < 5; i++){
            for (int j = 0; j<4 ; j++){
                num1 = i%2 == 0 ? j : 3-j;
                System.out.println(num1);
                arr[num1][i] = ++num;

            }
            System.out.println();
        }


        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static void alphabetRevers() {
        int[][] arr = new int[5][5];
        int ch = 64;
        int n;
        char c = 'A';
//        for (int i = 0; i < arr.length; i++) {
//            n = ch;
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = n+=5;
//            }
//            --ch;
//        }


        for (int i = 0 ; i<5; i++){
            for (int j = 4; j>=0; j--){
                arr[j][i] = c++;
            }
        }


        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print((char) anInt + "\t");
            }
            System.out.println();
        }
    }

    private static void revers() {
        int[][] arr = new int[5][5];
        int check = 0;
        int check1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                check1 = 1%2 == 0 ? j : 4 - j;
                arr[i][check1] = ++check;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static void lotto2(Scanner sc) {
        int n = 0;

        do {
            System.out.print("로또 게임 수 입력 : ");
            n = sc.nextInt();
        } while (n < 1 || n > 5);

        int[][] num = new int[n][6];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                num[i][j] = (int) (Math.random() * 45) + 1;
                for (int k = 0; k < j; k++) {
                    if (num[i][j] == num[i][k]) {
                        j--;
                        break;
                    }
                }
            }
            Arrays.sort(num[i]);
        }

        int count = 0;
        for (int[] i : num) {
            System.out.print(++count + "번째 게임 : ");
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    private static void lotto1() {
        int[] num = new int[6];

        for (int i = 0; i < 6; i++) {
            num[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    private static void score() {

        Scanner sc = new Scanner(System.in);
        int num;
        int[] numArr = new int[5];
        int sum = 0, min = 0, max = 0;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print((i + 1) + ". " + "점수 입력 : ");
                num = sc.nextInt();
            } while (num < 0 || num > 10);

            min = min > num || min == 0 ? num : min;
            max = max < num ? num : max;
            sum += num;
            numArr[i] = num;
        }

        System.out.print("점수 리스트 : ");
        for (int i : numArr) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("취득점수 : " + (sum - max - min));

        sc.close();
    }

    private static void year(Scanner sc) {
        int year;
        String[] month = {"원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "뱀", "말", "양"};


        do {
            System.out.print("년도 입력 : ");
            year = sc.nextInt();
        } while (year < 1900);

        System.out.printf("%d년은 %s띠 입니다.\n", year, month[(year) % 12]);
    }
}
