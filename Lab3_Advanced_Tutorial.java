import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Client
{
    private final String name;
    private final LocalDate bday;
    private String CNP;
    private final Address address;
    private final List<Account> accounts;

    public Client(String name, LocalDate bday, String CNP, Address address)
    {
        this.name = name;
        this.bday = bday;
        this.CNP = CNP;
        this.address = address;
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account)
    {
        accounts.add(account);
    }
    public boolean removeAccount(String IBAN)
    {
        return accounts.removeIf(account -> account.getIBAN().equals(IBAN));
    }
    @Override
    public String toString(){
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}

class Account
{
    private final String IBAN;
    private int amount;
    public Account(String IBAN, int amount)
    {
        this.IBAN = IBAN;
        this.amount = amount;
    }
    public String getIBAN()
    {
        return IBAN;
    }
    public int getAmount()
    {
        return amount;
    }
    public void deposit(int amount)
    {
        if(amount < 0)
        {
            throw new IllegalArgumentException("Deposit amount must be a positive number");
        }
        this.amount += amount;
    }

    public boolean withdraw(int amount) {
        return false;
    }

}

class Address
{
    private final String city;
    private final int number;
    private final String street;

    public Address(String city, int number, String street)
    {
        this.city = city;
        this.number = number;
        this.street = street;
    }
    public String getCity()
    {
        return city;
    }
    public int getNumber()
    {
        return number;
    }
    public String getStreet()
    {
        return street;
    }
    @Override
    public String toString()
    {
        return "Address{" + "city=" + city + ", number=" + number + ", street=" + street + '}';
    }
}

public class Lab3_Advanced_Tutorial {
    public static void main(String[] args) {
        Address address = new Address("London", 10, "San Francisco");
        Client client = new Client("John Doe", LocalDate.of(1990, 1, 1), "1234567890123", address);


        DebitAccount debitAccount = new DebitAccount("DEBIT123", 5000);
        CreditAccount creditAccount = new CreditAccount("CREDIT123", 10000, 50000);


        client.addAccount(debitAccount);
        client.addAccount(creditAccount);


        System.out.println("Client details:");
        System.out.println(client);


        System.out.println("\nTesting Accounts:");

        System.out.println("Depositing $200 into Debit Account.");
        debitAccount.deposit(200);
        System.out.println("Debit Account Balance: $" + debitAccount.getAmount());

        System.out.println("Withdrawing $300 from Debit Account.");
        boolean successDebitWithdraw = debitAccount.withdraw(300);
        System.out.println("Withdrawal successful: " + successDebitWithdraw);
        System.out.println("Debit Account Balance: $" + debitAccount.getAmount());

        System.out.println("\nWithdrawing $1200 from Credit Account.");
        boolean successCreditWithdraw = creditAccount.withdraw(1200);
        System.out.println("Withdrawal successful: " + successCreditWithdraw);
        System.out.println("Credit Account Balance: $" + creditAccount.getAmount());

        System.out.println("\nTrying to withdraw $1600 from Credit Account (exceeds max credit).");
        boolean failCreditWithdraw = creditAccount.withdraw(1600);
        System.out.println("Withdrawal successful: " + failCreditWithdraw);
        System.out.println("Credit Account Balance: $" + creditAccount.getAmount());


        System.out.println("\nRemoving Debit Account:");
        boolean removed = client.removeAccount("DEBIT123");
        System.out.println("Account removed: " + removed);
        System.out.println("Client details after removal:");
        System.out.println(client);
    }
}
