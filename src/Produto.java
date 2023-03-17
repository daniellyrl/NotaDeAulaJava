public class Produto {
    private String nome;
    private int codigo;
    private int quantidade;
    private int decrementoEstoque;
    private int calculoDecremento;
    private int qVendida;


    public void setqVendida(int qVendida) {
        this.qVendida = qVendida;
    }

    public int getqVendida() {
        return qVendida;
    }

    public void setDecrementoEstoque(int decrementoEstoque) {
        this.decrementoEstoque = decrementoEstoque;
    }

    public int getDecrementoEstoque() {
        return decrementoEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void calculoDecremento() {
        quantidade = quantidade - qVendida;
    }
}

