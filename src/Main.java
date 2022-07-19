public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println();
        System.out.println("Индекс массы тела: " + String.format("%.2f", (service.calculate(95, 154))));
    }
}