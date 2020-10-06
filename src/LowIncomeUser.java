public class LowIncomeUser extends User {
    public LowIncomeUser(String firstName, String lastName, double accountBalance, int accountId) {
        super(firstName, lastName, accountBalance, accountId);
    }

    @Override
    public void latePayment(double accountBalance) {
        accountBalance -=accountBalance;
        System.out.println(this.getFirstName() + " " + "has been charged a late payment fee of &40");
        System.out.println("his new account Balance is " + accountBalance);
    }
}