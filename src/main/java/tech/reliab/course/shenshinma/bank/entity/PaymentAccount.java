package tech.reliab.course.shenshinma.bank.entity;

import lombok.*;

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
}
