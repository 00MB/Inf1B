package zoo;
import java.util.HashMap;
import animals.Animal;
import areas.*;
import dataStructures.ICashCount;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements IZoo {
    HashMap<Integer, Area> areas = new HashMap<Integer, Area>();
    int uniqueId = 0;

    public Zoo() {
        areas.put(0, new Area(new Entrance(), new ArrayList<Animal>()));
    }

    public int getUniqueId() {
        return uniqueId++;
    }

    @Override
    public int addArea(IArea area) {
        int id = getUniqueId();
        ArrayList list = new ArrayList<Integer id, ArrayList<Animal>>();
        areas.put();
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
        if () {

        } else {

            return 0;
        }
        return 0;
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
