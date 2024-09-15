package check.service;

import check.dto.RegisterClientRequest;
import check.dto.RegisterClientResponse;

public interface ClientService {
    RegisterClientResponse registerClient(RegisterClientRequest registerClientRequest);
}
