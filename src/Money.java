
/**
 * Класс деньги, содержит значение и валюту
 */
public class Money {
    public Money(double value, Currency.currency moneyCurrency) {
        this.value = value;
        this.moneyCurrency = moneyCurrency;
    }

    public double value;
    public Currency.currency moneyCurrency;

    @Override
    public String toString() {
        return "Money{" +
                "" + value +
                " " + moneyCurrency +
                '}';
    }
}
