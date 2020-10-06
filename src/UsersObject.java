public class UsersObject{

    public static void main(String[] args) {

        User firstUser =new User("Patrick","Bateman",150.00,1101);
        VipUser firstVipUser =new VipUser("Jay","Gatsby",1000.00,1102);
         LowIncomeUser LowIncomeUser1=new LowIncomeUser("Jane","Eyre",50.00,1200);

       firstUser.latePayment(20.00);
        firstVipUser.latePayment(0.00);
        LowIncomeUser1.latePayment(40.00);

    }
}



