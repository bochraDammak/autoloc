package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domaine.client;
import tn.esprit.autoloc.repository.ClientRepository;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService  {
    private final ClientRepository cRepo;
    
    @Override
    public List<client> retrieveAllClients() {
        return (List<client>) cRepo.findAll();
    }

    @Override
    public client addClient(client c) {
        return cRepo.save(c);
    }

    @Override
    public client updateClient(client c) {
        return cRepo.save(c);
    }

    @Override
    public client retrieveClient(Long idClient) {
        return cRepo.findById(idClient).orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
        cRepo.deleteById(idClient);
    }

    @Override
    public List<client> addClients(List<client> clients) {
        return (List<client>) cRepo.saveAll(clients);
    }
}