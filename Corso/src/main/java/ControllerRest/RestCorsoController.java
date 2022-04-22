package ControllerRest;


import dto.CorsoDto;
import entity.Corso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CorsoService;

import java.util.List;

@RestController
@RequestMapping("/api/corso")
public class RestCorsoController {
    @Autowired
    CorsoService corsoService;

    @GetMapping(value = "/{id}")
    public CorsoDto getById(@PathVariable("id") Integer id) {
        return corsoService.findById(id);
    }

    @GetMapping(value = "/lista")
    public List<CorsoDto> getAll() {
        return corsoService.findAll();
    }

    @PostMapping(value = "/newCorso")
    public void newCorso(@RequestBody Corso corso) {
        corsoService.save(corso);
    }

    @DeleteMapping(value = "/deleteCorso/{id}")
    public void deleteCorsoPerId(@PathVariable("id") Integer id) {
        corsoService.delete(id);
    }
}
