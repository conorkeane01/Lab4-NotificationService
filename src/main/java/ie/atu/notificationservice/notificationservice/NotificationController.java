package ie.atu.notificationservice.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @PostMapping("/notification")
    public String registerUser(@RequestBody UserDetails userDetails) {
        String confirmationMessage = String.format( "confirmation notification sent to %s", userDetails.getEmail());
        return confirmationMessage;
    }
}
