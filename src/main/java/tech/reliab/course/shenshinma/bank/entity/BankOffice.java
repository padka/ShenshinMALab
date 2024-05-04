package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankOffice {
    private long id;
    private String name;
    private String address;
    private String status = "работает";
    private boolean canPlaceAtm;
    private int numberOfAtms;
    private boolean canIssueLoans;
    private boolean operatesMoneyWithdrawal;
    private boolean acceptsDeposits;
    private double moneyInOffice;
    private double rentCost;


}
