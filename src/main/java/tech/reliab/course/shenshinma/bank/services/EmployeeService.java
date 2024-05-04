package tech.reliab.course.shenshinma.bank.services;

import tech.reliab.course.shenshinma.bank.entity.BankOffice;
import tech.reliab.course.shenshinma.bank.entity.Employee;

import java.time.LocalDate;

public interface EmployeeService {

    /**
     * Создает нового сотрудника.
     *
     * @param id            Уникальный идентификатор сотрудника.
     * @param fullName      Полное имя сотрудника.
     * @param birthDate     Дата рождения сотрудника.
     * @param position      Должность сотрудника.
     * @param worksRemotely Указывает, работает ли сотрудник удаленно.
     * @param bankOffice
     * @param b
     * @param salary        Размер зарплаты сотрудника.
     * @return Созданный сотрудник.
     */
    Employee createEmployee(Long id, String fullName, LocalDate birthDate, String position,
                            boolean worksRemotely, BankOffice bankOffice, boolean b, double salary);

    /**
     * Возвращает сотрудника по его идентификатору.
     * @param id Идентификатор сотрудника.
     * @return Найденный сотрудник или null, если сотрудник не найден.
     */
    Employee read(Long id);

    /**
     * Обновляет данные сотрудника.
     * @param employee Сотрудник для обновления.
     * @return Обновленный сотрудник.
     */
    Employee update(Employee employee);

    /**
     * Удаляет сотрудника по его идентификатору.
     * @param id Идентификатор сотрудника.
     */
    void delete(Long id);
}
