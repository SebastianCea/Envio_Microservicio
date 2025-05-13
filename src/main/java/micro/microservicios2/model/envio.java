package micro.microservicios2.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table (name = "Envios")
public class envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_envio;

    @Column
    private String destino;

    @Column
    private String estado;

    @Column
    private String origen;

    @Column
    private String id_cliente;

    @Column
    private String id_venta;

    @Column
    private LocalDate fecha_salida;

    @Column 
    private LocalDate fecha_entrega;



}
