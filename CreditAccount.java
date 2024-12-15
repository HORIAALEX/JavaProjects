public class CreditAccount extends Account{
    private final int maxCredit;
    
    public CreditAccount(String IBAN, int amount, int maxCredit)
    {
        super(IBAN, amount);
        this.maxCredit = maxCredit;
    }
    @Override
    public boolean withdraw(int amount)
    {
        if(getAmount() + maxCredit >= amount){
            deposit(-amount);
            return true;
        }
        return false;
    }
}
