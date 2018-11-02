import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //составляем список продуктов
        List<Product> productList = new ArrayList<>();

        Money newZeland = new Money(400000, Currency.currency.USD);
        productList.add(new Product("Велингтон", newZeland));

        Money amsterdam = new Money(895000, Currency.currency.EUR);
        productList.add(new Product("Амстердам", amsterdam));

        Money novosibirsk = new Money(4000000, Currency.currency.RUB);
        productList.add(new Product("Новосибирск", novosibirsk));

        //создаем конвертер валют с курсом на текущий день
        String date = "2018-10-17";

        CurrencyUtil c = new CurrencyUtil("C:\\Users\\Екатерина\\IdeaProjects\\Main\\src\\");


        //выводим на экран сумму всех товаров в рублях, по текущему курсу
        try {
            System.out.println("Цена всех товаров в рублях: " + String.format("%.2f", c.calculateCosts(productList, Currency.currency.USD, date)));
        } catch (IOException e) {
            System.out.println("Сегодня не день Бэкхэма");
            e.printStackTrace();
        }

        System.out.println("Happy");
        System.out.println("end!");
    }
}