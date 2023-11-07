public class M_over {
   static int sum(int n,int m) {
        return n+m;
    }
    static double sum(double n,double m) {
        return n+m;
    }

    public static void main(String[] args) {
       int sum1 = sum(4,5);
       double sum2 = sum(5.0,13.0);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}

