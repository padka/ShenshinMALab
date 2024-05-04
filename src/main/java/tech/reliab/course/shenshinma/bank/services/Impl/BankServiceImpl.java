package tech.reliab.course.shenshinma.bank.services.Impl;

import tech.reliab.course.shenshinma.bank.entity.Bank;
import tech.reliab.course.shenshinma.bank.services.BankService;

public class BankServiceImpl implements BankService {

    private Bank bank;

    @Override
    public Bank createBank(Long id, String name) {
        if (this.bank == null) {
            this.bank = new Bank(id, name, 0, 0, 0, 0, (int)(Math.random() * 100),
                    Math.random() * 1000000, 5);
        }
        return this.bank;
    }

    @Override
    public Bank read(Long id) {
        if (this.bank != null && this.bank.getId() == id) {
            return this.bank;
        }
        return null;
    }

    @Override
    public Bank update(Bank updatedBank) {
        if (this.bank != null && this.bank.getId() == updatedBank.getId()) {
            this.bank = updatedBank;
            return this.bank;
        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        if (this.bank != null && this.bank.getId() == (id)) {
            this.bank = null;
            return true;
        }
        return false;
    }
}
