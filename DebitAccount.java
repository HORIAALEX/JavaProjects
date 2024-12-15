public class DebitAccount extends Account{
    public DebitAccount(String IBAN, int amount)
    {
        super(IBAN, amount);
    }
    @Override
    public boolean withdraw(int amount)
    {
        if(getAmount()>=amount)
        {
            deposit(-amount);
            return true;
        }
        return false;
    }
}
