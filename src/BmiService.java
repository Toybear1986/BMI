public class BmiService {

    public double calculate(int weight, float height) {
        return weight / (Math.pow(height / 100, 2));
    }
}
