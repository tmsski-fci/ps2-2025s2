package ps2.teoriab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
    @Autowired
    private ProfessorRepo professorRepo;

    @PostMapping("/rest/professores")
    public Professor criar(@RequestBody Professor p){
        return professorRepo.save(p);
    }

    @GetMapping("/rest/professores")
    public Iterable<Professor> consultar(){
        return professorRepo.findAll();
    }

}
