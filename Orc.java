import java.util.List;

public class Orc extends Inimigo{

    public Orc(String nome) {
        super("Orc", "Orc", List.of("Força Bruta", "Agressividade"), "Machado enferrujado");
    }

    @Override
    public void ataqueEspecial(Personagem alvo) {
        System.out.println(getNome() + " ataca ferozmente " + alvo.getNome() + " com um golpe!");
    }
}
