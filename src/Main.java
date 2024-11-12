public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98; // вес в килограммах
        double height = 1.87; // рост в метрах
        int bmi = service.calculate(weight, height); // должно получиться 28
        System.out.println(bmi);
    }
}
