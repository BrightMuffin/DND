package rpg.ifgoiano.rpg.controle;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import rpg.ifgoiano.rpg.entidade.Personagem;
import rpg.ifgoiano.rpg.service.*;


@Controller
public class PersController{
    private final PersService persServiceImpl;

    public PersController(PersServiceImpl persServiceImpl){
        this.persServiceImpl = persServiceImpl;
   
    }
    
    @GetMapping("/personagem")
    public String listarPers(Model model){
        
        model.addAttribute("personagem", persServiceImpl.listarPersonagem());
        
        return "home"; 
        
    }

    
    
    @GetMapping("/personagem/novo")
    public String abrirNovoPersonagem(Model model) {
        Personagem personagem = new Personagem();
        
        model.addAttribute("personagem", personagem);
        
        return "inserir-personagem";
    }
    
    @PostMapping("/personagem/inserir")
    public String inserir(Personagem personagem) {
        
        this.persServiceImpl.inserir(personagem);
        return "redirect:/personagem";
    }
    
}