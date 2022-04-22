package service;

import converter.CorsoConverter;
import dto.CorsoDto;
import entity.Corso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CorsoRepo;

import java.util.List;

@Service
public class CorsoServiceImpl implements CorsoService {

    @Autowired
    CorsoRepo corsoRepo;


    @Override
    public CorsoDto findById(Integer id) {
        Corso corso = corsoRepo.findById(id).get();
        CorsoConverter map = new CorsoConverter();
        return map.toDto(corso);
    }

    @Override
    public List<CorsoDto> findAll() {
        return null;
    }

    @Override
    public Corso delete(Integer id) {
        Corso corso = corsoRepo.findById(id).get();
        corsoRepo.delete(corso);
        return corso;
    }

    @Override
    public Corso save(Corso corso) {
        return corsoRepo.save(corso);
    }
}
