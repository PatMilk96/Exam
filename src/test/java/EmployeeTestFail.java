import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestFail {

    @Test
    void employeeNumberFail() {
        Employee employee = new Employee("Patrick", "1234567");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, employee::getEmployeeNumber);
        assertEquals("Employee Number should be 12 digits long", exception.getMessage());
    }

    @Test
    void employeeNameFail() {
        Employee employee = new Employee("Pat", "123456789101");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, employee::getName);
        assertEquals("Invalid name length", exception.getMessage());
    }
}