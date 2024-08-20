package class_1.ex1;

public class ObjectClassMain {

    public static void main(String[] args) {

        Test1 test1 = new Test1();

        test1.write();



    }

}


class Test1 {
    private int a =10;
    int b = 20;
    protected int c = 30;
    public int d = 40;


    public void write(){

        System.out.println(a+" : "+b+" : "+c+" : "+d);

    }


}

