package View;

import Animals.*;
import Controller.Controller;
import Service.Counter;


import java.util.Scanner;

public class View {
    Controller controller = new Controller();

    public void run() {
        try (Counter counter = new Counter()){
            boolean menu = true;
            while (menu) {
                String command;
                try {
                    command = prompt("\n1 - Завести новое животное\n2 - Посмотреть список животных\n0 - Выход\n");

                    // com = Commands.valueOf(command.toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Unknown command");
                    continue;
                }
                // if (com == Commands.EXIT) return;
                switch (command) {
                    case "1":
                        String newAnimal = prompt("Какое животное добавить:\n1 - Кошка\n2 - Собака\n3 - Хомяк\n4 - Лошадь\n5 - Верблюд\n6 - Осел\n0 - Возврат в основное меню\n");
                        String name = prompt("Введите имя: ");
                        String birthday = prompt("Введите день рождения в формате ДД.ММ.ГГГГ: ");
                        int id = controller.getID();
                        switch (newAnimal){
                            case "1":
                                controller.addAnimal(new Cat(id,name,birthday));
                                counter.add();
                                System.out.println("Животное добавлено");
                                break;
                            case "2":
                                controller.addAnimal(new Dog(id,name,birthday));
                                counter.add();
                                System.out.println("Животное добавлено");
                                break;
                            case "3":
                                controller.addAnimal(new Hamster(id,name,birthday));
                                counter.add();
                                System.out.println("Животное добавлено");
                                break;
                            case "4":
                                controller.addAnimal(new Horse(id,name,birthday));
                                counter.add();
                                System.out.println("Животное добавлено");
                                break;
                            case "5":
                                controller.addAnimal(new Camel(id,name,birthday));
                                counter.add();
                                System.out.println("Животное добавлено");
                                break;
                            case "6":
                                controller.addAnimal(new Donkey(id,name,birthday));
                                counter.add();
                                System.out.println("Животное добавлено");
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("Такого варианта нет, введите число, которое соответствует пункту в меню");
                        }
                        break;
                    case "2":
                        try {
                            if(controller.getSize()==0){
                                System.out.println("Список пуст");
                            }else {
                                controller.showAnimals();
                                String animalId = prompt("Если вы хотите просмотреть данные о животном, введите его id, для выхода в меню введите 0\n" );
                                controller.detailAnimal(Integer.parseInt(animalId));
                                boolean bool = true;
                                while (bool){
                                    String answer = prompt("Хотите добавить команду для животного: \n1 - да\n2 - нет\n");
                                    switch (answer){
                                        case "1":
                                            String trainComand = prompt("Введите команду для добавления: ");
                                            controller.training(Integer.parseInt(animalId), trainComand);
                                            break;
                                        case "2":
                                            bool=false;
                                        default:
                                            System.out.println("Такого варианта нет, введите число, которое соответствует пункту в меню");
                                    }
                                }
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;
                    case "0":
                        menu = false;
                        break;
                    default:
                        System.out.println("Такого варианта нет, введите число, которое соответствует пункту в меню");
                        break;
                }
            }
        }

    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }


}
