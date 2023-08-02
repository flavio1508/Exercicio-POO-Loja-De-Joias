import java.util.ArrayList;
import java.util.List;

public class FabricaDeJoias {
    private List<Joia> listaDeJoias;

    public FabricaDeJoias() {
        listaDeJoias = new ArrayList<>();
    }

    // Método para adicionar uma nova joia à lista
    public void adicionarJoia(Joia joia) {
        listaDeJoias.add(joia);
        System.out.println("Joia adicionada com sucesso!");
    }

    // Método para buscar joias por tipo
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

    // Método para encontrar o tipo de joia com maior valor
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