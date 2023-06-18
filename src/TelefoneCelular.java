public class TelefoneCelular {
    private String cor;
    private String marca;
    private String modelo;
    private float preco;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void fazerLigacao() {
        System.out.println("Fazendo ligação");
    }

    /**
     * Metodo para atender ligacao no telefone celular
     */
    public void atenderLigacao() {
        System.out.println("Atendendo ligação");
    }

    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }
}
