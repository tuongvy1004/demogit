package donggoi.problem;

public class TransactionsHistory {

    public static void saveTransaction(){
        int moneyTransfer = 1000000;
        Transactions transactions = new Transactions();
        transactions.transactionFee = 0.03;
        double money = transactions.getMoneyInMonth(moneyTransfer);
        System.out.println(money);
    }

    public static void main(String[] args) {
        saveTransaction();

    }
}
