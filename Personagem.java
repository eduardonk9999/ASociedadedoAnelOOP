import java.util.List;

public class Personagem {
    final String nome;
    final String raca;
    final List<String> habilidades;
    final String arma;
    final String defesa;

    // COMBATE
    final int maxHp;
    final int xp;
    final int ataque;
    final int defesaCombate;
    private boolean defendendo;  


    public Personagem(String nome, String raca, List<String> habilidades, String arma, String defesa
    int maxHp, int ataque, int defendendo) {
        this.nome = nome;
        this.raca = raca;
        this.habilidades = habilidades;
        this.arma = arma;
        this.defesaDescricao = defesaDescricao;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.ataque = ataque;
        this.defendendo = defendendo;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public String getArma() {
        return arma;
    }

    public String getDefesa() {
        return defesa;
    }

    public void ataque() {
        System.out.println("Ataque padrão");
    }

    public int atacar(Personagem alvo) {
        int danoBruto = this.ataque;
        
    }


}
