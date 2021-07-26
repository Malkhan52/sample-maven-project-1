package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.sapient.trg.service.Person;

class PersonTest {
	
	private Person person=null;
	
	@BeforeEach
	void setUp() throws Exception {
		person = new Person(1,"Ravi","Kumar",LocalDate.of(1998, 1,15),9090890980L);
	}

	@AfterEach
	void tearDown() throws Exception {
		person=null;
	}

	@Disabled
	@Test
	void testAllArgConstructor() {
		Person person= new Person(1,null,null,null,null);
		assertThrows(IllegalArgumentException.class, ()-> person.getFirstName());
	}

	@Test
	void testForValidGetPersonId() {
		assertEquals(1 ,person.getPersonId());
	}
	
	
	@Test
	void testForInvalidGetPersonId() {
		assertNotEquals(2,person.getPersonId());
	}
	

	@Test
	void testSetPersonId() {
		person.setPersonId(2);
		assertEquals(2,person.getPersonId());
	}

	
	@Test
	void testGetFirstName() {
		assertEquals("Ravi",person.getFirstName());
	}

	
	@Test
	void testSetFirstName() {
		person.setFirstName("Steve");
		assertEquals("Steve",person.getFirstName());
	}

	
	@Test
	void testGetLastName() {
		assertEquals("Kumar",person.getLastName());
	}

	
	@Test
	void testSetLastName() {		
		assertNotEquals("Steve",person.getLastName());
	}

	@Test
	void testGetBirthdate() {
		assertEquals(LocalDate.of(1998, 1, 15), person.getBirthDate());
	}

	@Test
	void testSetBirthdate() {
		assertNotEquals(LocalDate.of(1998, 1, 7), person.getBirthDate());
	}

	@Test
	void testGetMobile() {
		assertEquals(9090890980L, person.getMobile());
	}

	@Test
	void testSetMobile() {
		assertNotEquals(9090890988L, person.getMobile());
	}

}

