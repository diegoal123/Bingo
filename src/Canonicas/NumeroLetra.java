package Canonicas;

public class NumeroLetra {
     private int Numero;
     private char Letra;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.Numero;
        hash = 37 * hash + this.Letra;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NumeroLetra other = (NumeroLetra) obj;
        if (this.Numero != other.Numero) {
            return false;
        }
        if (this.Letra != other.Letra) {
            return false;
        }
        return true;
    }

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
