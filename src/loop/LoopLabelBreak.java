package loop;

import java.util.Scanner;

public class LoopLabelBreak {

    public static void main(String[] args) {
        // 실수를 입력받아 입력받은 수의 합 구하기
        // 입력받은 수가 0이하면 합을 출력하고 종료

        Scanner sc = new Scanner(System.in);
//        double sum = 0;
//        while (true) {
//            System.out.print("실수 입력 : ");
//            double num1 = sc.nextDouble();
//            if (num1 < 0) {
//                System.out.println("합 : " + sum);
//                break;
//            } else {
//                sum += num1;
//            }
//        }

        // 1. 합 2. 짝수합 3. 홀수합 4. 종료 => 1
        // 원하는 수 ? 10
        // 합은 55

        int sum = 0;
        int start, step;
        String msg;
        //sum = case1(sc, sum);

        int ch;
        int num;
        while (true) {
            do{
                System.out.println("1. 합 2. 짝수합 3. 홀수합 4. 종료");
                ch = sc.nextInt();
            }while (ch < 1 || ch >4);
            if (ch == 4){
                System.out.println("종료합니다");
                break;
            }

            do {
                System.out.print("원하는 수 입력 : ");
                num = sc.nextInt();
            }while (num < 1);

            if (ch == 1){
                start = 1; step = 1;  msg = "합";
            }else if(ch == 2) {
                start =2; step = 2;  msg = "짝수합";
            }else {
                start =1; step = 2;  msg = "홀수합";
            }
            sum = 0;
            for (int i = start; i <= num; i+=step){
                sum += i;
            }
            System.out.println(msg + " : " + sum);
        }









        sc.close();


    }

    private static int case1(Scanner sc, int sum) {
        label1:
        while (true) {
            System.out.println("1. 합 2. 짝수합 3. 홀수합 4. 종료");
            int num = sc.nextInt();

            switch (num) {
                case 1: {
                    System.out.print("원하는 수 입력 : ");
                    int number = sc.nextInt();
                    for (int i = 1; i <= number; i++) {
                        sum += i;
                    }
                    System.out.println("합 : " + sum);
                    sum = 0;
                }
                break;
                case 2: {
                    System.out.print("원하는 수 입력 : ");
                    int number = sc.nextInt();
                    for (int i = 1; i <= number; i++) {
                        sum = i % 2 == 0 ? sum + i : sum;
                    }
                    System.out.println("합 : " + sum);
                    sum = 0;
                }
                    break;
                case 3: {
                    System.out.print("원하는 수 입력 : ");
                    int number = sc.nextInt();
                    for (int i = 1; i <= number; i++) {
                        sum = i % 2 == 1 ? sum + i : sum;
                    }
                    System.out.println("합 : " + sum);
                    sum = 0;
                }
                    break;
                case 4:
                    System.out.println("종료합니다");
                    break label1;
                default:
                    System.out.println("잘못된 입력입니다.");
            }

        }
        return sum;
    }


}
