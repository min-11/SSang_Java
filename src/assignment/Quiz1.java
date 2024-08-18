package assignment;

import java.util.Scanner;

public class Quiz1 {


    public static void main(String[] args) {

        // 1
        // 1-2+3-4... 100이상이 되는 최소의 수와 그때의 합
        //first();

        // 2
        // 정수 입력받아 입력받은 정수가 몇자리정수인지 출력하는 프로그램
        Scanner sc = new Scanner(System.in);
        //second(sc);

        // 3
        //두 정수를 입력받아 최대공약수와 최소공배수를 출력하는 프로그램
        //minimumAndMaximum(sc);

        // 4
        // 0부터 입력받은 개수만큼의 피보나치수열 출력
        //fibonacci(sc);

        // 5
        // 금액을 입력받아 5만원, 1만원, 5천원, 1천원, 500원, 100원, 50원, 10원, 5원, 1원의 개수를 출력하는 프로그램
        money(sc);

        // 6
        // 1~100까지의 난수를 발생시켜 몇번에 맞추는지 출력하는 프로그램
        //randomNumberGeneration(sc);


        // 7
        // 양의 정수를 입력받아 입력받은 정수를 뒤집어 출력하는 프로그램 작성
        //upsideDown(sc);

        // 8
        // 2이상의 정수를 입력받아 소인수 분해하여 출력
        //primeFactorization(sc);


        // 9
        // 정수 입력받아 정수가 소수인지 아닌지 판별하는 프로그램 작성
        //decimalFraction(sc);
        sc.close();

    }

    private static void minimumAndMaximum(Scanner sc) {
        System.out.print("두 정수 입력 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ch = 0;
        int storage = 0;

        if (num1 < num2){
            ch = num1;
            num1 = num2;
            num2 = ch;
        }
        storage = num1*num2;
        while (num1 % num2 != 0){
            ch = num1 % num2;
            num1 = num2;
            num2 = ch;
        }

        System.out.println("최대공약수 : " + num2);
        System.out.println("최소공배수 : " + storage/num2);
    }

    private static void primeFactorization(Scanner sc) {
        int num;
        int count = 1;
        do {
            System.out.print("정수 입력 : ");
            num = sc.nextInt();
        }while (num < 2);

        System.out.print(num + " = ");
        while (num > 1){
            count++;
            if (num % count == 0){
                num /= count;
                System.out.print(count);
                System.out.print((num == 1 ? "" : "*"));
                count = 1;

            }
        }
    }

    private static void decimalFraction(Scanner sc) {
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int count = 2;
        String str = "소수임";
        while (count < num) {
            if (num % count == 0) {
                str = "소수가 아님";
                break;
            }else {
                str ="소수임";
            }
            count++;

        }
        System.out.println(num + " : " +str);
    }

    private static void upsideDown(Scanner sc) {
        int num;
        int check;
        String str = "";
        do {
            System.out.print("정수 입력 : ");
            num = sc.nextInt();
        } while (num <= 0);

        while (num > 0) {
            check = num % 10;
            num /= 10;
            str = "" + check;
            System.out.print(str);
        }
    }

    private static void randomNumberGeneration(Scanner sc) {
        int num, a, count;
        count = 0;

        while (true) {
            System.out.print("정수 입력 : ");
            num = sc.nextInt();
            a = (int) (Math.random() * 100) + 1;
            count++;
            if (a > num) {
                System.out.println("입력한 수보다는 큰수 입니다");
            } else if (a < num) {
                System.out.println("입력한 수보다는 작은수 입니다");
            } else {
                System.out.println(count + "번만에 성공했습니다");
                break;
            }
        }

    }

    private static void money(Scanner sc) {
        System.out.print("금액입력 : ");
        int money = sc.nextInt();
        int coin = 50000;

        int num = 0;
        while (true) {
            int count = money / coin;
            System.out.println(coin + "원 : " + count + "개");

            money %= coin;

            int check = 1;
            while (coin > 0) {
                coin/=10;
                num += (coin%10);
                if (coin == 0){
                    break;
                }
                check*=10;

            }
            System.out.println(num);
            if (num%5 == 0){
                coin = check*num;
                System.out.println(coin);
            }else {
                coin = check;
            }




//            if (coin == 50000) {
//                coin = 10000;
//            } else if (coin == 10000) {
//                coin = 5000;
//            } else if (coin == 5000) {
//                coin = 1000;
//            } else if (coin == 1000) {
//                coin = 500;
//            } else if (coin == 500) {
//                coin = 100;
//            } else if (coin == 100) {
//                coin = 50;
//            } else if (coin == 50) {
//                coin = 10;
//            } else if (coin == 10) {
//                coin = 5;
//            } else if (coin == 5) {
//                coin = 1;
//            } else break;



        }
    }

    private static void fibonacci(Scanner sc) {
        System.out.print("개수 입력 : ");
        int num = sc.nextInt();
        int a, sum;
        int b = 1;
        a = sum = 0;
        System.out.print(a + " " + b + " ");
        num -= 2;
        while (num > 0) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
            num--;
        }
    }

    private static void second(Scanner sc) {
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int count, storage;
        count = 0;
        storage = num;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(storage + "은 " + count + "자리 정수");
    }

    private static void first() {
        int a, sum;
        a = 0;
        sum = 0;
        while (sum < 100) {
            a++;
            if (a % 2 == 0) {
                sum -= a;
            } else {
                sum += a;
            }
        }
        System.out.println("n : " + a);
        System.out.println("s : " + sum);
    }


}
