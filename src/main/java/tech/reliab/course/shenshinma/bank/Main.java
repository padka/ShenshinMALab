package tech.reliab.course.shenshinma.bank;

import tech.reliab.course.shenshinma.bank.entity.*;
        import tech.reliab.course.shenshinma.bank.services.*;
        import tech.reliab.course.shenshinma.bank.services.Impl.*;

        import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Инициализация сервисов
        BankService bankService = new BankServiceImpl();
        BankAtmService bankAtmService = new BankAtmServiceImpl();
        BankOfficeService bankOfficeService = new BankOfficeServiceImpl();
        CreditAccountService creditAccountService = new CreditAccountServiceImpl();
        EmployeeService employeeService = new EmployeeServiceImpl();
        PaymentAccountService paymentAccountService = new PaymentAccountServiceImpl();
        UserService userService = new UserServiceImpl();

        // Создание банка
        Bank bank = bankService.createBank(1L, "Тинькофф Банк");
        System.out.printf("Создан банк: %s\n", bank);

        // Создание офиса
        BankOffice bankOffice = bankOfficeService.createBankOffice(1L, "Центральный офис", "ул. Щорса 50", true,
                5, true, true, true, 100000.0, 2000.0, bank);
        System.out.printf("Создан банковский офис: %s\n", bankOffice);

        // Создание сотрудника
        Employee employee = employeeService.createEmployee(1L, "Иван Иванов", LocalDate.of(1985, 5, 15),
                "Менеджер", false, bankOffice, false, 50000.0);
        System.out.printf("Создан сотрудник: %s\n", employee);

        // Создание банкомата
        BankAtm bankAtm = bankAtmService.createBankAtm(1L, "ATM-2001", "Щорса 50", "Active",
                bank, bankOffice, employee, true, true, 50000.0, 200.0);
        System.out.printf("Создан банкомат: %s\n", bankAtm);

        // Создание пользователя
        User user = userService.createUser(1L, "Петрова Анна Сергеевна", LocalDate.of(1994, 10, 12),
                "Маркетолог", 45000.0, "Тинькофф Банк", 750, "Щорса 50");
        System.out.printf("Создан пользователь: %s\n", user);

        // Создание платежного счета
        PaymentAccount paymentAccount = paymentAccountService.createPaymentAccount(1L, user, bank, 15000.0);
        System.out.printf("Создан платежный счет: %s\n", paymentAccount);

        // Создание кредитного счета
        CreditAccount creditAccount = creditAccountService.createCreditAccount(1L, user, "Тинькофф Банк", LocalDate.now(),
                LocalDate.now().plusYears(3), 36, 100000.0, 5.5, employee, paymentAccount);
        System.out.printf("Создан кредитный счет: %s\n", creditAccount);
    }
}
