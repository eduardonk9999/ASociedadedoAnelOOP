import java.util.List;

public abstract class Inimigo extends Personagem {
    public Inimigo(String nome, String raca, List<String> habilidades, String arma) {
        super(nome, raca, habilidades, arma, defesa);
    }

    public abstract void ataqueEspecial(Personagem alvo);
}
