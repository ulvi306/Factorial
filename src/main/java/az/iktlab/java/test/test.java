package az.iktlab.java.test;

public class test {


    public static void main(String[] args) {

factorial(6);

    }
   static void factorial(int a) {

        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }

        System.out.println(b);
    }


}


