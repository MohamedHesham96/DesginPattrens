package structural_design_pattrens.composite;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Animal {
    List<Animal> animalList = new ArrayList<>();

    public Zoo() {
    }

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public void eat(String food) {
        for (Animal animal : animalList) {
            animal.eat(food);
        }
    }

    @Override
    public void stopEat() {
        for (Animal animal : animalList) {
            animal.stopEat();
        }
    }

    public void add(Animal animal) {
        animalList.add(animal);
    }

    public void remove(Animal animal) {
        animalList.remove(animal);
    }

    public void clear() {
        animalList.clear();
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
