package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private long id;
    private String fullName; // Полное имя пользователя
    private LocalDate birthDate; // Дата рождения
    private String employment; // Место работы
    private double monthlyIncome; // Ежемесячный доход
    private String bankName; // Название банка, которым пользователь пользуется
    private CreditAccount creditAccount; // Один кредитный счет
    private PaymentAccount paymentAccount; // Один платежный счет
    private int creditScore; // Кредитный рейтинг
    private String address; // Адрес проживания
}
