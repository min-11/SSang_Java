package array1;

import java.util.Scanner;

public class ArrayClass {

    public static void main(String[] args) {


        // 5명의 이름과 점수를 입력받아 편차(수-평균)를 계산하여 출력하고
        //   마지막에 총합과 평균 출력

        Scanner sc = new Scanner(System.in);

        //mis(sc);

        // 1~100까지 수중 서로 난수 10개를 발생하여 출력
        // 중복안됨
        //tenRandomNumber();


        // 1~10까지 난수 100개를 발생하여 한줄에 10개씩 출력
        // 마지막에 1~10까지 수가 각각 몇번씩 나왔는지 출력
        //hundredRandomNumber();
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month=0, year=0;
        int tot=0, week=0;


        do {
            System.out.print("년도 입력 : ");
            year = sc.nextInt();
        } while (year < 100);


        do {
            System.out.print("월 입력 : ");
            month = sc.nextInt();
        } while (month < 1 || month > 12);


        // 년도가 4의배수이고 100의배수가 아니며 4000의 배수이면 윤년 2월이 29일,아니면 28일

        days[1] = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 29 : 28;
        tot = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;


        for (int i = 0; i < month-1; i++) {
            week += days[i];
        }

        tot += 1;

        week = tot % 7;

        System.out.printf("\n\t%d년%d월\n",year,month);
        System.out.println("  일\t월\t화\t수\t목\t금\t토");
        System.out.println("====================================");

        for (int i = 0; i < week; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= days[month-1] ; i++) {
            System.out.printf("%4d",i);
            if (++week % 7 == 0){
                System.out.println();
            }

        }

        if (week % 7 != 0){
            System.out.println();
        }



        sc.close();


    }


    private static void hundredRandomNumber() {
        //int[] numArr = new int[100];
        int[] numArr1 = new int[10];
        int n = 0;

        for (int i = 1; i <= 100; i++) {
            n = (int) (Math.random() * 10) + 1;
            System.out.print(n + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
            numArr1[n - 1]++;
        }
        System.out.println();
        n = 0;
        for (int i : numArr1) {
            System.out.println((++n) + "  " + i);
        }

//        for (int i = 0; i < 100; i++) {
//            numArr[i] = (int) (Math.random() * 10) + 1;
//            System.out.print(numArr[i] + "\t");
//            if ((i+1)%10 == 0){
//                System.out.println();
//            }
//
//            // i[i-1]++;
//        }
//
//        for (int i = 1; i <= 10; i++) {
//            int count = 0;
//            for (int j = 0; j < 100; j++) {
//                if (numArr[j] == i){
//                    count++;
//                }
//            }
//            System.out.println(i + "의 개수 : " + count);
//        }
    }

    private static void tenRandomNumber() {
        int[] numArr = new int[10];
        for (int i = 0; i < 10; i++) {
            numArr[i] = (int) (Math.random() * 100) + 1;
            for (int j = 0; j < i; j++) {
                if (numArr[i] == numArr[j]) {
                    i--;
                    break;
                }
            }
            System.out.print(numArr[i] + " ");
        }
    }

    private static void mis(Scanner sc) {
        int sum = 0;
        double avg;
        String[] nameArr = new String[5];
        int[] scoreArr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". " + "이름 입력 : ");
            nameArr[i] = sc.next();
            System.out.print((i + 1) + ". " + "점수 입력 : ");
            scoreArr[i] = sc.nextInt();
            ;
            sum += scoreArr[i];
        }


        avg = (double) sum / 5;

        for (int i = 0; i < 5; i++) {
            System.out.println(nameArr[i] + "의 편차 : " + (scoreArr[i] - avg));
        }
    }


}
