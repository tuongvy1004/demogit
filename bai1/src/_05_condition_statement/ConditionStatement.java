package _05_condition_statement;

public class ConditionStatement {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;
        if (x>y){
            System.out.println("X is greater than y");
        }

        int time = 20;
        if (time < 18){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening");
        }

        if(time <10){
            System.out.println("Good morning");
        }else if(time <20){
            System.out.println("Good day");
        }else {
            System.out.println("Good afternoon");
        }

        String result =(time <18) ? "Good job" : "Good night";
        System.out.println(result);

        int day = 4;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
