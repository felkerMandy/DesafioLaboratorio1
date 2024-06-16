public class Shopping {
    String nome;
    Endereco endereco;
    Loja[] lojas;

    Shopping(String nome, Endereco endereco, int numeroMaximoLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[numeroMaximoLojas];
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return this.lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for(int i = 0; i < this.lojas.length; ++i) {
            if (this.lojas[i] == null) {
                this.lojas[i] = loja;
                return true;
            }
        }

        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for(int i = 0; i < this.lojas.length; ++i) {
            if (this.lojas[i] != null && this.lojas[i].getNome().equals(nomeLoja)) {
                this.lojas[i] = null;
                return true;
            }
        }

        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int contar = 0;
        if (tipoLoja == null) {
            return -1;
        } else {
            for(int i = 0; i < this.lojas.length; ++i) {
                if (tipoLoja != null) {
                    switch (tipoLoja.toLowerCase().trim()) {
                        case "cosmetico":
                            if (this.lojas[i] instanceof Cosmetico) {
                                ++contar;
                            }
                            break;
                        case "vestuario":
                            if (this.lojas[i] instanceof Vestuario) {
                                ++contar;
                            }
                            break;
                        case "bijuteria":
                            if (this.lojas[i] instanceof Bijuteria) {
                                ++contar;
                            }
                            break;
                        case "alimentação":
                            if (this.lojas[i] instanceof Alimentacao) {
                                ++contar;
                            }
                            break;
                        case "informática":
                            if (this.lojas[i] instanceof Informatica) {
                                ++contar;
                            }
                            break;
                        default:
                            return -1;
                    }
                }
            }

            return contar;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;
        double seguroMaisCaro = 0.0;
        Loja[] var4 = this.lojas;
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Loja loja = var4[var6];
            if (loja instanceof Informatica lojaInformatica) {
                double seguroAtual = ((Informatica)loja).getSeguroEletronicos();
                if (seguroAtual > seguroMaisCaro) {
                    lojaSeguroMaisCaro = lojaInformatica;
                    seguroMaisCaro = seguroAtual;
                }
            }
        }

        return lojaSeguroMaisCaro;
    }
}
