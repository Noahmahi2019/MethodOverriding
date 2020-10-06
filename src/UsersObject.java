import java.util.Scanner;

public class UsersObject{

    public static void main(String[] args) {
        guessingGame();

        User firstUser = new User("Patrick", "Bateman", 150.00, 1101);
        VipUser firstVipUser = new VipUser("Jay", "Gatsby", 1000.00, 1102);
        LowIncomeUser LowIncomeUser1 = new LowIncomeUser("Jane", "Eyre", 50.00, 1200);

        firstUser.latePayment(20.00);
        firstVipUser.latePayment(0.00);
        LowIncomeUser1.latePayment(40.00);
    }


      // Bonus Part
    public static void guessingGame() {
        int Numbers = (int) (Math.random() * 11);
        System.out.println(Numbers);
        Scanner s = new Scanner(System.in);
        System.out.print("guess the number ");
        int guessNumber = s.nextInt();
        if (guessNumber > Numbers) {
            System.out.println("Wrong");
            System.out.println("The correct number was " + Numbers);
        }
        if (guessNumber == Numbers) {
            System.out.println("Correct!");
        }
    }
}

