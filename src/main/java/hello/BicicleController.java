package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BicicleController {
	
	private BiciclerBO bicicleBO;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    
    @PostMapping
    public Bicicle createBicicle(BicicleDTO dto) {
      Bicicle bicicleToCreate =	BicicleTranslator.translateIntoBicicle(dto);
    	
    }
}
