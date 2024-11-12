public class BmiService {
    public int calculate(int weightKg, double heightM) {
        double bmi = weightKg / (heightM * heightM); // расчет BMI
        return (int) bmi; // приведение к целому числу
    }
}