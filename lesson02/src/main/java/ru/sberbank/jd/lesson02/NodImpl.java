package ru.sberbank.jd.lesson02;

/**
 * Реализация интерфейса Nod.
 */

public class NodImpl implements Nod {

    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     *
     * @param first  первое число
     *
     * @param second второе число
     *
     * @return наибольший общий делитель
     */
    @Override
    public int calculate(int first, int second) {
        // Приводим аргументы к неотрицательным числам
        first = Math.abs(first);
        second = Math.abs(second);
        while (second != 0) {
            // Временная переменная для хранения остатка
            int temp = second;
            // Обновляем значение second как остаток от деления first на second
            second = first % second;
            // Обновляем значение first как temp (предыдущее значение second)
            first = temp;
        }
        // Возвращаем НОД
        return first;
    }
}
