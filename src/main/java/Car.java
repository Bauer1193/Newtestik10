public abstract class Car {
    int year;
    String color;
    String model;
    String drivetrain;
    String transmission;
    String engine;

    public Car(int year, String color, String model, String drivetrain, String transmission, String engine) {
        this.year = year;
        this.color = color;
        this.model = model;
        this.drivetrain = drivetrain;
        this.transmission = transmission;
        this.engine = engine;
    }
    public void changeColor(String newColor) {
        this.color = newColor;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
    public String getDrivetrain() {
        return drivetrain;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getEngine() {
        return engine;
    }
    @Override
    public String toString() {
        return String.format("%s %s, Год: %d, Цвет: %s, Коробка: %s, Привод: %s, Двигатель: %s",
                this.getClass().getSimpleName(), model, year, color, transmission, transmission, engine);
    }
}