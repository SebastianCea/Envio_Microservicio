package micro.microservicios2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.context.annotation.Bean;*/
import org.springframework.stereotype.Service;
/*import org.springframework.web.client.RestTemplate;*/

import micro.microservicios2.model.envio;
import micro.microservicios2.repository.EnvioRepository;

@Service
public class EnvioService {
    @Autowired
    private EnvioRepository envioRepository;

    /*@Autowired
    private RestTemplate restTemplate;*/

    public List<envio> envios(){
        return envioRepository.findAll();
    }

    public envio guardarEnvio(envio envio){
        return envioRepository.save(envio);
    }

    /*public envio crearEnvio(envio nuevoEnvio) {
    return envioRepository.save(nuevoEnvio);
}*/

    public envio buscarxIdEnvio(String id){
        return envioRepository.getReferenceById(id);
    }

    public String eliminarEnvio(String id){
        if(envioRepository.existsById(id)){
            envioRepository.deleteById(id);
            return "Envio eliminado";
        }
        return "No se encontró el envío";
    }

    /*@Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

    /*public Cliente obtenerCliente(String id_cliente){
        String url = "http://microservicio-cliente/clientes/" + id_cliente;
        return restTemplate.getForObject(url, Cliente.class);
    }*/
    
}
