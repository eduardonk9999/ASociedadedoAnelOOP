public class Nazgul extends Inimigo{
    public Nazgul(String nome) {
        super("Nazgul", "Nazgul", List.of("Bestas Caida","Flechas Envenenadas"), "Lâminas de Morgu");
    }

    @Override
    public void ataqueEspecial(Personagem alvo) {
        System.out.println(getNome() + " ataca ferozmente " + alvo.getNome() + " com um golpe brutal!")
    }    


}
