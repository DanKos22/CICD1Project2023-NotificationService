package ie.atu.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class unitTest {
    @Test
    public void NoArgsConstructorTest() {
        PersonDetails personDetails = new PersonDetails();

        assertNotNull(personDetails);           //Check the PersonDetails object is not null
        assertNull(personDetails.getName());    //Check that the name field is null
        assertNull(personDetails.getEmail());
    }

    @Test
    public void AllArgsConstructorTest() {
        String name = "Jane Doe";
        String email = "jane@atu.ie";

        PersonDetails personDetails = new PersonDetails(name, email);
        assertNotNull(personDetails);
        assertEquals(name, personDetails.getName());            //Check the name matches the provided value
        assertEquals(email, personDetails.getEmail());
    }

    @Test
    public void GetterAndSetterTest() {

        PersonDetails personDetails = new PersonDetails();
        String name = "Jane Doe";
        String email = "jane@atu.ie";

        personDetails.setName(name);
        personDetails.setEmail(email);

        assertEquals("Jane Doe", personDetails.getName());
        assertEquals("jane@atu.ie", personDetails.getEmail());

    }

    public class PersonDetails {
        String name;
        String email;

        public PersonDetails(String name, String email) {
            this.name = name;
            this.email = email;
        }

        //Default constructor. No parameters
        public PersonDetails() {

        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    }
}
