package ie.atu.notificationservice.notificationservice;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {
    private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person getPersonByEmployeeId(String employeeId) {
        return personRepo.findByEmployeeId(employeeId);
    }

    public Person removePerson(String id){
        personRepo.deleteById(id);
        return null;
    }
}
