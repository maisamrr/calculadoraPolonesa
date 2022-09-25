import java.util.Arrays;

public class Pilha {
    private double[] elementos;
    private int posicao;
    public double topo;

    public Pilha() {
        this.elementos = new double[100];
        this.posicao = -1;
    }

    public void empilha(double novoElemento) {
        if (this.posicao < this.elementos.length - 1) {
            this.elementos[++posicao] = novoElemento;
        }
    }

    public double desempilha() {
        if(estaVazia()) {
            System.exit(0);
        }
        return this.elementos[this.posicao--];
    }

    public boolean estaVazia() {
        if(this.posicao == -1) {
            return true;
        }
        return false;
    }

}