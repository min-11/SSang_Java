package ch02_unit01;

public class WhileType {

    public static void main(String[] args) {

        int a = 0;
        a = refactoringMethod(a);
        System.out.println();
        System.out.println(a);




    }



    private static int refactoringMethod(int a) {
//        while (++a < 10) {
//            //a++;
//            System.out.println("a = " + a);
//        }

        while (a < 10) {
            a +=2;
            System.out.println("a = " + a);
        }

        return a;
    }


}
