public class Me_1 {
    static void call()
    {
        System.out.println("Good Evening Baby");
    }
    static void call(String s)
    {
        System.out.println("Good Evening Uncle");
    }
    static void call(int a,int b)
    {
        System.out.println("Good Evening Aunty");
    }
    public static void main(String[]args)
    {
        call();
        call("hello");
        call(4,5);
    }
}
