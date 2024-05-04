package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;
import java.time.LocalDate;

/**
 * Класс {@code Employee} представляет сотрудника банка.
 * Содержит информацию о личных данных сотрудника, его должности и условиях работы.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private long id; // Уникальный идентификатор сотрудника
    private String fullName; // ФИО сотрудника
    private LocalDate birthDate; // Дата рождения сотрудника
    private String position; // Должность сотрудника в банке
    private boolean worksRemotely; // Указывает, работает ли сотрудник удаленно
    private BankOffice office; // Офис, в котором работает сотрудник
    private boolean canIssueLoans; // Может ли сотрудник выдавать кредиты
    private double salary; // Размер зарплаты сотрудника


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", position='" + position + '\'' +
                ", worksRemotely=" + worksRemotely +
                ", office=" + (office != null ? office.getName() : "N/A") +
                ", canIssueLoans=" + canIssueLoans +
                ", salary=" + salary +
                '}';
    }
}
