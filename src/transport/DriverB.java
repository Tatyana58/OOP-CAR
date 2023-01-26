package transport;

public class DriverB extends Driver{
    public DriverB(String fcsDriver, boolean licenseDriver, int experienceDriver) {
        super(fcsDriver, licenseDriver, experienceDriver);
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
        System.out.println("Начать движение Категория В ");
    }

    @Override
    public void finishMovement() {
        super.finishMovement();
        System.out.println("Остановиться. Категория В");
    }

    @Override
    public void refuelCar() {
        super.refuelCar();
        System.out.println("Заправить авто. Категория В");
    }

    @Override
    public String toString() {
        return "DriverB{" +
                "fcsDriver='" + fcsDriver + '\'' +
                ", licenseDriver=" + licenseDriver +
                ", experienceDriver=" + experienceDriver +
                '}';
    }
}