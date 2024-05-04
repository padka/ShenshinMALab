package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;

/**
 * Класс {@code PaymentAccount} представляет платёжный счёт пользователя в банке.
 * Он содержит информацию о счёте, такую как баланс и банк, в котором счёт открыт.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentAccount {
    private long id; // Идентификатор счёта
    private User user; // Пользователь, которому принадлежит счет
    private String bankName; // Название банка, в котором открыт счет
    @Builder.Default
    private double balance = 0.0; // Текущий баланс счета, инициализируется как 0 по умолчанию

    /**
     * Возвращает строковое представление объекта класса {@code PaymentAccount}.
     * @return строка с информацией о платежном счете.
     */
    @Override
    public String toString() {
        return "PaymentAccount{" +
                "id=" + id +
                ", user=" + (user != null ? user.getFullName() : "N/A") +
                ", bankName='" + bankName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
