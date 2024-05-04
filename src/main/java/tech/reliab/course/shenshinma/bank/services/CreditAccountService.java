package tech.reliab.course.shenshinma.bank.services;

import tech.reliab.course.shenshinma.bank.entity.CreditAccount;
import tech.reliab.course.shenshinma.bank.entity.Employee;
import tech.reliab.course.shenshinma.bank.entity.PaymentAccount;
import tech.reliab.course.shenshinma.bank.entity.User;

import java.time.LocalDate;

public interface CreditAccountService {

    /**
     * Создает кредитный счет.
     * @param id Идентификатор счета.
     * @param user Пользователь, владелец счета.
     * @param bankName Название банка.
     * @param startDate Дата начала кредита.
     * @param endDate Дата окончания кредита.
     * @param termInMonths Срок кредита в месяцах.
     * @param loanAmount Сумма кредита.
     * @param interestRate Процентная ставка.
     * @param issuingEmployee Сотрудник, выдавший кредит.
     * @param paymentAccount Платежный счет для погашения.
     * @return Созданный кредитный счет.
     */
    CreditAccount createCreditAccount(Long id, User user, String bankName, LocalDate startDate, LocalDate endDate,
                                      int termInMonths, double loanAmount, double interestRate,
                                      Employee issuingEmployee, PaymentAccount paymentAccount);

    CreditAccount read(Long id);

    CreditAccount update(CreditAccount creditAccount);

    void delete(Long id);
}
