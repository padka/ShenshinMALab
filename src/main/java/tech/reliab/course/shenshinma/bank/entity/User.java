package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;
import java.time.LocalDate;

/**
 * Класс {@code User} описывает клиента банка.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private long id;
    private String fullName;
    private LocalDate birthDate;
    private String employment;
    private double monthlyIncome;
    private String bankName;
    private int creditScore;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", employment='" + employment + '\'' +
                ", monthlyIncome=" + monthlyIncome +
                ", bankName='" + bankName + '\'' +
                ", creditScore=" + creditScore +
                ", address='" + address + '\'' +
                '}';
    }
}