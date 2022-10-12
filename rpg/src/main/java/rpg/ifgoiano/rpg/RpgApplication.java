package rpg.ifgoiano.rpg;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import rpg.ifgoiano.rpg.entidade.Personagem;
import rpg.ifgoiano.rpg.repositorio.PersRepositorio;

@SpringBootApplication
public class RpgApplication {
    
    @Autowired
    private PersRepositorio persRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(RpgApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
        Personagem domPedro = new Personagem();
        domPedro.setNome("Dom Pedro Primeiro");
        domPedro.setClasse("Placeholder");
        domPedro.setArma("Placeholder");
        domPedro.setAtaques("Placeholder");
        domPedro.setProfs("Placeholder");
        domPedro.setMagias("Placeholder");
        domPedro.setInvent("Placeholder");
        domPedro.setNivel(1);
        domPedro.setInl(1);
        domPedro.setCha(1);
        domPedro.setDex(1);
        domPedro.setCon(1);
        domPedro.setStr(1);
        domPedro.setWis(1);
        domPedro.setHpatual(1);
        domPedro.setHptotal(1);
        domPedro.setArmor(1);

        
        persRepositorio.save(domPedro);
        System.out.println("passou aqui");
    }

}
