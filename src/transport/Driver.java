package transport;

import java.util.Objects;

public abstract class Driver {
    public String fcsDriver; //ФИО водит
    public boolean licenseDriver; // наличие прав
    public int experienceDriver; // стаж

    public Driver(String fcsDriver, boolean licenseDriver, int experienceDriver) {
        setFcsDriver(fcsDriver);
        this.licenseDriver = licenseDriver;
        setExperienceDriver(experienceDriver);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return licenseDriver == driver.licenseDriver && experienceDriver == driver.experienceDriver && fcsDriver.equals(driver.fcsDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fcsDriver, licenseDriver, experienceDriver);
    }

    @Override
    public String toString() {
        return "водитель : " + fcsDriver ;
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

    public  int getExperienceDriver() {
        return experienceDriver;
    }

    public void setExperienceDriver(int experienceDriver) {
        this.experienceDriver = (experienceDriver <= 0 || experienceDriver >= 70) ? 0 : experienceDriver;
    }

    public abstract void startMoving();
    public abstract void finishMovement();
    public abstract void refuelCar();

}
