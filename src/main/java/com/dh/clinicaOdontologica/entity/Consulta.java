package com.dh.clinicaOdontologica.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String consultaID;
    @Column (nullable = false)
    private Timestamp dataConsulta;
//    private LocalDateTime dataConsulta; //teste laiane
    @OneToOne(cascade = CascadeType.ALL)
//@JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "dentista_id")
    private Dentista dentista;
}
