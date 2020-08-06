package com.widerplanet.refactor02.before;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void setTelephoneNumber() {
            Person person = new Person();
            person.setTelephone("03255074412");
            assertEquals("032", person.getOfficeAreaCode());
            assertEquals("55074412", person.getOfficeNumber());
    }
}