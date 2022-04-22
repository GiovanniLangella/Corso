package dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data

public class CorsoDto {

    private long id_docente;

    private String nome;

    private LocalDate data;

    private int durata;


}
