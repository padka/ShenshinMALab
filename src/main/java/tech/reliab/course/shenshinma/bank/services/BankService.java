package tech.reliab.course.shenshinma.bank.services;

import tech.reliab.course.shenshinma.bank.entity.Bank;

public interface BankService {

    /**
     * Создает новый банк.
     * @param id Уникальный идентификатор банка.
     * @param name Название банка.
     * @return Созданный банк.
     */
    Bank createBank(Long id, String name);

    /**
     * Возвращает банк по его идентификатору.
     * @param id Идентификатор банка.
     * @return Банк, если он найден, иначе null.
     */
    Bank read(Long id);

    /**
     * Обновляет информацию о банке.
     * @param bank Объект банка для обновления.
     * @return Обновленный банк.
     */
    Bank update(Bank bank);

    /**
     * Удаляет банк по его идентификатору.
     * @param id Идентификатор банка.
     * @return true, если банк был успешно удален.
     */
    boolean delete(Long id);
}
