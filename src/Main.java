public class Main {
    public static void Main(String[] args) {
        BMIService service = new BMIService();
        double weight = 100;
        double height = 1.8;
        double bmi= service.calculate(double weight, double height);
    }
}
