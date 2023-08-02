import java.util.ArrayList;
import java.util.List;

public class FabricaDeJoias {
    private List<Joia> listaDeJoias;

    public FabricaDeJoias() {
        listaDeJoias = new ArrayList<>();
    }

    public void adicionarJoia(Joia joia) {
        listaDeJoias.add(joia);
        System.out.println("Joia adicionada com sucesso!");
    }

    public void buscarJoiaPorTipo(String tipo) {
        boolean encontrada = false;
        for (Joia joia : listaDeJoias) {
            if (joia.getTipo().equalsIgnoreCase(tipo)) {
                joia.exibirInfo();
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("Nenhuma joia do tipo '" + tipo + "' encontrada.");
        }
    }

    public String encontrarTipoDeJoiaMaisCara() {
        double valorMaximo = 0;
        String tipoJoiaMaisCara = "";
        for (Joia joia : listaDeJoias) {
            if (joia.getValor() > valorMaximo) {
                valorMaximo = joia.getValor();
                tipoJoiaMaisCara = joia.getTipo();
            }
        }
        return tipoJoiaMaisCara;
    }
}