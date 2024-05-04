package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;

/**
 * Класс Bank описывает банк в банковской системе.
 */
@Getter
@Setter
@AllArgsConstructor
public class Bank {
    private long id; // Уникальный идентификатор банка
    private String name; // Название банка
    private int numberOfOffices; // Количество офисов банка
    private int numberOfAtms; // Количество банкоматов
    private int numberOfEmployees; // Количество сотрудников
    private int numberOfClients; // Количество клиентов
    private int rating; // Рейтинг банка
    private double totalMoneyInBank; // Общая сумма денег в банке
    private double interestRate; // Процентная ставка

}
