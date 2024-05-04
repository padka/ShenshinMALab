package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private long id;
    private String fullName; // ФИО сотрудника
    private LocalDate birthDate; // Дата рождения
    private String position; // Должность
    private boolean worksRemotely; // Работает ли удаленно
    private BankOffice office; // Офис, в котором работает
    private boolean canIssueLoans; // Может ли выдавать кредиты
    private double salary; // Размер зарплаты
}
