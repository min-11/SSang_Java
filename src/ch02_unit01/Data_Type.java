package ch02_unit01;

public class Data_Type {

    public static void main(String[] args) {

        // 정수형
        byte byteValue = 10; // -128 ~ 127
        byte byteValue1 = 10; // 1바이트
        //byte byteValue2 = 129; // 범위초과

        byteValue1 = 20; // 인스턴스 초기화

        short shortValue = 20; // 2바이트

        int intValue = 0; // 4바이트

        long longValue = 40; // 8바이트


        // 실수형
        float floatValue = 3.14f; // 4바이트

        double doubleValue = 3.14; // 8바이트

        // 문자형
        char charValue = 'A'; // 2바이트

        // 논리형
        boolean booleanValue = true; // 1바이트


//                  *       1  5 5         6              0
//                 ***      3  4 4        567            101
//                *****     5  3 3       45678          21012
//               *******    7  2 2      3456789        3210123
//              *********   9   1 1    2345678910
//             ***********  11  0 0   1234567891011
//              *********   9
//               *******    7
//                *****     5
//                 ***      3
//                  *       1

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("별 수 입력:");
//
//        int section1 = sc.nextInt();
//        int n2 = 1;
//
//        while (true) {
//            if (section1 <= 0) {
//                break;
//            }
//
//            for (int i = 0; i < section1 - 1; i++) {     // 4 5 6
//                System.out.print(" ");
//            }
//
//            for (int a = 0; a < n2; a++) {  // 1 3 5 7 9
//                System.out.print("*");
//            }
//
//            System.out.println();
//            section1 -= 1;
//            n2 += 2;
//
//        }
//
//        while (true) {
//
//            if (n2 <= 0) {
//                break;
//            }
//
//            for (int i = section1 + 1; i > 0; i--) {     // 4 5 6
//                System.out.print(" ");
//            }
//
//
//            for (int a = n2 - 4; a > 0; a--) {  // 1 3 5 7 9
//                System.out.print("*");
//            }
//            System.out.println();
//            section1 += 1;
//            n2 -= 2;
//
//        }


        // 10~200 사이의 정수 입력후 입력받은수 아스키코드 변환

//        Scanner sc = new Scanner(System.in);
//        System.out.print("10~200 사이의 정수 입력:");
//        int num = sc.nextInt();
//        char ch = (char) num;
//        System.out.println("아스키코드 변환값: " + ch);
//
//
//        sc.close();
        // 문자 하나 입력받아 받은 아스키 코드 출력

        /*
        Scanner sc1 = new Scanner(System.in);
        System.out.print("한 문자 입력:");
        char ch1 = sc1.next().charAt(0);
        String st1 = sc1.next();
        int num1 = ch1;
        int num2 = st1.charAt(0);
        //int num2 = Integer.parseInt(st1);
        System.out.println("아스키코드 변환값: " + num1);
        System.out.println("아스키코드 변환값: " + num2);
        sc1.close();
        */

    }



    // 문서화 주석
    /**
     * 짝수인지 판별하는 메소드
     * <p> 정수를 2로 나눈 나머지가 0이면 짝수이다</p>
     * @param ss          짝수인지를 판별하는수 <code> int </code>
     * @return  짝수여부를 반환한다     <code> boolean <code/>
     *
     */
    public int as(int ss){

        return ss;
    }







}
