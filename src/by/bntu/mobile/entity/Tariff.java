package by.bntu.mobile.entity;

public abstract class Tariff {
    String name;
    double price;
    int minutes;
    int traffic;

    public Tariff(String name, double price, int minutes, int traffic) {
        this.name = name;
        this.price = price;
        this.minutes = minutes;
        this.traffic = traffic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tariff that = (Tariff) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (minutes != that.minutes) return false;
        if (traffic != that.traffic) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + minutes;
        result = 31 * result + traffic;
        return result;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", minutes=" + minutes +
                ", traffic=" + traffic +
                '}';
    }
}
