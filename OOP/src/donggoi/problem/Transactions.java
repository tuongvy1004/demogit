package donggoi.problem;

public class Transactions {
    public double transactionFee = 0.01;

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public double getMoneyInMonth (int moneyTransfer){

        return moneyTransfer * transactionFee;
    }
}
