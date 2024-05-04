package tech.reliab.course.shenshinma.bank.services.Impl;

import tech.reliab.course.shenshinma.bank.entity.Bank;
import tech.reliab.course.shenshinma.bank.entity.PaymentAccount;
import tech.reliab.course.shenshinma.bank.entity.User;
import tech.reliab.course.shenshinma.bank.services.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {

    private PaymentAccount account;

    @Override
    public PaymentAccount createPaymentAccount(Long id, User user, Bank bank, double balance) {
        if (this.account == null) {
            this.account = new PaymentAccount(id, user, bank.getName(), balance);
        }
        return this.account;
    }

    @Override
    public PaymentAccount read(Long id) {
        if (this.account != null && this.account.getId() == id) {
            return this.account;
        }
        return null;
    }

    @Override
    public PaymentAccount update(PaymentAccount updatedAccount) {
        if (this.account != null && this.account.getId() == updatedAccount.getId()) {
            this.account = updatedAccount;
            return this.account;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (this.account != null && this.account.getId() == id) {
            this.account = null;
        }
    }
}
