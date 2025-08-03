import java.util.List;

public class Frodo extends Personagem implements PortadorDoAnel {

    public Frodo(String nome, String raca, List<String> habilidades, String arma, String defesa) {
        super(nome, raca, habilidades, arma, defesa);
    }

    @Override
    public void carregarAnel(Anel anel) {
        System.out.println(nome + " agora carrega o " + anel.getNome() + ".");
    }

}
