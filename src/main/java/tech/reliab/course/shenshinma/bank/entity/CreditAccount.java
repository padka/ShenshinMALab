package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;
import java.time.LocalDate;

/**
 * Класс {@code CreditAccount} описывает кредитный счёт в банковской системе.
 * Включает в себя детали кредита, такие как сроки, суммы и условия возврата.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditAccount {
    private long id; // Уникальный идентификатор кредитного счета
    private User user; // Пользователь, за которым закреплён этот кредитный счёт
    private String bankName; // Название банка, где взят кредит
    private LocalDate startDate; // Дата начала кредита
    private LocalDate endDate; // Дата окончания кредита
    private int termInMonths; // Кол-во месяцев, на которые взят кредит
    private double loanAmount; // Сумма кредита
    private double monthlyPayment; // Ежемесячный платёж
    private double interestRate; // Процентная ставка
    private Employee issuingEmployee; // Сотрудник, который выдал кредит
    private PaymentAccount paymentAccount; // Платежный счет для погашения кредита

    @Override
    public String toString() {
        return "CreditAccount{" +
                "id=" + id +
                ", user=" + (user != null ? user.getFullName() : "N/A") +
                ", bankName='" + bankName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", termInMonths=" + termInMonths +
                ", loanAmount=" + loanAmount +
                ", monthlyPayment=" + monthlyPayment +
                ", interestRate=" + interestRate +
                ", issuingEmployee=" + (issuingEmployee != null ? issuingEmployee.getFullName() : "N/A") +
                ", paymentAccount=" + (paymentAccount != null ? paymentAccount.getId() : "N/A") +
                '}';
    }
}
