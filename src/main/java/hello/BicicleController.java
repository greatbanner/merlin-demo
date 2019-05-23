package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BicicleController {
	
	private BiciclerBO bicicleBO;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    
    @PostMapping
    public Bicicle createBicicle(BicicleDTO dto) throws Exception {
      Bicicle bicicleToCreate =	BicicleTranslator.translateIntoBicicle(dto);
      
      return null;
    }
    
    @PutMapping
    public Bicicle editBicicle(BicicleDTO dto) throws Exception {
      Bicicle bicicleToEdit = BicicleTranslator.translateIntoBicicle(dto);
      return null;
    }
    
    @GetMapping
    public List<Bicicle> listBicicles() throws Exception {
      Bicicle bicicleToCreate =	BicicleTranslator.translateIntoBicicle(dto);
      return null;
    }
    
    @PostMapping
    public void editBicicle(int dto) throws Exception {
      Bicicle bicicleToCreate =	BicicleTranslator.translateIntoBicicle(dto);
      return null;
    }
}
