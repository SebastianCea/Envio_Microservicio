package micro.microservicios2.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import micro.microservicios2.model.envio;

@Repository
public class EnvioRepository {
    
    private List<envio> envios = new ArrayList<>();

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
