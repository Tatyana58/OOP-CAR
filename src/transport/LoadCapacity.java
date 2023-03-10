package transport;


public enum LoadCapacity {
    N1(1.0,3.5), //(с полной массой до 3,5 тонн);
    N2(3.6,12), //(с полной массой свыше 3,5 до 12 тонн);
    N3(12,500); //(с полной массой свыше 12 тонн).

    private double min;
    private double max;

    LoadCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }
    public static LoadCapacity getValue(double value) { //Грузоподъемность
        for (LoadCapacity e : LoadCapacity.values()) {
            if (value >= e.getMin() && value <= e.getMax()) {
                //System.out.println("значение = " + e);
                return e;
            }
        }
        return null;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    @Override
    public String toString() {
        if (LoadCapacity.getValue(10) ==null) {
            return "Грузоподъемность до " + getMax();
        } else {
            return "Грузоподъемность от " + getMin() + " до " + getMax();
        }
    }
}
