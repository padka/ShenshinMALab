package tech.reliab.course.shenshinma.bank.services;

import tech.reliab.course.shenshinma.bank.entity.Bank;
import tech.reliab.course.shenshinma.bank.entity.BankAtm;
import tech.reliab.course.shenshinma.bank.entity.BankOffice;
import tech.reliab.course.shenshinma.bank.entity.Employee;

public interface BankAtmService {

    /**
     * Создает и возвращает новый объект BankAtm.
     *
     * @param id Уникальный идентификатор банкомата.
     * @param name Название банкомата.
     * @param address Адрес расположения банкомата.
     * @param status Статус работы банкомата.
     * @param bank Банк, к которому относится банкомат.
     * @param bankOffice Офис, в котором установлен банкомат.
     * @param employee Сотрудник, ответственный за обслуживание банкомата.
     * @param operating Указывает, работает ли банкомат на выдачу денег.
     * @param canAcceptDeposits Может ли банкомат принимать вклады.
     * @param amountOfMoney Количество денег в банкомате.
     * @param maintenanceCost Стоимость обслуживания банкомата.
     * @return Возвращает созданный банкомат.
     */
    BankAtm createBankAtm(Long id, String name, String address, String status, Bank bank, BankOffice bankOffice,
                          Employee employee, boolean operating, boolean canAcceptDeposits, double amountOfMoney,
                          double maintenanceCost);

    /**
     * Возвращает банкомат по его ID.
     *
     * @param id Уникальный идентификатор банкомата.
     * @return Найденный банкомат или null, если банкомат не найден.
     */
    BankAtm read(Long id);

    /**
     * Обновляет информацию о банкомате и возвращает обновленный объект.
     *
     * @param bankAtm Объект банкомата для обновления.
     * @return Обновленный банкомат.
     */
    BankAtm update(BankAtm bankAtm);

    /**
     * Удаляет банкомат по его ID.
     *
     * @param id Уникальный идентификатор банкомата.
     */

    void delete(Long id);
}
