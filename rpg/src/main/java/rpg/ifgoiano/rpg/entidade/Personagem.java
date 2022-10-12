package rpg.ifgoiano.rpg.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Personagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String classe;
	
	@Column
	private String nome;
	
	@Column
	private Integer nivel;
	
	@Column
	private Integer str;
	
	@Column
	private Integer dex;
	
	@Column
	private Integer con;
	
    @Column
	private Integer inl;
	
	@Column
	private Integer wis;
	
	@Column
	private Integer cha;
	
	@Column
	private Integer armor;
	
	@Column
	private Integer hptotal;
	
	@Column
	private Integer hpatual;
	
	@Column
	private String arma;
	
	@Column 
	private String ataques;
	
	
	@Column
	private String profs;
	
	@Column 
	private String magias;
	
	@Column 
	private String invent;


	

    public String getAtaques() {
        return ataques;
    }

    public void setAtaques(String ataques) {
        this.ataques = ataques;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getStr() {
		return str;
	}

	public void setStr(Integer str) {
		this.str = str;
	}

	public Integer getDex() {
		return dex;
	}

	public void setDex(Integer dex) {
		this.dex = dex;
	}

	public Integer getCon() {
		return con;
	}

	public void setCon(Integer con) {
		this.con = con;
	}

	public Integer getInl() {
		return inl;
	}

	public void setInl(Integer inl) {
		this.inl = inl;
	}

	public Integer getWis() {
		return wis;
	}

	public void setWis(Integer wis) {
		this.wis = wis;
	}

	public Integer getCha() {
		return cha;
	}

	public void setCha(Integer cha) {
		this.cha = cha;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public Integer getHptotal() {
		return hptotal;
	}

	public void setHptotal(Integer hptotal) {
		this.hptotal = hptotal;
	}

	public Integer getHpatual() {
		return hpatual;
	}

	public void setHpatual(Integer hpatual) {
		this.hpatual = hpatual;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	

    public String getProfs() {
        return profs;
    }

    public void setProfs(String profs) {
        this.profs = profs;
    }

    public String getMagias() {
        return magias;
    }

    public void setMagias(String magias) {
        this.magias = magias;
    }

    public String getInvent() {
        return invent;
    }

    public void setInvent(String invent) {
        this.invent = invent;
    }
	
}
