package service;

import dto.CorsoDto;
import entity.Corso;

import java.util.List;

public interface CorsoService {

    CorsoDto findById(Integer id);

    List<CorsoDto> findAll();

    Corso delete(Integer id);

    Corso save(Corso area);
}

