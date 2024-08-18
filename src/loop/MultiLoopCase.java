package loop;

import java.util.Scanner;

public class MultiLoopCase {

    public static void main(String[] args) {

//        for (int i =0 ; i < 5; i++){
//            for (int j = 0; j <=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /*
        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            for (int a = 1; a <= i*2-1; a++) {  // 1 3 5 7 9
                System.out.print("*");
            }
            System.out.println();
        }*/


        // 1,3,5,7,9  ,7,5,3,1
        // 4,3,2,1,0  ,1,2,3,4
        int n = 6; // 다이아몬드의 높이

//        for (int i = 0; i < 2 * n - 1; i++) {
//            int spaces = i < n ? n - 1 - i : i - n + 1; // 5
//            int stars = i < n ? i * 2 + 1 : 2 * (2 * n - 2 - i) + 1; // 1
//            for (int j = 0; j < spaces + stars; j++) {
//                //System.out.print("1");
//                System.out.print((j < spaces ? " " : "*"));
//            }
//            System.out.println();
//        }

        // 6
//        for (int i = 0; i < n * 2 - 1; i++) { // 11
//            int space = i < n ? n - 1 - i : i - n + 1;  //
//            int star = i < n ? i * 2 + 1 : i; //  9 11 7 8 9 10
//            for (int y = 0; y < star+space; y++) {
//                System.out.print((space < star ? " " : "*"));
//            }
//            System.out.println();
//        }


        /*int size = 9;
        //int n;
        n = size /2;
        for (int i = 0 ; i <size ; i++){ // 9
            for (int j = 0 ; j < (size - n); j++){   // 5 // 4 //
                System.out.print((j>=n ? "*" : " "));
            }
            n = i<(size/2) ? n-1 : n+1;  // 0 < 4  // 5 //
            System.out.println();
        }*/


        //  5개의 실수를 입력받아 입력받은 수 중 양수의 합 구하기
        Scanner sc = new Scanner(System.in);

        //fiveActualNumber(sc);

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (i+j == 4-1) {
//                    continue;
//                }
//                System.out.println(i + " " + j);
//            }
//
//        }

        // 5개의 홀수를 입력받아 홀수의 합 구하기
        // 단 입력받은 수가 0이하임거나 짝수이면 재입력
        //fiveOddNumberSum(sc);

        while (true) {
            System.out.println("1.가위 2.바위 3.보 4.종료");
            int num = sc.nextInt();
            int com = (int)(Math.random()*3)+1;
            if (num == 4) {
                System.out.println("게임을 종료합니다.");
                break;
            }else if (num == 1 && com == 2) {
                System.out.println("컴퓨터 : 바위, 당신 : 가위, 컴퓨터 승");
            } else if (num == 1 && com == 3) {
                System.out.println("컴퓨터 : 보, 당신 : 가위, 당신 승");
            } else if (num == 2 && com == 1) {
                System.out.println("컴퓨터 : 가위, 당신 : 바위, 당신 승");
            } else if (num == 2 && com == 3) {
                System.out.println("컴퓨터 : 보, 당신 : 바위, 컴퓨터 승");
            } else if (num == 3 && com == 1) {
                System.out.println("컴퓨터 : 가위, 당신 : 보, 컴퓨터 승");
            } else if (num == 3 && com == 2) {
                System.out.println("컴퓨터 : 바위, 당신 : 보, 당신 승");
            } else {
                System.out.println("비겼습니다.");
            }

        }

        while (true) {
            System.out.println("1.가위 2.바위 3.보 4.종료");
            int num = sc.nextInt();
            int com = (int)(Math.random()*3)+1;
            if (num == 4) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            System.out.println("당신 : " + (num == 1 ? "가위" : num == 2 ? "바위" : "보"));
            System.out.println("컴퓨터 : " + (com == 1 ? "가위" : com == 2 ? "바위" : "보"));
            if (num+1 == com || num-2 == com) {
                System.out.println("컴퓨터 승");
            } else if (num-1 == com || num+2 == com) {
                System.out.println("당신 승");
            } else {
                System.out.println("비겼습니다.");
            }
            int a=65;
            System.out.printf("%c", a);
        }




        while (true) {
            System.out.println("1.가위 2.바위 3.보 4.종료");
            int num = sc.nextInt();
            int com = (int) (Math.random() * 3) + 1;

            if (num == 4) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            String[] choices = {"가위", "바위", "보"};
            String result;

            if (num == com) {
                result = "비겼습니다.";
            } else if ((num == 1 && com == 3) || (num == 2 && com == 1) || (num == 3 && com == 2)) {
                result = "당신 승";
            } else {
                result = "컴퓨터 승";
            }

            System.out.printf("컴퓨터 : %s, 당신 : %s, %s%n", choices[com - 1], choices[num - 1], result);
        }



        sc.close();


    }

    private static void fiveOddNumberSum(Scanner sc) {
        int sum = 0;
        int cnt = 0;
        System.out.print("5개의 홀수를 입력 : ");
//        for (int i = 0; i < 4; i++) {
//            while (true) {
//                int num = sc.nextInt();
//                if (num <= 0 || num % 2 == 0) {
//                    System.out.println("다시 입력하세요");
//                    continue;
//                } else {
//                    sum += num;
//                    break;
//                }
//            }
//        }

        for (int i = 1; i <= 4; ++i) {
            int num = sc.nextInt();
            if (num <= 0 || num % 2 == 0) {
                System.out.println("다시 입력하세요");
                --i;
            } else {
                sum += num;
            }
        }

//        while (cnt < 5) {
//            int num = sc.nextInt();
//            if (num <= 0 || num % 2 == 0) {
//                System.out.println("다시 입력하세요");
//                continue;
//            }
//            sum += num;
//            cnt++;
//        }

        System.out.println("홀수의 합 : " + sum);
    }

    private static void fiveActualNumber(Scanner sc) {
        double sum = 0;
        System.out.print("5개의 실수를 입력 : ");

        for (int i = 0; i < 5; i++) {
            double num = sc.nextDouble();
            if (num <= 0) {
                continue;
            }
            sum += num;

        }

        System.out.println("양수의 합 : " + sum);
    }


}
