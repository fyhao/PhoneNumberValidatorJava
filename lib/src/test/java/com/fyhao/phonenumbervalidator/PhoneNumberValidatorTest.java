package com.fyhao.phonenumbervalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberValidatorTest {
    @Test void testForValidation() {
        PhoneNumberValidator lib = new PhoneNumberValidator();
        assertTrue(lib.isValidPhoneNumber("+6591234123"));
    }
}