package ch02_unit01;

public class WhileQuiz2 {

    public static void main(String[] args) {

        // 1부터 10까지 전체 반복헤서 더하기
        //sum1();

        //  1/2 + 2/3+....9/10
        //dividingSum();

        // 1~100까지의 수중 3 또는 5의 배수를 제외한 수를
        // 한줄에 5개씩 출력하고 마지막에 합출력하기
        //multipleSum();

        // 난수 : 정의된 범위내에서 무작위로 추출된 수(복원 추출)
        // Math.random()*100 0에서 100사이의 난수 발생
        int num = (int) (Math.random() * 100) + 1; // 1~100


//        int dan,n;
//        dan =1;
//        while (dan < 9){
//            dan++;
//            System.out.println();
//
//            n=0;
//            while (n<9){
//                n++;
//                System.out.println(dan + " * " + n + " = " + dan*n);
//            }
//            System.out.println("---------------");
//        }


        int n = 10;
        do {
            n++;
            System.out.println("안");
        }while(n<10);
        System.out.println("밖");


    }

    private static void multipleSum() {
        int n, sum, line;
        n = sum = line = 0;

        while (++n <= 100) {
            if (n % 3 != 0 && n % 5 != 0) {
                System.out.print(n + " ");
                System.out.print((++line) % 5 == 0 ? "\n" : "\t");
                sum += n;
            }
        }
        System.out.println("\n결과 : " + sum);
    }

    private static void dividingSum() {
        int n = 0;
        double sum = 0;

        while (++n < 10) {
            sum += (double) n / (n + 1);
        }
        System.out.printf("결과 : %.3f", sum);
    }

    private static void sum1() {
        int n1, sum, n2;
        n1 = sum = 0;
//        while (++n1 <= 10){
//            n2=0;
//            while (++n2 <= n1){
//                sum += n2;
//            }
//        }
        n2 = 0;
        while (++n1 <= 10) {
            n2 += n1;
            sum += n2;
        }

        System.out.println("결과 : " + sum);
    }
}
