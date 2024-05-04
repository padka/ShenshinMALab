package tech.reliab.course.shenshinma.bank.services.Impl;

import tech.reliab.course.shenshinma.bank.entity.BankOffice;
import tech.reliab.course.shenshinma.bank.entity.Employee;
import tech.reliab.course.shenshinma.bank.services.EmployeeService;

import java.time.LocalDate;

public class EmployeeServiceImpl implements EmployeeService {

    private Employee employee;

    @Override
    public Employee createEmployee(Long id, String fullName, LocalDate birthDate, String position,
                                   boolean worksRemotely, BankOffice bankOffice, boolean b, double salary) {
        if (this.employee == null) {
            this.employee = Employee.builder()
                    .id(id)
                    .fullName(fullName)
                    .birthDate(birthDate)
                    .position(position)
                    .worksRemotely(worksRemotely)
                    .office(bankOffice)
                    .salary(salary)
                    .build();
        }
        return this.employee;
    }

    @Override
    public Employee read(Long id) {
        if (this.employee != null && this.employee.getId() == id) {
            return this.employee;
        }
        return null;
    }

    @Override
    public Employee update(Employee updatedEmployee) {
        if (this.employee != null && this.employee.getId() == updatedEmployee.getId()) {
            this.employee = updatedEmployee;
            return this.employee;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        if (this.employee != null && this.employee.getId() == id) {
            this.employee = null;
        }
    }
}
