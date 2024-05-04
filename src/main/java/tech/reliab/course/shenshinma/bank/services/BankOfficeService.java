package tech.reliab.course.shenshinma.bank.services;

import tech.reliab.course.shenshinma.bank.entity.BankOffice;
import tech.reliab.course.shenshinma.bank.entity.Bank;

public interface BankOfficeService {

    /**
     * Создает новый банковский офис и возвращает его.
     * @param id Идентификатор банковского офиса.
     * @param name Название офиса.
     * @param address Адрес офиса.
     * @param canPlaceAtm Может ли офис установить банкоматы.
     * @param numberOfAtms Количество банкоматов в офисе.
     * @param canIssueLoans Может ли офис выдавать кредиты.
     * @param operatesMoneyWithdrawal Осуществляет ли офис операции по выдаче наличных.
     * @param acceptsDeposits Принимает ли офис депозиты.
     * @param moneyInOffice Количество денег, хранящихся в офисе.
     * @param rentCost Стоимость аренды помещения.
     * @param bank Банк, к которому принадлежит офис.
     * @return Созданный банковский офис.
     */
    BankOffice createBankOffice(Long id, String name, String address, boolean canPlaceAtm, int numberOfAtms,
                                boolean canIssueLoans, boolean operatesMoneyWithdrawal, boolean acceptsDeposits,
                                double moneyInOffice, double rentCost, Bank bank);

    BankOffice read(Long id);

    BankOffice update(BankOffice bankOffice);

    void delete(Long id);
}
