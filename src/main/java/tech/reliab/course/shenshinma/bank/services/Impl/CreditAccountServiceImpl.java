package tech.reliab.course.shenshinma.bank.services.Impl;

import tech.reliab.course.shenshinma.bank.entity.CreditAccount;
import tech.reliab.course.shenshinma.bank.entity.Employee;
import tech.reliab.course.shenshinma.bank.entity.PaymentAccount;
import tech.reliab.course.shenshinma.bank.entity.User;
import tech.reliab.course.shenshinma.bank.services.CreditAccountService;

import java.time.LocalDate;

public class CreditAccountServiceImpl implements CreditAccountService {

    private CreditAccount account;

    @Override
    public CreditAccount createCreditAccount(Long id, User user, String bankName, LocalDate startDate, LocalDate endDate,
                                             int termInMonths, double loanAmount, double interestRate,
                                             Employee issuingEmployee, PaymentAccount paymentAccount) {
        // Проверка на существование аккаунта обеспечивает уникальность в данной реализации
        if (this.account == null) {
            this.account = new CreditAccount(id, user, bankName, startDate, endDate, termInMonths,
                    loanAmount, 0.0 /* monthlyPayment не должен быть здесь */, interestRate,
                    issuingEmployee, paymentAccount);
        }
        return this.account;
    }

    @Override
    public CreditAccount read(Long id) {
        if (this.account != null && this.account.getId() == id) {
            return this.account;
        }
        return null;
    }

    @Override
    public CreditAccount update(CreditAccount updatedAccount) {
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
