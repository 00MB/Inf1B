package zoo;
import java.util.HashMap;
import animals.Animal;
import areas.*;
import dataStructures.ICashCount;

import java.util.ArrayList;

public class Zoo implements IZoo {
    HashMap<Integer, IArea> areas = new HashMap<Integer, IArea>();
    int uniqueId = 1;

    public Zoo() {
        areas.put(0, new Entrance());
    }

    public int getUniqueId() {
        return uniqueId++;
    }

    @Override
    public int addArea(IArea area) {
        int id = getUniqueId();
        areas.put(id, area);
        return id;
    }

    @Override
    public void removeArea(int areaId) {
        areas.remove(areaId);
    }

    @Override
    public IArea getArea(int areaId) {
        return areas.get(areaId);
    }

    @Override
    public byte addAnimal(int areaId, Animal animal) {
        Area area = (Area) getArea(areaId);
        if (!area.isHabitatArea) {
            return 1;
        } else if (!area.isHabitat(animal)) {
            return 2;
        } else if (area.currentAnimals.size() > area.capacity) {
            return 3;
        } else if (!area.isCompatible(animal)) {
            return 4;
        } else {
            area.currentAnimals.add(animal);
            return 0;
        }
    }

    @Override
    public void connectAreas(int fromAreaId, int toAreaId) {

    }

    @Override
    public boolean isPathAllowed(ArrayList<Integer> areaIds) {
        return false;
    }

    @Override
    public ArrayList<String> visit(ArrayList<Integer> areaIdsVisited) {
        return null;
    }

    @Override
    public ArrayList<Integer> findUnreachableAreas() {
        return null;
    }

    @Override
    public void setEntranceFee(int pounds, int pence) {

    }

    @Override
    public void setCashSupply(ICashCount coins) {

    }

    @Override
    public ICashCount getCashSupply() {
        return null;
    }

    @Override
    public ICashCount payEntranceFee(ICashCount cashInserted) {
        return null;
    }
}
