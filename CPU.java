import java.util.Scanner;

class CPU {

    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        int noOfCores;
        String manufacturer;

        Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor Cores: " + noOfCores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM Memory: " + memory + "GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CPU Price: ");
        double price = sc.nextDouble();

        CPU cpu = new CPU(price);

        System.out.print("Enter Number of Cores: ");
        int cores = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Processor Manufacturer: ");
        String pMan = sc.nextLine();

        CPU.Processor processor = cpu.new Processor(cores, pMan);

        System.out.print("Enter RAM Memory (GB): ");
        int memory = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter RAM Manufacturer: ");
        String rMan = sc.nextLine();

        CPU.RAM ram = new CPU.RAM(memory, rMan);

        System.out.println("\nCPU Price: " + cpu.price);
        processor.display();
        ram.display();

        sc.close();
    }
}
