package ie.atu.notificationservice.notificationservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonRepo extends MongoRepository<Person, String> {
    Person findByEmployeeId(String employeeId);

    void deleteById (String id);
}
