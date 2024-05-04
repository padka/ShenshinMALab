package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAtm {
    private long id;
    private String name;
    private String address;
    private String status;
    private Bank bank;
    private String location;
    private Employee servicingEmployee;
    private boolean isOperating;
    private boolean canAcceptDeposits;
    private double amountOfMoney;
    private double maintenanceCost;
}
