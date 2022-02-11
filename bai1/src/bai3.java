public class bai3 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));

        String firstname = "Tuong";
        String lastname = "Vy";
        System.out.println(firstname.concat(lastname));
        System.out.println(firstname + " " + lastname);

        System.out.println("nguyen tuong\" vy");
        System.out.println("Hello \nWorld");
        System.out.println("Hello \tWorld");
        System.out.println("Hello \bWorld");

//        int x = 10;
//        int y = 20;
//        int z = x + y;
//        System.out.println(z);

        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);

    }

}
