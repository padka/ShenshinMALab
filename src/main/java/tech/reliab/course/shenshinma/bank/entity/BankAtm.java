package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;

/**
 * Класс {@code BankAtm} представляет банкомат в банковской системе.
 */
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
    private BankOffice bankOffice;
    private Employee servicingEmployee;
    private boolean isOperating;
    private boolean canAcceptDeposits;
    private double amountOfMoney;
    private double maintenanceCost;

    @Override
    public String toString() {
        return "BankAtm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", bank=" + (bank != null ? bank.getName() : "N/A") +
                ", bankOffice=" + (bankOffice != null ? bankOffice.getName() : "N/A") +
                ", servicingEmployee=" + (servicingEmployee != null ? servicingEmployee.getFullName() : "N/A") +
                ", isOperating=" + isOperating +
                ", canAcceptDeposits=" + canAcceptDeposits +
                ", amountOfMoney=" + amountOfMoney +
                ", maintenanceCost=" + maintenanceCost +
                '}';
    }


}
