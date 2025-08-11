
public class Gandalf extends Personagem {
    public Gandalf(String nome) {
        super("Gandalf", "Mago", List.of("Cajado", "espada Glamdrin"), "Magia");
    }

    @Override
    public void ataqueEspecial(Personagem alvo) {
         System.out.println(getNome() + " ataca ferozmente " + alvo.getNome() + " com um golpe poderoso!")
    }
}