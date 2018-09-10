package Canonicas;

public class NumeroLetra {
     private int Numero;
     private char Letra;

    public NumeroLetra(int Numero, char Letra) {
        this.Numero = Numero;
        this.Letra = Letra;
    }

    public NumeroLetra() {
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getLetra() {
        return Letra;
    }
}
