package ru.sberbank.jd.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class NodImplTest {

    NodImpl nodImpl = new NodImpl();

    //Проверяет типичный случай, когда один из чисел является делителем другого.
    @Test
    public void testCalculateWithCommonCase() {
        Assert.assertEquals(10, nodImpl.calculate(20, 10));
    }

    //Проверяет симметрию функции, чтобы убедиться, что результат одинаков независимо от порядка аргументов.
    @Test
    public void testCalculateWithReversedParameters() {
        Assert.assertEquals(10, nodImpl.calculate(10, 20));
    }

    //Проверяет случай, когда оба числа являются простыми и не имеют общих делителей, кроме 1.
    @Test
    public void testCalculateWithPrimeNumbers() {
        Assert.assertEquals(1, nodImpl.calculate(17, 13));
    }

    //Проверяет случай, когда одно из чисел равно нулю. Результат должен быть равен ненулевому числу.
    @Test
    public void testCalculateWithZero() {
        Assert.assertEquals(15, nodImpl.calculate(15, 0));
        Assert.assertEquals(15, nodImpl.calculate(0, 15));
    }

    //Проверяет случай, когда оба числа равны. Результат должен быть равен самому числу.
    @Test
    public void testCalculateWithEqualNumbers() {
        Assert.assertEquals(5, nodImpl.calculate(5, 5));
    }

    //Проверяет случай, когда одно из чисел является кратным другого.
    @Test
    public void testCalculateWithOneNumberBeingMultipleOfOther() {
        Assert.assertEquals(12, nodImpl.calculate(12, 36));
        Assert.assertEquals(12, nodImpl.calculate(36, 12));
    }

    //Проверяет работу функции с отрицательными числами. Результат должен быть положительным наибольшим общим делителем.
    @Test
    public void testCalculateWithNegativeNumbers() {
        Assert.assertEquals(5, nodImpl.calculate(-15, 10));
        Assert.assertEquals(5, nodImpl.calculate(15, -10));
        Assert.assertEquals(5, nodImpl.calculate(-15, -10));
    }
}