package com.fyhao.phonenumbervalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberValidatorTest {
    @Test void testForValidation() {
        PhoneNumberValidatorLib lib = new PhoneNumberValidatorLib();
        assertTrue(lib.isValidPhoneNumber("1234"));
    }
}