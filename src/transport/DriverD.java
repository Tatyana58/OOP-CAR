package transport;

public class DriverD<T extends Bus> extends Driver{


    public DriverD(String fcsDriver, boolean licenseDriver, int experienceDriver) {
        super(fcsDriver, licenseDriver, experienceDriver);
    }
    public String getMassage(T bus){

        return "водитель "+" управляет автобусом "+bus.getBrand()+" "+bus.getModel() + " "+ bus.getEngineCapacity();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String getFcsDriver() {
        return super.getFcsDriver();
    }

    @Override
    public void setFcsDriver(String fcsDriver) {
        super.setFcsDriver(fcsDriver);
    }

    @Override
    public boolean isLicenseDriver() {
        return super.isLicenseDriver();
    }

    @Override
    public void setLicenseDriver(boolean licenseDriver) {
        super.setLicenseDriver(licenseDriver);
    }

    @Override
    public int getExperienceDriver() {
        return super.getExperienceDriver();
    }

    @Override
    public void setExperienceDriver(int experienceDriver) {
        super.setExperienceDriver(experienceDriver);
    }

    @Override
    public void startMoving() {
        super.startMoving();
        System.out.println("Начать движение Категория D ");
    }

    @Override
    public void finishMovement() {
        super.finishMovement();
        System.out.println("Остановиться. Категория D");
    }

    @Override
    public void refuelCar() {
        super.refuelCar();
        System.out.println("Заправить авто. Категория D");
    }

    @Override
    public String toString() {
        //getMassage(T);
        return "DriverB{" +
                "fcsDriver='" + fcsDriver + '\'' +
                ", licenseDriver=" + licenseDriver +
                ", experienceDriver=" + experienceDriver +
                '}';
    }
}
