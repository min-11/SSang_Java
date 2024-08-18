package array1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 띠 계산
        //year(sc);


        // 점수 계산
        //score(sc);

        // 로또
        //lotto1();
        //lotto2(sc);





        sc.close();
    }

    private static void lotto2(Scanner sc) {
        int n = 0;

        do {
            System.out.print("로또 게임 수 입력 : ");
            n = sc.nextInt();
        }while (n < 1 || n > 5);

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

    private static void score(Scanner sc) {
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
