package Day6;

class BankAccount {

    double balance = 5000;

    void withdraw(double amount)
            throws Exception {

        if (amount > balance) {

            throw new Exception(
                    "Insufficient Balance"
            );
        }

        balance = balance - amount;

        System.out.println(
                "Withdrawal Successful"
        );

        System.out.println(
                "Remaining Balance: " + balance
        );
    }
}

public class ThrowExample {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        try {

            b.withdraw(7000);
        }

        catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}

