/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.HashMap;

/**
 *
 * @author Гамаюнов Иван
 */
// Класс Set представляет собой множество на основе хэш-таблицы.
class Set<T> {
    private final HashMap<T, Boolean> map;

    public Set() {
        this.map = new HashMap<>();
    }

    // Добавляет элемент в множество.
    public void add(T element) {
        map.put(element, true);
    }

    // Удаляет элемент из множества.
    public void remove(T element) {
        map.remove(element);
    }

    // Проверяет, содержится ли элемент в множестве.
    public boolean contains(T element) {
        return map.containsKey(element);
    }

    // Возвращает размер множества.
    public int size() {
        return map.size();
    }

    // Проверяет, пусто ли множество.
    public boolean isEmpty() {
        return map.isEmpty();
    }

    // Очищает множество.
    public void clear() {
        map.clear();
    }

    // Возвращает строковое представление множества.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        map.keySet().stream().map((element) -> {
            sb.append(element);
            return element;
        }).forEachOrdered((_item) -> {
            sb.append(", ");
        });
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("}");
        return sb.toString();
    }
}


