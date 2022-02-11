package donggoi.solution;

public class TransactionHistory {

    public static void saveTransaction(){

        int moneyTransfer = 1000000;
        Transaction transaction = new Transaction();
        //transactions.transactionFee = 0.03;
        double money = transaction.getMoneyInMonth(moneyTransfer);
        System.out.println(money);
    }

    public static void main(String[] args) {
        saveTransaction();
    }
}
