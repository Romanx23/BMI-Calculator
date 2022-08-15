public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double weight;
        double height;
        double result;
        double bmi = service.calculate(1.8, 100);

        System.out.println(bmi);
    }
}
