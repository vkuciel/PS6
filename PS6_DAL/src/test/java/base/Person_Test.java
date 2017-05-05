package base;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AddPerson() {
		PersonDomainModel per1 = new PersonDomainModel();
		per1.setBirthday(new Date(0));
		per1.setCity("Townsend");
		per1.setFirstName("Bert");
		per1.setLastName("Gibbons");
		per1.setPostalCode(19734);
		per1.setStreet("214 Labrador Lane");
		
		PersonDAL.addPerson(per1);
		
		
	}
	@Test
	public void AddPersonTest() {
		PersonDomainModel per1 = new PersonDomainModel();
		PersonDAL.addPerson(per1);
		PersonDomainModel per2 = PersonDAL.getPerson(per1.getPersonID());
		assertEquals(per1.getPersonID(), per2.getPersonID());
	}
	@Test
	public void GetPersontest() {
		PersonDomainModel per1 = new PersonDomainModel();
		String n = per1.getLastName();
		assertEquals("Name", n);
	}
	@Test
	public void UpdatePersonTest() {
		PersonDomainModel per1 = new PersonDomainModel();
		per1.setFirstName("Firstname");
		String UNAME = per1.getFirstName();
		PersonDAL.updatePerson(per1);
		assertEquals("Firstname", UNAME);

	}
	@Test
	public void DeletePersonTest() {
		PersonDomainModel per1 = new PersonDomainModel();
		PersonDAL.addPerson(per1);
		UUID per1UUID = UUID.randomUUID();
		PersonDAL.deletePerson(per1UUID);
		

	}


}
