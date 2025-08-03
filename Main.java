import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> habilidades = List.of("Roubo", "Furtividade", "Resistência ao anel");
        Frodo frodo = new Frodo("Frodo", "Hobbit", habilidades,"Ferroada" ,"Correr");

        Anel umAnel = new Anel("Um Anel");

        umAnel.setPortador(frodo);

        System.out.println("Arma de Frodo " + frodo.getArma());
        frodo.ataque();

        
    }
}
