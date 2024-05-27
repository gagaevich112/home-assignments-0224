package ru.sberbank.jd.lesson01;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GetUsersDataTest {
    GetUsersData getUsersData = new GetUsersData();

    @Test
    public void getFirstNameTest(){
        Assertions.assertEquals("Alexandr", getUsersData.getFirstName());
    }
    @Test
    public void getLastNameTest(){
        Assertions.assertEquals("Gagaev", getUsersData.getLastName());
    }
    @Test
    public void getBirthYearTest(){
        Assertions.assertEquals(1997, getUsersData.getBirthYear());
    }
    @Test
    public void getHobbiesTest(){
        List<String> a = new ArrayList<>();
        a.add("Автоспорт");
        a.add("Картинг");
        a.add("Фитнесс");
        Assertions.assertEquals(a, getUsersData.getHobbies());
    }

    @Test
    public void getRepoUrlTest(){
        Assertions.assertEquals("https://github.com/gagaevich112/home-assignments-0224/tree/develop", getUsersData.getRepoUrl());
    }

    @Test
    public void getPhoneTest(){
        Assertions.assertEquals("89534101815", getUsersData.getPhone());
    }

    @Test
    public void getCourseExpectationsTest(){
        List<String> b = new ArrayList<>();
        b.add("Новые знания которые будут подкреплены практикой");
        b.add("возможность погрузиться в новую сферу деятельности");
        b.add("интересные и сложные задачи");
        b.add("отсутствие скучных, монотоных многочасовых лекций");
        Assertions.assertEquals(b, getUsersData.getCourseExpectations());
    }

}
