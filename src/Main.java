public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 95;
        double h = 1.54;
        double bmi = service.calculate(m,h);
        System.out.println("Индекс массы тела: " + bmi);
    }
}