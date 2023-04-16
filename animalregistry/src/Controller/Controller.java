package Controller;

import Animals.Animal;
import Animals.Cat;
import Service.AnimalService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    AnimalService animalService = new AnimalService();

    public void addAnimal(Animal animal){
        animalService.addAnimals(animal);
    }

    public int getID(){
        int id = animalService.getSize()+1;
        return id;
    }

    public void showAnimals(){
        animalService.showAnimals();
    }

    public void detailAnimal(int id){
        Animal animal = animalService.getAnimal(id);
        System.out.println("name = "+animal.getName()+" ,birthday = "+animal.getBirthday()+" ,список команд:"+animal.getCommands());

    }

    public int getSize(){
        return animalService.getSize();
    }

    public void training(int animalID, String trainingComand){
        Animal animal = animalService.getAnimal(animalID);
        List<String>list = animal.getCommands();
        list.add(trainingComand);
        animal.setCommands(list);
    }






}
