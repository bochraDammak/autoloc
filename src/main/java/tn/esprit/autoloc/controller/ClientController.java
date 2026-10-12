package tn.esprit.autoloc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.service.IClientService;
import tn.esprit.autoloc.domaine.client;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/Client")
public class ClientController {
    private final IClientService ic;

    @PostMapping("/addClient")
    public client addClient (@RequestBody client c)
    {
        return ic.addClient(c);
    }

    @GetMapping("/getClients")
    public List<client> getAllClients()
    {
        return ic.retrieveAllClients();
    }

    @GetMapping("/getClient/{idC}")
    public client getClient(@PathVariable Long idC)
    {
        return ic.retrieveClient(idC);
    }

    @DeleteMapping("/deleteClient/{idC}")
    public void deleteClient(@PathVariable Long idC)
    {
        ic.removeClient(idC);
    }

    @PutMapping("/updateClient")
    public client updateClient(@RequestBody client c)
    {
        return ic.updateClient(c);
    }
}
