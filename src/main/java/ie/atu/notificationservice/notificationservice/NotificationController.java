package ie.atu.notificationservice.notificationservice;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class NotificationController {
    private PersonService personService;

    public NotificationController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<String> getPerson(@PathVariable String employeeId){
        if(employeeId.length() < 5 || employeeId.isBlank()) {
            return ResponseEntity.badRequest().body("EmployeeID is invalid");
        }

        Person person = personService.getPersonByEmployeeId(employeeId);

        if(person == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(String.valueOf(person));
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable String id) {
       personService.removePerson(id);
       return new ResponseEntity<>("Person deleted successfully", HttpStatus.OK);
    }

}
