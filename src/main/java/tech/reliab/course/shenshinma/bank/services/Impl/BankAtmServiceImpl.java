package tech.reliab.course.shenshinma.bank.services.Impl;

import tech.reliab.course.shenshinma.bank.entity.Bank;
import tech.reliab.course.shenshinma.bank.entity.BankAtm;
import tech.reliab.course.shenshinma.bank.entity.BankOffice;
import tech.reliab.course.shenshinma.bank.entity.Employee;
import tech.reliab.course.shenshinma.bank.services.BankAtmService;

public class BankAtmServiceImpl implements BankAtmService {

    private BankAtm atm;

    @Override
    public BankAtm createBankAtm(Long id, String name, String address, String status, Bank bank,
                                 BankOffice bankOffice, Employee employee, boolean operating,
                                 boolean canAcceptDeposits, double amountOfMoney, double maintenanceCost) {
        if (this.atm == null) {
            this.atm = new BankAtm(id, name, address, status, bank, bankOffice, employee,
                    operating, canAcceptDeposits, amountOfMoney, maintenanceCost);
        }
        return this.atm;
    }

    @Override
    public BankAtm read(Long id) {
        if (this.atm != null && this.atm.getId() == id) {
            return this.atm;
        }
        return null;
    }

    @Override
    public BankAtm update(BankAtm updatedAtm) {
        if (this.atm != null && this.atm.getId() == updatedAtm.getId()) {
            this.atm = updatedAtm;
            return this.atm;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (this.atm != null && this.atm.getId() == id) {
            this.atm = null;
        }
    }
}
