package transport;

import java.util.Objects;

public class Mechanic {
    private String nameMechanic;
    private final String companyWork;

    public Mechanic(String nameMechanic, String companyWork) {
        this.nameMechanic = (nameMechanic!=null && nameMechanic.isEmpty() !=true && nameMechanic.isBlank()!=true)? nameMechanic: "Имя и Фамилия механика не указаны";
        this.companyWork = (companyWork!=null && companyWork.isEmpty()!=true && companyWork.isBlank()!=true)? companyWork: "Компания не указана";
    }

    public String getNameMechanic() {
        return nameMechanic;
    }

    public void setNameMechanic(String nameMechanic) {
        this.nameMechanic = nameMechanic;
    }

    public String getCompanyWork() {
        return companyWork;
    }

    public <T extends Transport> void performMaintenance(T t) {//провести техобслуживание
        System.out.println(t.toString() + "обслуживается механиком" + this);
    }

    public <T extends Transport> void fixCar(T t) { // починить машину
        System.out.println(t.repair() + "ответственный механик" + this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return nameMechanic.equals(mechanic.nameMechanic) && companyWork.equals(mechanic.companyWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameMechanic, companyWork);
    }

    @Override
    public String toString() {
        return "Механик: " + nameMechanic +
                ", компания: " + companyWork;
    }
}


