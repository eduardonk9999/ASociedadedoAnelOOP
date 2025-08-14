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

    public int atacar(Personagem alvo) {
        int danoBruto = this.ataque;
        int dano = Math.max(1, danoBruto - alvo.defesa);
        if(alvo.defendendo) {
            dano = Math.max(0, dano / 2);
            alvo.defendendo = false;
        }
        alvo.receberDano(dano);
        System.out.println(nome + " ataca " + alvo.nome + " com " + arma + " causando " + dano + " de dano.");
        return dano;
    }

    public void receberDano(int dano) {
        this.hp = Math.max(0, this.hp - dano);
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
