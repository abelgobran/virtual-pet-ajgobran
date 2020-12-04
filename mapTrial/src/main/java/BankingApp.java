import java.nio.file.LinkPermission;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Bank ballerBank = new Bank();
        Account account1 = new Account("123456", "Checking", 1000);
        Account account2 = new Account("98765", "Savings", 19000);
        ballerBank.addAccount(account1);
        ballerBank.addAccount(account2);
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Which account would you like to access?");
            String choice = input.nextLine();
            Account currentAccount = ballerBank.getAccount(choice);
            if (currentAccount!= null) {
                System.out.println("Select an option: \n 1 -withdraw \n 2-deposit \n 3 -retrieve balance" +
                        "\n 4 -exit");
                choice = input.nextLine();
                if (choice.equals("1")){
                    System.out.println("Deposit Amount?");
                    double amount = input.nextInt();
                    currentAccount.withdraw(amount);

                }else if (choice.equals("2"){
                    System.out.println();
                }
            }

            }else {
                System.out.println("Incorrect account number!");
        }while
    }
}
