package main.java.lab1.Task2.Implement;

import main.java.lab1.Task2.Interface.Area;

public class FullArea implements Area {
    
    private final Area[] areas;

    public FullArea(Area... areas) {
        this.areas = areas;
    }

    @Override
    public boolean Contains(double x, double y) {
        for (Area area : areas) {
            if (area.Contains(x, y)) return true;
        }

        return false;
    }
}