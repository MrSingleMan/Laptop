package Laptop;

import java.util.Objects;

public class Laptop {
    private String brand;
    private int ram; // ОЗУ в ГБ
    private int hdd; // Объём ЖД в ГБ

    public Laptop(String brand, int ram, int hdd) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

}
