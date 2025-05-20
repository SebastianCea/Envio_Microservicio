package micro.microservicios2.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import micro.microservicios2.model.envio;

@Repository
public interface EnvioRepository extends JpaRepository<envio, String> {
    
    List<envio> findAll();
}
