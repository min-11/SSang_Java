package array1;

import java.util.Scanner;

public class Dimensional_Array {

    public static void main(String[] args) {

        // 2차원배열
        //test();


        // 5*4 배열에 1~100사이의 난수를 발생하여 대입후 출력하고
        // 5*4 행렬을 4*5행렬로 변환하여 출력
        //extracted();

        //reset();

        /*
        인원수(1이상)을 입력받아 입력받은 인원수만큼의
        이름,국어,영어, 수학 점수를 입력받아 총점,평균,석차 구하기

        */

        testRating();



    }

    private static void testRating() {
        Scanner sc = new Scanner(System.in);
        int cnt;
        String[] name;
        int[][] score;
        int[] total;
        int[] rank;
        String[] title = new String[]{"국어", "영어", "수학"};
        do {
            System.out.print("인원수 입력 : ");
            cnt = sc.nextInt();
        } while (cnt < 1);

        name = new String[cnt];
        score = new int[cnt][3];
        total = new int[cnt];
        rank = new int[cnt];


        // 데이터 입력 및 총점 계산
        for (int i = 0; i < cnt; i++) {
            System.out.print("이름 입력 : ");
            name[i] = sc.next();
            for (int k = 0; k < score[i].length; k++) {
                do {
                    System.out.print(title[k] + "점수 입력 : ");
                    score[i][k] = sc.nextInt();
                } while (score[i][k] < 0 || score[i][k] > 100);
                total[i] += score[i][k];
            }

        }

        /*for (int i = 0; i < cnt; i++) {
            rank[i] = 1;
            for (int k = 0; k < cnt; k++) {
                if (total[i] < total[k]) {
                    rank[i]++;
                }
            }
        }*/
        


        for (int i = 0; i < cnt-1; i++) {
            rank[i] = 1;
            for (int k = i+1; k < cnt; k++) {
                if (total[i] < total[k]) {
                    rank[i]++;
                }else if(total[i] > total[k]){
                    rank[k]++;
                }
            }
        }


        for (int i = 0; i < cnt; i++) {
            System.out.println("이름\t국어\t영어\t수학\t총점\t석차");
            System.out.print(name[i] + "\t");
            for (int k = 0; k < score[i].length; k++) {
                System.out.print(score[i][k] + "\t");
            }
            System.out.print(total[i] + "  ");
            System.out.println(rank[i]);
        }

        sc.close();
    }

    private static void reset() {
        int[][] a = new int[][]{{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = new int[][]{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();

        }

        for (int[] ints : b) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static void extracted() {
        int[][] a = new int[5][4];
        int[][] b = new int[4][5];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100) + 1;
            }
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }

        for (int[] ints : b) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();

        }
    }

    private static void test() {

        /*
           1  6 11 16
           2  7 12 17
           3  8 13 18
           4  9 14 19
           5  10 15 20
*/
        int[][] arr = new int[5][4];


        for (int i = 0; i < arr.length; i++) {
            int a = i + 1;
            arr[i][0] = i + 1;
            //System.out.print(a + "\t");
            System.out.print(arr[i][0] + "\t");
            //a+=5;
            a += (5);
            for (int j = 1; j < arr[i].length; j++) {
                System.out.print(a + "\t");
                a += 5;
            }
            System.out.println();
        }
    }

}
