package rpg.ifgoiano.rpg.service;

import java.util.List;
import rpg.ifgoiano.rpg.entidade.Personagem;


public interface PersService {
     public List<Personagem> listarPersonagem();

    public void inserir(Personagem personagem);

    public Personagem obterPersonagem(Long id);

    public void alterarPersonagem(Personagem personagem);
}
