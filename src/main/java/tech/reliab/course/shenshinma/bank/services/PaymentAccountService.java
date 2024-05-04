package tech.reliab.course.shenshinma.bank.services;

import tech.reliab.course.shenshinma.bank.entity.PaymentAccount;
import tech.reliab.course.shenshinma.bank.entity.User;
import tech.reliab.course.shenshinma.bank.entity.Bank;

public interface PaymentAccountService {

    /**
     * Создает новый платежный счет.
     * @param id Уникальный идентификатор счета.
     * @param user Пользователь, владелец счета.
     * @param bank Банк, в котором открыт счет.
     * @param balance Начальный баланс счета.
     * @return Созданный платежный счет.
     */
    PaymentAccount createPaymentAccount(Long id, User user, Bank bank, double balance);

    /**
     * Возвращает платежный счет по его ID.
     * @param id Уникальный идентификатор счета.
     * @return Найденный платежный счет или null, если счет не найден.
     */
    PaymentAccount read(Long id);

    /**
     * Обновляет информацию о платежном счете.
     * @param paymentAccount Объект платежного счета для обновления.
     * @return Обновленный платежный счет.
     */
    PaymentAccount update(PaymentAccount paymentAccount);

    /**
     * Удаляет платежный счет по его ID.
     * @param id Уникальный идентификатор счета.
     */
    void delete(Long id);
}
