package system;

//Поддерживается как самозакрытие после выполнения, так и проверка на то, цифры ли ты ввёл

import java.util.Scanner;

public class App1 {

    boolean value = false;

    public void vozrast() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько вам лет?");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number >= 27) {
                System.out.println("ШТОШ, ВЫ СТАРЫЙ ПЕЛЬМЕНДОС " + number + "го лвла((");
            } else {
                System.out.println("ЯСНА)) ИДИ АЦУДА, ЗУМЕРОК))");
            }
        } else {
            System.out.println("как в казино карты могут быть по другому р-разложены,ты че дурак блядь?");
        }
    }
}
