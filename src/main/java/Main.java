import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        int minLimiterValue = 100;
        int maxLimiterValue = 400;

        SQRService sqrService = new SQRService();

        int totalNumber = sqrService.numberOfSqaredIntoBordersOfValues(minLimiterValue, maxLimiterValue);

        System.out.println("Число квадратов чисел от 10 до 99, квадраты которых в диапазоне от " + minLimiterValue + " до " + maxLimiterValue);
        System.out.println("Равняется: " + totalNumber);
    }
}
