public class Anel {
    private final String nome;
    private PortadorDoAnel portador;

    public Anel(String nome) {
        this.nome = nome;
    }

    public void setPortador(PortadorDoAnel portador) {
        this.portador = portador;
        portador.carregarAnel(this);
    }

    public String getNome() {
        return nome;
    }
}
