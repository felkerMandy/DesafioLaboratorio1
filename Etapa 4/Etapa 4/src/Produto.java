public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(Data data) {
        this.dataValidade = this.dataValidade;
    }

    public boolean estaVencido(Data data) {
        if (data.getAno() > this.dataValidade.getAno()) {
            System.out.println("Produto vencido");
            return false;
        } else if (data.getAno() == this.dataValidade.getAno() && data.getMes() > this.dataValidade.getMes()) {
            System.out.println("Produto vencido");
            return false;
        } else if (data.getAno() == this.dataValidade.getAno() && data.getMes() == this.dataValidade.getMes() && data.getDia() > this.dataValidade.getDia()) {
            System.out.println("Produto vencido");
            return false;
        } else {
            System.out.println("Produto não vencido");
            return true;
        }
    }

    public String toString() {
        String var10000 = this.nome;
        return "Nome: " + var10000 + "Preço: " + this.preco + "Data de validade: " + String.valueOf(this.dataValidade);
    }
}
