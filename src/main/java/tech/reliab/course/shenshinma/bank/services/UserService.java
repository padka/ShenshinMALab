package tech.reliab.course.shenshinma.bank.services;

import tech.reliab.course.shenshinma.bank.entity.User;
import java.time.LocalDate;

public interface UserService {

    /**
     * Создает нового пользователя.
     * @param id Уникальный идентификатор пользователя.
     * @param fullName Полное имя пользователя.
     * @param birthDate Дата рождения пользователя.
     * @param employment Место работы пользователя.
     * @param monthlyIncome Ежемесячный доход пользователя.
     * @param bankName Название банка, в котором открыт счет пользователя.
     * @param creditScore Кредитный рейтинг пользователя.
     * @param address Адрес проживания пользователя.
     * @return Созданный пользователь.
     */
    User createUser(Long id, String fullName, LocalDate birthDate, String employment,
                    double monthlyIncome, String bankName, int creditScore, String address);

    /**
     * Возвращает пользователя по его ID.
     * @param id Уникальный идентификатор пользователя.
     * @return Найденный пользователь или null, если пользователь не найден.
     */
    User read(Long id);

    /**
     * Обновляет информацию о пользователе.
     * @param user Объект пользователя для обновления.
     * @return Обновленный пользователь.
     */
    User update(User user);

    /**
     * Удаляет пользователя по его ID.
     * @param id Уникальный идентификатор пользователя.
     */
    void delete(Long id);
}
