public class Vestuario {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private boolean produtosImportados;

    Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
              Data dataFundacao, boolean produtosImportados){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.produtosImportados = produtosImportados;
    }

    public String getNome () {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataDeFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString(){
        return "Nome: return \"Nome da Loja: \" + this.nome + \"Tamanho da Loja: \" + this.tamanhoDaLoja() + \"Gastos com Salário:\"\n" +
    " + this.gastosComSalario() + \"Endereço: \" + this.endereco + \"Data de Fundação: \" + this.dataFundacao" + "Vende produtos importados?" + this.produtosImportados;
    }
}
