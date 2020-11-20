package lesson3;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> phoneBook = new HashMap<>();

    public void add(String surname, String number){
        phoneBook.put(surname, number);
        System.out.println("Новая запись успешно добавлена");
    }

    public void get(String surname){
        for (String s : phoneBook.keySet()) {
            if (s.equals(surname)){
                System.out.println("Номер телефона - "+surname + " является - " + phoneBook.get(s));
            }
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}

/*
Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
 (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
*/
