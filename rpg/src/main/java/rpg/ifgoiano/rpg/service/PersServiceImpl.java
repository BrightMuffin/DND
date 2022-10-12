package rpg.ifgoiano.rpg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rpg.ifgoiano.rpg.entidade.Personagem;
import rpg.ifgoiano.rpg.repositorio.PersRepositorio;

@Service
public class PersServiceImpl implements PersService{
    
    static List<Personagem> pers = new ArrayList<Personagem>();
    
    @Autowired
    private PersRepositorio persRepository;

    @Override
    public List<Personagem> listarPersonagem() {
        return persRepository.findAll();
    }

    @Override
    public void inserir(Personagem personagem) {
        this.persRepository.save(personagem);
      
    }

    @Override
    public Personagem obterPersonagem(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void alterarPersonagem(Personagem personagem) {
        // TODO Auto-generated method stub
        
    }   

}
