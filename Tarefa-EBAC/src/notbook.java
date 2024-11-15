// Classe que representa um objeto do mundo real: Carro
public class notbook {
    // Propriedades
    private String marca;
    private String cor;
    private int anoFabricacao;
    // Construtor para inicializar as propriedades do carro
    public notbook(String marca, String cor, int anoFabricacao) {
        this.marca = marca;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }
    // Metodo para obter o modelo
    public String getMarca() {
        return marca;
    }
    // Metodo para definir o modelo
    public void setMarca(String marca) {
        this.marca = marca;
    }
    // Metodo para obter a cor
    public String getCor() {
        return cor;
    }
    // Metodo para definir a cor
    public void setCor(String cor) {
        this.cor = cor;
    }
    // Metodo para obter o ano
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    // Metodo para definir o ano
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;

    }
}
