package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // Счетчик месяцев отдыха
        int money = 0; // Количество денег на счету

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // Можем ли отдыхать?
                count++; // Увеличиваем счетчик месяцев отдыха
                money -= expenses; // Тратим на отдых
                money /= 3; // Уменьшаем оставшиеся средства на треть
            } else {
                money += income; // Работаем и получаем доход
                money -= expenses; // Уменьшаем на обязательные ежемесячные расходы
            }
        }
        return count;
    }
}