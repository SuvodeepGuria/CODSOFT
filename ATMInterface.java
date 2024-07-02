import java.util.*;

public class ATMInterface {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        AllPerformance allPerformance=new AllPerformance();
        System.out.println("Welcome !!");
        while (true){
            System.out.println("1. Press '1' to check your Balance.\n2. Press '2' to Withdraw.\n3. Press '3' to Deposit.\n4. Press any kay to 'EXIT'.");
            int choice=input.nextInt();
            switch (choice){
                case 1 :
                    allPerformance.CheckBalance();
                    break;
                case 2:
                    System.out.println("Enter your amount: ");
                    float withdrawAmount=input.nextFloat();
                    allPerformance.Withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Enter your amount: ");
                    float depositAmount=input.nextFloat();
                    allPerformance.Deposit(depositAmount);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}

class AllPerformance{
    float Balance= 1011.65F;
    Scanner in=new Scanner(System.in);
    void CheckBalance(){
        System.out.println("Your Balance is: " + String.format("%.2f", Balance));
    }
    void Withdraw(float Amount){
        if(Amount>Balance){
            System.out.println("Not Enough Money to Withdraw.");
        }else {
            Balance -= Amount;
            System.out.println("Withdraw Successfully !! \nDo you want to check your Balance? y/n");
            String decision = in.next();
            if (Objects.equals(decision, "y") || Objects.equals(decision, "Y")) {
                System.out.println("Your Balance is: " + String.format("%.2f", Balance));
            }
        }
    }
    void Deposit(float Amount){
        Balance += Amount;
        System.out.println("Deposit Successfully !! \nDo you want to check your Balance? y/n");
        String decision=in.next();
        if(Objects.equals(decision, "y") || Objects.equals(decision, "Y")){
            System.out.println("Your Balance is: " + String.format("%.2f", Balance));
        }
    }
}
