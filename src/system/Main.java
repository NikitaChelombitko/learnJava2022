package system;

/*Nikita Vladimirovich, [15.04.2022 18:34]
создай рядом с первой папкой,пакет App1
там создай класс, который при запуске запрашивает возраст,
и если человек вводит больше 27, то в ответ в консоли должно прийти что-то вроде
 "фу, кусок лоха, скоро подыхать от старости)))00"*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App1 app1 = new App1();
        app1.vozrast();
    }
}