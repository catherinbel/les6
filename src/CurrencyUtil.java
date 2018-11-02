import java.io.IOException;
import java.util.List;

public class CurrencyUtil {
    private String pathToCurrency;

    public CurrencyUtil(String pathToCurrency) {
        this.pathToCurrency = pathToCurrency;
    }

    public double calculateCosts(List<Product> productList, Currency.currency costsCurrency, String date) throws IOException {
        ReadCurrency readCurrency = new ReadCurrency(pathToCurrency + date + ".txt");
        readCurrency.readCurrency();
        CurrencyConverter currencyConverter = new CurrencyConverter(readCurrency.getDollar(), readCurrency.getRub(), readCurrency.getEuro());


        double summ = 0;
        for (Product i : productList) {

            summ += currencyConverter.convertByCurrencty(i.price, costsCurrency).value;

        }
        return summ;
    }
}
