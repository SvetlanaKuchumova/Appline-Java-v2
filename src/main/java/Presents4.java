import presents.Candy;
import presents.Chocolate;
import presents.Jellybean;
import presents.Present;

import java.util.Scanner;

public class Presents4 {
    public static void main(String[] args) {

        //Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
        // У каждой сладости есть название, вес, цена и свой уникальный параметр.
        // Необходимо собрать подарок из сладостей.
        // Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вес конфет Коровка");
        double kg = scan.nextDouble();
        Candy cow = new Candy();
        cow.setWeigth(kg);
        cow.setName("Коровка");
        cow.setFilling("Молочная");
        cow.setPrice(300);

        System.out.println("Введите вес конфет Марсианка");
        kg = scan.nextDouble();
        Candy mars = new Candy();
        mars.setWeigth(kg);
        mars.setName("Марсианка");
        mars.setFilling("Молочная");
        mars.setPrice(250);

        System.out.println("Введите вес желейных мишек");
        kg = scan.nextDouble();
        Jellybean bear = new Jellybean();
        bear.setWeigth(kg);
        bear.setName("Мишки");
        bear.setColor("Красный");
        bear.setPrice(300);

        System.out.println("Введите вес Итальянского шоколада");
        kg = scan.nextDouble();
        Chocolate italian = new Chocolate();
        italian.setWeigth(kg);
        italian.setName("Итальянский");
        italian.setPercentageCocoa("Молочный");
        italian.setPrice(560);

        System.out.println("Введите вес Российского шоколада");
        kg = scan.nextDouble();
        Chocolate russian = new Chocolate();
        russian.setWeigth(kg);
        russian.setName("Российский");
        russian.setPercentageCocoa("Черный");
        russian.setPrice(600);

//        Candy cow = new Candy("Коровка", 0.150, 300, "Молочная");
//        Candy mars = new Candy("Марсианка", 0.50, 250, "Кокосовая");
//        Jellybean bear = new Jellybean("Мишки", 0.50, 120, "Красный");
//        Chocolate italian = new Chocolate("Итальянский", 0.09, 560, "Молочный");
//        Chocolate russian = new Chocolate("Российский", 0.1, 600, "Черный");

        scan.close();

        double totalPrice = cow.getWeigth() * cow.getPrice() + mars.getWeigth() * mars.getPrice() + bear.getWeigth() * bear.getPrice() +
                italian.getWeigth() * italian.getPrice() + russian.getWeigth() * russian.getPrice();

        double totalWeigth = cow.getWeigth() + mars.getWeigth() + bear.getWeigth() + italian.getWeigth() + russian.getWeigth();

        System.out.println("Состав подарка:");
        Present [] boxPresent = {cow, mars, bear, italian, russian};
        for (Present box : boxPresent) {
            System.out.println(box.toString());
        }

        System.out.println("Общий вес: " + totalWeigth + " кг");
        System.out.println("Общая стоимость: " + totalPrice + " рублей");
    }
}
