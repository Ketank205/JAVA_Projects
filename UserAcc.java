package Projects;
import java.util.Scanner;
class ATM implements Machine{
    Scanner sc = new Scanner(System.in);
    static double NewBalance, Amount = 2000000;
    double WithDrawn = 0;
    double Deposited = 0;
    @Override
    public void CheckBalance() {
        System.out.println("Current Balance" + Amount);
    }
    @Override
    public void Withdraw() {
        System.out.println("Enter the amount to be withdrawn: ");
        NewBalance = sc.nextDouble();
        if(NewBalance <= Amount) {
            WithDrawn = Amount - NewBalance;
            Amount = WithDrawn;
            System.out.println("Current Balance: " + Amount);
        }
        else {
            System.out.println("!!!!!Insufficient Balance!!!!!");
        }
    }

    @Override
    public void Deposit() {
        System.out.println("Enter the amount to be deposited: ");
        NewBalance = sc.nextDouble();
        Deposited = NewBalance + Amount;
        Amount = Deposited;
        System.out.println("Current Balance: " + Amount);
    }
}
interface Machine{
    public void CheckBalance();
    public void Withdraw();
    public void Deposit();
}
public class UserAcc extends ATM{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ATM A = new ATM();
        String Name = "Ketankumar Panditrao Borse";
        double AccNo = 221101001;
        int p = 1920;
        System.out.println(Name);
        System.out.println(AccNo);
        System.out.println("Enter PIN: ");
        int PIN = scan.nextInt();
        if(PIN == p){
            System.out.println("Choose a Number corresponding to the Function: ");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    A.CheckBalance();
                    break;
                case 2:
                    A.Withdraw();
                    break;
                case 3:
                    A.Deposit();
                    break;
                default:
                    System.out.println("Thank You..!!!");
            }
        }
        else{
            System.out.println("!!!!WARNING: EITHER ENTER CORRECT PIN OR GET LOST !!!!");
        }
    }
}
