package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;

/**
 * Класс {@code Bank} описывает банк в банковской системе.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
    private long id;
    private String name;
    private int numberOfOffices;
    private int numberOfAtms;
    private int numberOfEmployees;
    private int numberOfClients;
    private int rating;
    private double totalMoneyInBank;
    private double interestRate;

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfOffices=" + numberOfOffices +
                ", numberOfAtms=" + numberOfAtms +
                ", numberOfEmployees=" + numberOfEmployees +
                ", numberOfClients=" + numberOfClients +
                ", rating=" + rating +
                ", totalMoneyInBank=" + totalMoneyInBank +
                ", interestRate=" + interestRate +
                '}';
    }
}