package check.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterClientRequest {
    private String username;
    private String password;
}
