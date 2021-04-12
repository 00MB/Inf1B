package areas;
import animals.Animal;

import java.util.ArrayList;

public abstract class Area implements IArea {
    public Boolean isHabitatArea;
    public String[] animalsAllowed;
    public ArrayList<Animal> currentAnimals = new ArrayList<Animal>();
    public Integer capacity = 3;

    public Area(Boolean isHabitatArea, String[] animalsAllowed) {
        this.isHabitatArea = isHabitatArea;
        this.animalsAllowed = animalsAllowed;
    }

    public boolean isHabitat(Animal animal) {
        for (String habitatAnimal : animalsAllowed) {
            if (animal.getClass().getSimpleName().equals(habitatAnimal)) {
                return true;
            }
        }
        return false;
    }

    public boolean isCompatible(Animal animal) {
        for (Animal currentAnimal : currentAnimals) { // for current animals
            if (!animal.isCompatibleWith(currentAnimal)) {
                return false;// if animal is in animal.crossover animals
            }
        }
        return true;
    }

    @Override
    public ArrayList<Integer> getAdjacentAreas() {
        return null;
    }
}
