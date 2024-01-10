package ie.atu.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class integrationTest {

    @Test
    public void testNotifyDetails() {

        NotificationController notificationController = new NotificationController();

        PersonDetails personDetails = new PersonDetails();

        String outcome = notificationController.notifyDetails(personDetails);

        assertEquals("Success", outcome);       //If outcome is equal to Success, test passes.
    }
    public class NotificationController {
        public String notifyDetails(PersonDetails personDetails) {
            return "Success";
        }
    }
    public class PersonDetails {

    }
}
