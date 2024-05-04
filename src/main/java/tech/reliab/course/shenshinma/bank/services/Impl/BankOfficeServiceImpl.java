package tech.reliab.course.shenshinma.bank.services.Impl;

import tech.reliab.course.shenshinma.bank.entity.Bank;
import tech.reliab.course.shenshinma.bank.entity.BankOffice;
import tech.reliab.course.shenshinma.bank.services.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService {

    private BankOffice office; // Упрощенно предполагаем, что работаем только с одним объектом

    @Override
    public BankOffice createBankOffice(Long id, String name, String address, boolean canPlaceAtm,
                                       int numberOfAtms, boolean canIssueLoans, boolean operatesMoneyWithdrawal,
                                       boolean acceptsDeposits, double moneyInOffice, double rentCost, Bank bank) {
        if (this.office == null) {
            this.office = new BankOffice();
            office.setId(id);
            office.setName(name);
            office.setAddress(address);
            office.setCanPlaceAtm(canPlaceAtm);
            office.setNumberOfAtms(numberOfAtms);
            office.setCanIssueLoans(canIssueLoans);
            office.setOperatesMoneyWithdrawal(operatesMoneyWithdrawal);
            office.setAcceptsDeposits(acceptsDeposits);
            office.setMoneyInOffice(moneyInOffice);
            office.setRentCost(rentCost);
            office.setStatus("работает"); // Статус по умолчанию
        }
        return office;
    }

    @Override
    public BankOffice read(Long id) {
        if (this.office != null && this.office.getId() == id) {
            return this.office;
        }
        return null;
    }

    @Override
    public BankOffice update(BankOffice updatedOffice) {
        if (this.office != null && this.office.getId() == updatedOffice.getId()) {
            this.office = updatedOffice;
            return this.office;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (this.office != null && this.office.getId() == id) {
            this.office = null;
        }
    }
}
