package ru.sberbank.jd.lesson01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * класс для сбора данных об ученике.
 */

public class GetUsersData implements Greeting {

    /**
     * метод возвращающий имя студента.
     *
     * @return имя студента
     */
    @Override
    public String getFirstName() {
        return "Alexandr";
    }

    /**
     * методов возвращающий Фамилию студента.
     *
     * @return Фамилия студента
     */
    @Override
    public String getLastName() {
        return "Gagaev";
    }

    /**
     * метод возвращающий год рождения студента.
     *
     * @return год рождения
     */
    @Override
    public int getBirthYear() {
        return 1997;
    }

    /**
     * метод возвращающий список хобби студента.
     *
     * @return список хобби
     */
    @Override
    public Collection<String> getHobbies() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Автоспорт");
        hobbies.add("Картинг");
        hobbies.add("Фитнесс");
        return hobbies;
    }

    /**
     * метод возвращающий ссылку на гит студента.
     *
     * @return ссылка на гит
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/gagaevich112/home-assignments-0224/tree/develop";
    }

    /**
     * метод возвращающий номер телефона студента.
     *
     * @return номер телефона
     */
    @Override
    public String getPhone() {
        return "89534101815";
    }

    /**
     * метод возвращающий список ожиданий от курса студента.
     *
     * @return список ожиданий от курса
     */
    @Override
    public Collection<String> getCourseExpectations() {
        List<String> courseExpectations = new ArrayList<>();
        courseExpectations.add("Новые знания которые будут подкреплены практикой");
        courseExpectations.add("возможность погрузиться в новую сферу деятельности");
        courseExpectations.add("интересные и сложные задачи");
        courseExpectations.add("отсутствие скучных, монотоных многочасовых лекций");
        return courseExpectations;
    }
}
