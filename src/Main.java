public class Main {
    public static void main(String[] args) {



        //HomeWork

        int [] a = new int[3];
        a [0] = 1;
        a [1] = 2;
        a [2] = 3;

        double [] g = {1.57,7.654,9.986 };

        int [] d = new  int[4];
        d [0] = 1;
        d [1] = 4;
        d [2] = 3;
        d [3] = 2;

        System.out.print(a [0] + ", " + a [1] + ", " + a [2] );
        System.out.println();
        System.out.print(g [0] + ", " + g [1] + ", " + g [2] );
        System.out.println();
        System.out.print(d [0] + ", " + d [1] + ", " + d [2] + ", " + d [3]);
        System.out.println("\n");
        System.out.print(a [2] + ", " + a [1] + ", " + a [0] );
        System.out.println();
        System.out.print(g [2] + ", " + g [1] + ", " + g [0] );
        System.out.println();
        System.out.print(d [3] + ", " + d [2] + ", " + d [1] + ", " + d [0]);
        System.out.println("\n");

        for (int i = 0; i < a.length; i++){
            if (a[i] %2 != 0){
                a[i] = a[i] + 1;
            }
            System.out.println(a [i] );
        }











    }


}

