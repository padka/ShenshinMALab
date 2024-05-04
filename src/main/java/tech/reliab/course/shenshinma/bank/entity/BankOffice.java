package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;

/**
 * Класс {@code BankOffice} описывает офис банка.
 * Содержит информацию о возможностях офиса, его местоположении и других операционных характеристиках.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankOffice {
    private long id; // Уникальный идентификатор офиса
    private String name; // Название офиса
    private String address; // Адрес офиса
    private String status; // Статус офиса (например, "работает" или "не работает")
    private boolean canPlaceAtm; // Можно ли установить банкомат
    private int numberOfAtms; // Количество банкоматов
    private boolean canIssueLoans; // Может ли офис выдавать кредиты
    private boolean operatesMoneyWithdrawal; // Может ли офис осуществлять выдачу наличных
    private boolean acceptsDeposits; // Принимает ли офис депозиты
    private double moneyInOffice; // Сумма денег в офисе
    private double rentCost; // Стоимость аренды офиса

    /**
     * Переопределенный метод для возвращения строкового представления объекта.
     * @return строковое представление данных банковского офиса.
     */
    @Override
    public String toString() {
        return "BankOffice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", canPlaceAtm=" + canPlaceAtm +
                ", numberOfAtms=" + numberOfAtms +
                ", canIssueLoans=" + canIssueLoans +
                ", operatesMoneyWithdrawal=" + operatesMoneyWithdrawal +
                ", acceptsDeposits=" + acceptsDeposits +
                ", moneyInOffice=" + moneyInOffice +
                ", rentCost=" + rentCost +
                '}';
    }
}
