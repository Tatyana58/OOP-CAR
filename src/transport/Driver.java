package transport;

public class Driver {
    public String fcsDriver; //ФИО водит
    public boolean licenseDriver; // наличие прав
    public int experienceDriver; // стаж

    public Driver(String fcsDriver, boolean licenseDriver, int experienceDriver) {
        setFcsDriver(fcsDriver);
        this.licenseDriver = licenseDriver;
        setExperienceDriver(experienceDriver);
    }

    public String getFcsDriver() {
        return fcsDriver;
    }

    public void setFcsDriver(String fcsDriver) {
        this.fcsDriver = (fcsDriver != null && fcsDriver.isEmpty() != true && fcsDriver.isBlank() != true) ? fcsDriver : "Бренд не указан";
    }

    public boolean isLicenseDriver() {
        return licenseDriver;
    }

    public void setLicenseDriver(boolean licenseDriver) {
        this.licenseDriver = licenseDriver;
    }

    public int getExperienceDriver() {
        return experienceDriver;
    }

    public void setExperienceDriver(int experienceDriver) {
        this.experienceDriver = (experienceDriver <= 0 || experienceDriver >= 70) ? 0 : experienceDriver;
    }

    public void startMoving() {
        System.out.println("Начать движение.");
    }

    public void finishMovement() {
        System.out.println("Остановиться.");
    }
    public void refuelCar() {
        System.out.println("Заправить авто.");
    }


}
