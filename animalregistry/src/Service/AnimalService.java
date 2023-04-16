package Service;

import Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    List<Animal>animals = new ArrayList<>();

    public void addAnimals(Animal animal){
        animals.add(animal);
    }

    public void delAnimals(Animal animal){
        animals.remove(animal);
    }

    public void showAnimals(){
        for (Animal item:animals) {
            System.out.println(item);
        }
    }

    public int getSize(){return animals.size();}

    public Animal getAnimal(int id){
        return animals.get(id-1);
    }



}
