class Bank{
    double getinterestRate(){
        return 0;
    }
}

class SBI extends Bank{
    @Override
    double getinterestRate(){
        return 6.5;
    }
}
class HDFC extends Bank{
    @Override
    double getinterestRate(){
        return 7.5;
    }
}

class ICICI extends Bank{
    @Override
    double getinterestRate(){
        return 7.0;
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Bank[] banks = new Bank[3];

        banks[0] = new SBI();
        banks[1] = new HDFC();
        banks[2] = new ICICI();

        for(Bank b : banks){
            System.out.println(
                b.getClass().getSimpleName() +
                " Interest Rate: " +
                b.getinterestRate() + "%"
            );
        }
    }
    
}
