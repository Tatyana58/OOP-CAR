package transport;

public class DriverC<T extends TracksCar> extends Driver{
    public DriverC(String fcsDriver, boolean licenseDriver, int experienceDriver) {
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
        System.out.println("Водитель Категория С  "+ getFcsDriver()+" начал движение.");
    }

    @Override
    public void finishMovement() {
        System.out.println("Водитель Категория С "+ getFcsDriver()+" Остановился. ");
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель Категория С "+ getFcsDriver()+" заправил авто.");
    }
}

