package ie.atu.cicd1project2023notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @PostMapping("/subscribe")
    public String notifyDetails(@RequestBody PersonDetails personDetails){
        String notifyMessage = String.format("Ticket request for Customer %s has been successful. The purchase is confirmed!", personDetails.getName());

        return notifyMessage;
    }
}
