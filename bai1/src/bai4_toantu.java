public class bai4_toantu {
    public static void main(String[] args) {
        //1. Toan tu so hoc +, -, *, /, %, ++, --
        int x =8;
//        System.out.println(--x);

        //2. Toan tu so gan =, +=, -=, *=, /=, %=
        x %=1;
        System.out.println(x);
        //3. Toan tu so sanh ==, !=, >, <, >=, <=
        System.out.println(9!=8);

        //4. Toan tu logic && || !
        System.out.println(!(8<5 && 8<10));

        //5. Toan tu bit &, |, ~, ^, <<, >>, >>>
        System.out.println((char)('A'|' '));
    }
}
