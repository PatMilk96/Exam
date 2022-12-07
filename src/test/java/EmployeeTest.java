import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() { Employee employee = new Employee("Patrick", "123456789101112"); }

    @Test
    void nameTest(){
        Employee employee = new Employee("Patrick", "123456789101112");
        assertEquals("Patrick", employee.getName());
    }

    @Test
    void employeeNumTest(){
        Employee employee = new Employee("Patrick", "123456789101112");
        assertEquals("123456789101112", employee.getEmployeeNumber());
    }

    @AfterEach
    void tearDown() {
    }
}