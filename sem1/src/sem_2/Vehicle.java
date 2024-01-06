package sem_2;

public abstract class Vehicle {
    protected String company;
    protected String model;
    protected int yearRelease;
    protected int numWheels;
    protected Double speed;

    public abstract void testDrive();
    public abstract void park();
}
