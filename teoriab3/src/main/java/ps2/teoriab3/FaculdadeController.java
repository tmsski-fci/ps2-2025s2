package ps2.teoriab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FaculdadeController {
    @Autowired
    private FaculdadeRepo faculdadeRepo;
    @PostMapping("/dev/faculdades")
    private Faculdade criar(@RequestBody Faculdade f){
        return faculdadeRepo.save(f);
    }
    @GetMapping("/dev/faculdades")
    private Iterable<Faculdade> consultar(){
        return faculdadeRepo.findAll();
    }
}
