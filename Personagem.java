import java.util.List;

public class Personagem {
    final String nome;
    final String raca;
    final List<String> habilidades;
    final String arma;
    final String defesa;


    public Personagem(String nome, String raca, List<String> habilidades, String arma, String defesa) {
        this.nome = nome;
        this.raca = raca;
        this.habilidades = habilidades;
        this.arma = arma;
        this.defesa = defesa;
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


}
