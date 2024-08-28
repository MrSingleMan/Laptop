package Laptop;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LaptopService {
    private Set<Laptop> laptops = new HashSet<>();

    public LaptopService() {

        laptops.add(new Laptop("Acer", 2, 32));
        laptops.add(new Laptop("Lenovo", 16, 512));
        laptops.add(new Laptop("Dell", 8, 256));
        laptops.add(new Laptop("Dell", 16, 2048));
        laptops.add(new Laptop("Apple", 8, 256));
    }


    public Set<Laptop> filterLaptops(Integer minRam, Integer minHdd, String brand) {
        return laptops.stream()
                .filter(laptop -> (minRam == null || laptop.getRam() >= minRam) &&
                        (minHdd == null || laptop.getHdd() >= minHdd) &&
                        (brand == null || laptop.getBrand().equals(brand)))
                .collect(Collectors.toSet());
    }
}
