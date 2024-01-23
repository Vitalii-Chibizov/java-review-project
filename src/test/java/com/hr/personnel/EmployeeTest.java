package com.hr.personnel;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp() throws Exception {
        // create test obj
        employee
                = new Employee("Vitaly",
                LocalDate.of(2010, 04, 05));
    }

    @Test
    public void getEmployeeInfo_should_return_valid_employee_info() {

        // call test target
        String employeeInfo = employee.getEmployeeInfo();


        // verify if the result is what expected
        assertEquals("name = Vitaly, hireDate = 2010-04-05",
                employeeInfo);
        assertThat(employeeInfo).isEqualTo("name = Vitaly, " +
                "hireDate = 2010-04-05");

    }

    @Test
    public void work() {

        // call test target
        String work = employee.work();


        // verify if the result is what expected
        assertEquals("Vitaly worked", work);
        assertThat(work).isEqualTo("Vitaly worked");
    }
}