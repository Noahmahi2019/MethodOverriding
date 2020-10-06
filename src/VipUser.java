public class VipUser extends User{
    public VipUser(String firstName, String lastName, double accountBalance, int accountId) {
        super(firstName, lastName, accountBalance, accountId);

    }

    @Override
    public void latePayment(double accountBalance) {
        System.out.println("warning:"  + this.getFirstName()  +" " + "you have an overdue balance that needs to be paid" );
    }

    }

