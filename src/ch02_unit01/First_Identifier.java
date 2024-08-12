package ch02_unit01;

import java.util.Calendar;
import java.util.Scanner;

public class First_Identifier {

    public static void main(String[] args) {

//        int num;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("구구단 숫자입력:");
//        num= sc.nextInt();
//
//        for (int i = 1; i <10 ; i++){
//            System.out.println(num + " * " + i + " = " + num*i);
//        }

        // 1단부터 9단까지 구구단
//        for (int i = 1; i <10 ; i++){
//            for (int j = 2; j <10 ; j++){
//                System.out.print(j + " * " + i + " = " + i*j+"\t");
//            }
//            System.out.println();
//
//        }


        Scanner sc = new Scanner(System.in);
//
//        System.out.print("별 수 입력:");
//        int A = sc.nextInt();
//
//        for(int i = 0; i < A; i++){
//           for (int b = 0; b < i+1;b++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }



//        for(int i = 0; i < A; i++){
//            for (int b = 0; b < A-i;b++){
//                System.out.print(" ");
//            }
//            for (int b = 0; b < i+1;b++){
//                System.out.print("*");
//            }
//            for (int b = 0; b < i;b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        System.out.print("사칙연산 한가지 입력:");
        String four = sc.next();
        System.out.print("계산한 수 두가지 입력:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (four){
            case "+":
                System.out.println("입력한수 : "+ a + " , " + b);
                System.out.println("덧셈결과: "+ (a+b));
                break;
            case "-":
                System.out.println("입력한수 : "+ a + " , " + b);
                System.out.println("빼기결과: "+ (a-b));
                break;
            case "*":
                System.out.println("입력한수 : "+ a + " , " + b);
                System.out.println("곱셈결과: "+(a*b));
                break;
            case "/":
                System.out.println("입력한수 : "+ a + " , " + b);
                System.out.println("나누기결과: "+(a/b));
                break;
            default:
                System.out.println("잘못된 입력");



        }


        sc.close();




    }

    public int Scan(int a){
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력:");
        int n =  sc.nextInt();
        n+=a;


        String longName;
        System.out.print("공백 포함 입력:");
        longName = sc.next();





        System.out.println("입력한 문자열은 " + longName + "입니다.");
        sc.close();
        return n;


    }




}