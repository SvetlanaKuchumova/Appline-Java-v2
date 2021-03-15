import presents.Candy;
import presents.Chocolate;
import presents.Jellybean;
import presents.Present;

public class Presents4 {
    public static void main(String[] args) {

        //Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
        // У каждой сладости есть название, вес, цена и свой уникальный параметр.
        // Необходимо собрать подарок из сладостей.
        // Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.

        Candy cow = new Candy("Коровка", 0.150, 300, "Молочная");
        Candy mars = new Candy("Марсианка", 0.50, 250, "Кокосовая");
        Jellybean bear = new Jellybean("Мишки", 0.50, 120, "Красный");
        Chocolate italian = new Chocolate("Итальянский", 0.09, 560, "Молочный");
        Chocolate russian = new Chocolate("Российский", 0.1, 600, "Черный");

        double totalPrice = 0;
        totalPrice = cow.getWeigth() * cow.getPrice() + mars.getWeigth() * mars.getPrice() + bear.getWeigth() * bear.getPrice() +
                italian.getWeigth() * italian.getPrice() + russian.getWeigth() * russian.getPrice();

        double totalWeigth = 0;
        totalWeigth = cow.getWeigth() + mars.getWeigth() + bear.getWeigth() + italian.getWeigth() + russian.getWeigth();

        System.out.println("Состав подарка:");
        Present [] boxPresent = {cow, mars, bear, italian, russian};
        for (Present box : boxPresent) {
            System.out.println(box.toString());
        }

        System.out.println("Общий вес: " + totalWeigth + " кг");
        System.out.println("Общая стоимость: " + totalPrice + " рублей");
    }
}
