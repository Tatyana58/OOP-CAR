package transport;

public enum CapacityBus {
    XS(1,10),
    S(11,25),
    M(26,50),
    L(51,80),
    XL(81,120);
    private int min;
    private int max;

    CapacityBus(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static CapacityBus getValue(int value) {
        for (CapacityBus s : CapacityBus.values()) {
            if (value >= s.getMin() && value <= s.getMax()) {
               // System.out.println("е = " + s);
                return s;
            }
        }return null;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        if (CapacityBus.getValue(10)==null){
            return "Вместимость до " + getMax();
        }
        return "Вместимость от " + getMin() +
                ", до " + getMax();
    }
}
