public class _08_method {

    public static int sum(int x, int y){
        int result = x + y;
        return result;
    }

    public static void myMethod(){
        System.out.println("Good day");
    }
    static int plusMethodInt(int x, int y){
        return x + y;
    }
    static double plusMethodDouble (double x, double y){
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        myMethod();

        int MyNum1 = plusMethodInt(8,5);
        double MyNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + MyNum1);
        System.out.println("double " + MyNum2);
    }




}
