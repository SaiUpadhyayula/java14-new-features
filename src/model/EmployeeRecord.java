package model;

import java.math.BigDecimal;

public record EmployeeRecord(String firstName, String lastName, Integer age, String address, BigDecimal salary) {
}
