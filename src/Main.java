public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 95;
        int h = 154;
        double bmi = service.calculate(m,h);
        String result = String.format("%.2f",bmi);
        System.out.println("Индекс массы тела: " + result);
    }
}