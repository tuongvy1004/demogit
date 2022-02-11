public class _06_loop {
    public static void main(String[] args) {
        for(int index =1; index <=4; index++)
        {
            if (index==3)
                continue;
            System.out.print(index + "\t");
        }

        System.out.println( );
        String[] cars = {"Volvo","BMW", "Ford", "Mazda"};
        for (String element: cars){
            System.out.print(element + "\t" );
        }

        System.out.println( );
        int i = 0;
        while (i<5){
            System.out.print(i +"\t");
            i++;
        }

        System.out.println();
        int j =0;
        do{
            System.out.print(j+ "\t");
            j++;
        }while (j<5);
    }
}
