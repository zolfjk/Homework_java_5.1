package ru.netology.sqr;

public class SQRService {

    public int numberOfSqaredIntoBordersOfValues(int minLimiterValue, int maxLimiterValue) {
        int numberOfSqared = 0;
        for (int Number = 10; Number < 100; Number++) {
            int sqrNumber = (int) Math.pow(Number, 2);
            if (sqrNumber >= minLimiterValue) if (sqrNumber <= maxLimiterValue) {
                numberOfSqared++;
            }
        }
        return numberOfSqared;
    }
}

