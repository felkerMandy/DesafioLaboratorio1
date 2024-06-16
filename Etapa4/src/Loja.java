public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1.0;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return this.dataFundacao;
    }

    public void setDataFundacao(Data dataDeFundacao) {
        this.dataFundacao = this.dataFundacao;
    }

    public char tamanhoDaLoja() {
        if (this.quantidadeFuncionarios > 0 && this.quantidadeFuncionarios < 10) {
            return 'P';
        } else {
            return (char)(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30 ? 'M' : 'G');
        }
    }

    public Produto[] getEstoqueProdutos() {
        return this.estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public double gastosComSalario() {
        if (this.salarioBaseFuncionario == -1.0) {
            return -1.0;
        } else {
            double gastosComSalario = this.salarioBaseFuncionario * (double)this.quantidadeFuncionarios;
            return gastosComSalario;
        }
    }

    public void imprimeProdutos() {
        Produto[] var1 = this.estoqueProdutos;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Produto produto = var1[var3];
            if (produto != null) {
                System.out.println(produto);
            }
        }

    }

    public boolean insereProduto(Produto produto) {
        for(int i = 0; i < this.estoqueProdutos.length; ++i) {
            if (this.estoqueProdutos[i] == null) {
                this.estoqueProdutos[i] = produto;
                return true;
            }
        }

        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for(int i = 0; i < this.estoqueProdutos.length; ++i) {
            if (this.estoqueProdutos[i] != null && this.estoqueProdutos[i].getNome().equals(nomeProduto)) {
                this.estoqueProdutos[i] = null;
                return true;
            }
        }

        return false;
    }

    public String toString() {
        String var10000 = this.nome;
        return "Nome da Loja: " + var10000 + "Tamanho da Loja: " + this.tamanhoDaLoja() + "Gastos com Salário:" + this.gastosComSalario() + "Endereço: " + String.valueOf(this.endereco) + "Data de Fundação: " + String.valueOf(this.dataFundacao) + "Quantidade de Estoque: " + String.valueOf(this.estoqueProdutos);
    }
}
