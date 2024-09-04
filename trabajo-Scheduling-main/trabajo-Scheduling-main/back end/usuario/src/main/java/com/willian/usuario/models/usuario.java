package com.willian.usuario.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class usuario {
    
    @Id
	@GeneratedValue(strategy =GenerationType.UUID)
	@Column(name="id", nullable=false, length = 36)
	private String id;

    @Column(name = "tipo_documento", nullable = false)
    // @NotEmpty(message = "La fecha de la multa no puede estar vacía")
    private String tipo_documento;

    @Column(name = "numero_de_documento", nullable = false)
    private String numero_documento;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fecha_de_nacimiento", nullable = false)
    private Date fecha_nacimiento;

    @Column(name = "contraseña", nullable = false)
    private String contrasena;

    
    @Column(name = "fecha_ultima_actualizacion_contrasena", nullable = false)
    private Date fecha_ultima_act_contrasena;

    @Column(name = "fecha_del_ultimo_inicio_sesion", nullable = false)
    private Date fecha_ultimo_inicio_sesion;

    @Column(name = "correo_electronico", nullable = false)
    private String correo_electronico;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    public void setFecha_ultima_actualizacion_contrasena(Date fecha_ultima_act_contrasena) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFecha_del_ultimo_inicio_sesion(Date fecha_ultimo_inicio_sesion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFecha_ultima_actulizacion_contrasena(Date date) {
        throw new UnsupportedOperationException("Not supported yet.");
    }




}
