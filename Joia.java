public class Joia {
    private double valor;
    private double peso;
    private String material;
    private int quantidadeEstoque;
    private String tipo;

    public Joia(double valor, double peso, String material, int quantidadeEstoque, String tipo) {
        this.valor = valor;
        this.peso = peso;
        this.material = material;
        this.quantidadeEstoque = quantidadeEstoque;
        this.tipo = tipo;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para exibir informações sobre a joia
    public void exibirInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("Peso: " + peso);
        System.out.println("Material: " + material);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("----------------------------");
    }
}