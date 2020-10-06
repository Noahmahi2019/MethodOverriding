public class User {
    private String firstName;
    private String lastName;
    private double accountBalance;
    private  int accountId;

    public User(String firstName, String lastName, double accountBalance, int accountId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
        this.accountId = accountId;
    }
        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void latePayment(double accountBalance) {
        accountBalance -= accountBalance;
        System.out.println(this.firstName  +" " + "has been charged a late payment fee of &20");
        System.out.println("his new account Balance is " + accountBalance);
    }
    }




