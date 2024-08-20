package array1;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        // 배열내용 복사

//        int[] a = new int[] {10,20,30};
//        int[] b = new int[a.length];
//        int[] c = a;


        // 원본배열, 원본의시작위치, 복사할배열, 복사시킬위치, 복사할개수
        //System.arraycopy(a,0,b,1,a.length-1);
        //System.out.println(a==b);

        //System.out.println(Arrays.toString(b));

        //arrayCopy();


        // 명령행 인수
        // argument
//        System.out.println(args.length);
//        for (String s : args) {
//            System.out.println(s);
//        }




    }

    private static void arrayCopy() {
        String[] s1 = new String[]{"java", "servlet", "spring"};
        String[] s2 = new String[s1.length + 3];

        System.arraycopy(s1, 0, s2, 1, s1.length - 1);

        for (String s : s1) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : s2) {
            System.out.print(s + " ");
        }

        // ================================
        //ArrayCopy 2차원 배열 주의사항
        int[][] a = new int[][]{{10, 20, 30}, {40, 50, 60}};
        int[][] b = new int[2][3];

        System.arraycopy(a, 0, b, 0, a.length);
        for (int[] ints : b) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }



        b[1][1] = 500;
        System.out.println(a[1][1]+":"+b[1][1]);





    }


}
