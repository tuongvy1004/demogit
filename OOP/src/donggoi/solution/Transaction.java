package donggoi.solution;

public class Transaction {

    private double transactionFee = 0.01;
    public double getMoneyInMonth(int moneyTransfer){
        return moneyTransfer * transactionFee;
    }

}
