package rpg.ifgoiano.rpg.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rpg.ifgoiano.rpg.entidade.Personagem;

@Repository
public interface PersRepositorio extends JpaRepository<Personagem, Long> {
    
}