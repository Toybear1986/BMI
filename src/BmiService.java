public class BmiService {

    public double calculate(int m /*вес*/, double h /*рост*/) {
            return m / (Math.pow(h/100,2));
    }
}
