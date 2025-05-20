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


    public envio guardarEnvioConDatosExternos(envio envio) {
        return envioRepository.save(envio);
    }

    public envio create(envio envio){
        envios.add(envio);
        System.out.println(envios.toString());
        return envio;
        }

    public List<envio> readAll(){
        return envios;    
    }

    public envio read(String id_envio){
        for (envio envio : envios){
            if(envio.getId_envio()==id_envio){
                return envio;
            }
        }
        return null;
    }

    public envio update(String id_envio, envio emodificada){
        envio en=read(id_envio);
        if(en!=null){
            en.setDestino(emodificada.getDestino());
            en.setEstado(emodificada.getEstado());
            en.setOrigen(emodificada.getOrigen());
            en.setFecha_salida(emodificada.getFecha_salida());
            en.setFecha_entrega(emodificada.getFecha_entrega());
            return en;
        }
        return null;
    }
    
    public String delete (String id_envio){
        envio kill=read(id_envio);
        if(kill!=null){
            envios.remove(kill);
            return "Envío Eliminado";
        }
        return "Envío no encontrado";
    }
}

