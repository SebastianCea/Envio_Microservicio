package micro.microservicios2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import micro.microservicios2.model.envio;
import micro.microservicios2.service.EnvioService;

@RestController
@RequestMapping("/api/envios")
public class EnvioController {
    @Autowired
    private EnvioService envioService;

    @GetMapping
    public List<envio> getEnvios(){
        return envioService.listarTodas();
    }

    @PostMapping
    public envio postEnvio(@RequestBody envio envio){
        return envioService.guardarEnvio(envio);
    }

    @GetMapping("/{id}")
    public envio getEnvio(@PathVariable String id_envio){
        return envioService.buscarxIdEnvio(id_envio);
    }

    @PutMapping
    public envio putEnvio(@PathVariable String id_envio, @RequestBody envio emodificada){
        return envioService.modificarEnvio(id_envio, emodificada);
    }

    @DeleteMapping
    public String deleteEnvio(@PathVariable String id_envio){
        return envioService.eliminarEnvio(id_envio);
    }
}
