package micro.microservicios2.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

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
    private String id_envio;

    @Column (length = 250, nullable = false)
    private String destino;

    @Column (length = 250, nullable = false)
    private String estado;

    @Column (length = 250, nullable = false)
    private String origen;

    @Column (length = 50, nullable = false)
    private String nombre_conductor;

    @Column (length = 50, nullable = false)
    private String apellido_conductor;

    @Column (length = 100, nullable = false)
    private String id_conductor;

    @Column (length = 250, nullable = false)
    private String id_cliente;

    @Column(length = 250, nullable = false)
    private String id_venta;

    @Column (nullable = false)
    private LocalDate fecha_salida;

    @Column (nullable = false)
    private LocalDate fecha_entrega;



}
