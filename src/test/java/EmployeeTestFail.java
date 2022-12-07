import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestFail {

    @Test
    void employeeNumberFail() {
        Employee employee = new Employee("Patrick", "1234567891011");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, employee::getEmployeeNumber);
        assertEquals("Employee Number should be 12 digits long", exception.getMessage());
    }

    @Test
    void employeeNameFail() {
    }
}