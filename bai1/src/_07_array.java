public class _07_array {
    public static void main(String[] args) {
        String cars[];
        String[] cars_1 = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] cars_2 = new String[10];

        System.out.println(cars_1[cars_1.length -1]);

        cars_1[0] = "Toyota";
        System.out.println(cars_1[0]);

        for (int i=0; i< cars_1.length; i++)
        {
            System.out.print(cars_1[i] + "\t");
        }
        System.out.println();
        for (String i:cars_1)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int index = 0; index < myNumbers.length; ++index) {
            for(int j = 0; j < myNumbers[index].length; ++j) {
                System.out.println(myNumbers[index][j]);
            }
        }

        int i =1;
        System.out.println(i++);
        System.out.println(++i);
    }
}
