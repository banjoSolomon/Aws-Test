package check.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterClientResponse {
    private String message;
    private Long clientId;
    private String username;

}
