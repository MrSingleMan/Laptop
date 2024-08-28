package Laptop;

import java.util.Scanner;
import java.util.Set;


public class ConsoleUI {

    private LaptopService service = new LaptopService();
    private Scanner scanner = new Scanner(System.in);


    public void run() {
        while (true) {

            Integer minRam = null;
            Integer minHdd = null;
            String brand = null;

            System.out.println("> Введите параметр поиска:");
            System.out.println("1 - Брэнд");
            System.out.println("2 - ОЗУ");
            System.out.println("3 - Объём жесткого диска ");
            System.out.println("Введите 'n' для выхода.");

            String param = scanner.nextLine();

            if (param.equals("n")) System.exit(0);

            if (param.equals("1")) {
                System.out.println("Введите Брэнд (Acer, Dell, Lenovo, Apple):");
                brand = scanner.nextLine();
            }

            if (param.equals("2")) {
                System.out.println("Введите минимальное количество ОЗУ (в ГБ):");
                minRam = Integer.parseInt(scanner.nextLine());
            }

            if (param.equals("3")) {
                System.out.println("Введите минимальный объем ЖД (в ГБ):");
                minHdd = Integer.parseInt(scanner.nextLine());
            }

            Set<Laptop> filteredLaptops = service.filterLaptops(minRam, minHdd, brand);

            System.out.println("Найденные ноутбуки:");
            for (Laptop laptop : filteredLaptops) {
                System.out.println(laptop);
            }

            System.out.println("Искать ещё? (y/n)");
            String more = scanner.nextLine();
            if (more.equals("n")) {
                break;
            }
        }
    }
}
