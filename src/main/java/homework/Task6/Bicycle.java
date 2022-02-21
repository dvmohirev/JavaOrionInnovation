package homework.Task6;

import java.util.Arrays;
import java.util.Objects;

public class Bicycle {
    private String modelName;
    private int maxSpeed;

    public Bicycle() {
        this.modelName = getRandomModel();
        this.maxSpeed = (int) (5 + Math.random()*46);
    }

    public String getRandomModel(){
        String[] models = {"Матрица", "Матрица2", "Матрица3", "Матрица: Перезагрузка", "АниМатрица"};
        modelName = models[(int) (Math.random()*models.length)];
        return modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelName(), getMaxSpeed());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || obj.getClass() != getClass()) { return false; }

        Bicycle bicycle = (Bicycle) obj;

        if (getMaxSpeed() != bicycle.getMaxSpeed()) return false;
        return getModelName().equals(bicycle.getModelName());
    }
}
