package cursor.hw3_OOP;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Ziraat", "11", 4000.00);
        Bank bank2 = new Bank("Teb", "22",4000.00);

        BankClient client1 = new BankClient(1, "Jane Stivenson", 25, "jstivenson@test.com", "5348476394","qwerty1", "address1");
        System.out.println(bank1);
        System.out.println(client1);
        CreditAccount creditAccount1 = new CreditAccount("1111111111", 1111.0, client1, bank1);
        creditAccount1.setAccountLimit(4000.7);
        bank1.addAccount(creditAccount1);
        creditAccount1.withdraw(253.87);
        Bank.getTotalAmountOfClients(client1);
        bank1.getMoneyInfo();
        bank1.deleteAccount(creditAccount1);
        System.out.println("-------------------------------------------------");


        BankClient client2 = new BankClient(2, "Megan Johnson", 18, "mjohnson@test.com", "6378640844","qwerty2", "address2");
        System.out.println(bank2);
        System.out.println(client2);
        CreditAccount creditAccount2 = new CreditAccount("2222222222", -222.0, client2, bank2);
        creditAccount1.setAccountLimit(2000.0);
        bank2.addAccount(creditAccount2);
        creditAccount2.withdraw(500.0);
        Bank.getTotalAmountOfClients(client2);
        bank2.getMoneyInfo();
        bank2.deleteAccount(creditAccount2);
        System.out.println("-------------------------------------------------");




        BankClient client3 = new BankClient(3, "Mark Cooper", 17, "mcooper@test.com", "3782649023","qwerty3", "address3");
        System.out.println(bank1);
        System.out.println(client3);
        CreditAccount creditAccount3 = new CreditAccount("3333333333",333.5,client3,bank1);
        creditAccount3.setAccountLimit(900.0);
        bank1.addAccount(creditAccount3);
        creditAccount3.withdraw(850.0);
        Bank.getTotalAmountOfClients(client3);
        bank1.getMoneyInfo();
        bank1.deleteAccount(creditAccount3);
        System.out.println("-------------------------------------------------");


        BankClient client4 = new BankClient(4, "Susan Tetker", 47, "stetker@test.com", "5530998411","qwerty4", "address4");
        CreditAccount creditAccount4 = new CreditAccount("4444444444",44444.3,client4,bank2);
        BankClient client5 = new BankClient(5, "Kyle Don", 52, "kdon@test.com", "6645295730","qwerty5", "address5");
        DebitAccount debitAccount1 = new DebitAccount();
        BankClient client6 = new BankClient(6, "Sean Peterson", 33, "speterson@test.com", "5127482994","qwerty6", "address6");
        DebitAccount debitAccount2 = new DebitAccount();
    }

}
