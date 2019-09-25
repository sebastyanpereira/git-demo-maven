package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelperServiceTest {

    @Test
    void initials() {
        HelperService service = new HelperService();
        String actual = service.initials("Vasiliy Petrov");
        String expected = "VP";
        assertEquals(expected, actual);
    }
    {
        HelperService service = new HelperService();
        String actual = service.initials("Vasiliy");
        String expected = "V";
        assertEquals(expected, actual);
    }
}