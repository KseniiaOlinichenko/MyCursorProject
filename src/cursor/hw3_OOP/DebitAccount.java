package cursor.hw3_OOP;

public class DebitAccount extends Account {
    protected DebitAccount(){
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        System.out.println("You will get money without any commission: " + amount);
    }


}
