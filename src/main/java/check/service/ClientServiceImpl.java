package check.service;

import check.dto.RegisterClientRequest;
import check.dto.RegisterClientResponse;
import check.model.Client;
import check.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    ClientRepository clientRepository;


    @Override
    public RegisterClientResponse registerClient(RegisterClientRequest registerClientRequest) {
        Client client = new Client();
        client.setUsername(registerClientRequest.getUsername());
        client.setPassword(registerClientRequest.getPassword());
        clientRepository.save(client);
        RegisterClientResponse response = new RegisterClientResponse();
        response.setClientId(client.getId());
        response.setUsername(client.getUsername());
        response.setMessage("User successfully registered");
        return response;
    }

    }

