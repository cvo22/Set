/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

/**
 *
 * @author Гамаюнов Иван
 */
// Пример использования множества.
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new Set<>();

        // Добавление элементов в множество.
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        // Вывод множества.
        System.out.println(set); // {1, 2, 3, 4, 5}

        // Проверка, содержится ли элемент в множестве.
        System.out.println(set.contains(3)); // true

        // Удаление элемента из множества.
        set.remove(3);

        // Вывод множества.
        System.out.println(set); // {1, 2, 4, 5}

        // Получение размера множества.
        System.out.println(set.size()); // 4

        // Проверка, пусто ли множество.
        System.out.println(set.isEmpty()); // false

        // Очистка множества.
        set.clear();

        // Проверка, пусто ли множество.
        System.out.println(set.isEmpty()); // true

        // Вывод множества.
        System.out.println(set); // {}
    }
}
