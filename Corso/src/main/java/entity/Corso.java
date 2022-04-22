package entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data

public class Corso {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "durata")
    private int durata;

    private long  id_docente;

}
