package com.techie.demo;

import com.techie.demo.model.EmployeeRecord;

import java.math.BigDecimal;

public class RecordsDemo {

    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("Keiser", "Soze",42,
                "New York", BigDecimal.valueOf(100000000));
        EmployeeRecord employeeRecord2 = new EmployeeRecord("Keiser", "Soze",42,
                "New York", BigDecimal.valueOf(100000000));
        EmployeeRecord employeeRecord3 = new EmployeeRecord("John", "Doe",42,
                "New York", BigDecimal.ZERO);

        System.out.println(employeeRecord.firstName());
        System.out.println(employeeRecord.lastName());

        System.out.println(employeeRecord3.firstName());
        System.out.println(employeeRecord3.lastName());

        System.out.println(employeeRecord.equals(employeeRecord2));  // true
        System.out.println(employeeRecord.equals(employeeRecord3));  // false

        System.out.println(employeeRecord.hashCode());
        System.out.println(employeeRecord2.hashCode());
        System.out.println(employeeRecord3.hashCode());


    }
}
