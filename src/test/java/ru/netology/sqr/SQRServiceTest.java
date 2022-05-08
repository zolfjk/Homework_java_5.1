package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void test(int minLimiterValue, int maxLimiterValue, int expected) {
        SQRService sqrService = new SQRService();

        int actual = sqrService.numberOfSqaredIntoBordersOfValues(minLimiterValue, maxLimiterValue);

        Assertions.assertEquals(expected, actual);
    }
}
