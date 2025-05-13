package micro.microservicios2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import micro.microservicios2.model.envio;
import micro.microservicios2.repository.EnvioRepository;

@Service
public class EnvioService {
    @Autowired
    private EnvioRepository envioRepository;

    public envio guardarEnvio(envio envio){
        return envioRepository.create(envio);
    }

    public List<envio> listarTodas(){
        return envioRepository.readAll();
    }

    public envio buscarxIdEnvio(String id_envio){
        return envioRepository.read(id_envio);
    }

    public envio modificarEnvio(String id_envio, envio emodificada){

        return envioRepository.update(id_envio, emodificada);
    }

    public String eliminarEnvio(String id_envio){
        return envioRepository.delete(id_envio);
    }
}
