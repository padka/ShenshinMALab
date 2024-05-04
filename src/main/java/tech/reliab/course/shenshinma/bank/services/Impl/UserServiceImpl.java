package tech.reliab.course.shenshinma.bank.services.Impl;

import tech.reliab.course.shenshinma.bank.entity.User;
import tech.reliab.course.shenshinma.bank.services.UserService;

import java.time.LocalDate;

public class UserServiceImpl implements UserService {

    private User user;

    @Override
    public User createUser(Long id, String fullName, LocalDate birthDate, String employment,
                       double monthlyIncome, String bankName, int creditScore, String address) {
        if (this.user == null) {
            this.user = new User(id, fullName, birthDate, employment, monthlyIncome, bankName, creditScore, address);
        }
        return this.user;
    }

    @Override
    public User read(Long id) {
        if (this.user != null && this.user.getId() == id) {
            return this.user;
        }
        return null;
    }

    @Override
    public User update(User updatedUser) {
        if (this.user != null && this.user.getId() == updatedUser.getId()) {
            this.user = updatedUser;
            return this.user;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (this.user != null && this.user.getId() == id) {
            this.user = null;
        }
    }
}
