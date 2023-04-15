package View;

import Controller.Controller;

import java.io.IOException;
import java.util.Scanner;

public class View {
    Controller controller = new Controller();

    public void run() throws IOException {
       // Commands com = Commands.NONE;

        while (true) {
            String command;
            try {
                command = prompt("\n1 - Завести новое животное\n2 - Посмотреть список животных\n3 - Изменить данные о животном\n4 - Что умеет животное\n5 - Дрессировка\n6 - Удалить запись\n0 - Выход\n");
                ;
                // com = Commands.valueOf(command.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Unknown command");
                continue;
            }
            // if (com == Commands.EXIT) return;
            switch (command) {
                case "1":
                    String nameToy = prompt("Введите название игрушки: ");
                    try {
                        int quantity = Integer.parseInt(prompt("Введите количество: "));
                        if (quantity < 1) {
                            throw new IOException("количество:неверное значение");
                        }
                        int dropFrequency = Integer.parseInt(prompt("Введите частоту выпадения в розыгрыше: "));
                        if (dropFrequency < 1 | dropFrequency > 100) {
                            throw new IOException("частота:неверное значение(1-100)");
                        }
                        //controller.addToy(nameToy, quantity, dropFrequency);

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case "2":
                    try {
                        //controller.viewAllToys();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case "3":
                    try {
                        int id = Integer.parseInt(prompt("Введите id игрушки, которую хотите изменить: "));
                        int dropFrequency = Integer.parseInt(prompt("Введите частоту выпадения в розыгрыше(1-100): "));
                        if (dropFrequency < 1 | dropFrequency > 100) {
                            throw new IOException("частота:неверное значение(1-100)");
                        }
                        //controller.change(id, dropFrequency);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case "4":
                    try {
                       // controller.rafflePrizes();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
            }
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }


}
