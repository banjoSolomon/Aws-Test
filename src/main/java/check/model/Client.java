package check.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Client {
    private String username;
    private String password;
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private String id;
}
