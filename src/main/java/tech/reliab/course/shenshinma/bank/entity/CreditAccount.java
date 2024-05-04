package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditAccount {
    private long id;
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

}
