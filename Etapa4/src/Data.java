import java.time.Year;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (this.verificarData(dia, mes, ano)) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data Inválida.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean verificaAnoBissexto() {
        return Year.isLeap(this.ano);
    }

    private boolean verificarData(int dia, int mes, int ano) {
        if (dia <= 0) {
            return false;
        } else if (mes <= 0 || mes > 12) {
            return false;
        } else if (ano <= 0) {
            return false;
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
            return false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        } else if ((mes == 2 && verificaAnoBissexto() && dia > 29) || (mes == 2 && !verificaAnoBissexto() && dia > 28)) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return "Dia = " + this.dia + "\nMes = " + this.mes + "\nAno = " + this.ano;
    }
}