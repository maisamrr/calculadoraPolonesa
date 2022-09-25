import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Pilha pilha = new Pilha();

        Scanner scanInput = new Scanner(System.in);

        System.out.println("\n*** CALCULADORA POLONESA ***\nInsira a operação desejada na notação polonesa, com os termos separados por espaços.\nPor exemplo, 2 2 + ou 65 8 *");
        System.out.println("\nDigite a operação desejada:");
        String operacaoUsuario = scanInput.nextLine();

        String[] listaDeElementosSeparados = operacaoUsuario.split(" ");

        for(String s:listaDeElementosSeparados){
            double resultado = 0;
            switch (s) {
                case "*":
                    resultado = pilha.desempilha() * pilha.desempilha();
                    pilha.empilha(resultado);
                    break;
                case "/":
                    resultado = pilha.desempilha() / pilha.desempilha();
                    pilha.empilha(resultado);
                    break;
                case "+":
                    resultado = pilha.desempilha() + pilha.desempilha();
                    pilha.empilha(resultado);
                    break;
                case "-":
                    resultado = pilha.desempilha() - pilha.desempilha();
                    pilha.empilha(resultado);
                    break;
                default:
                    pilha.empilha(Double.parseDouble(s));
                }
        }
        System.out.println("Resultado = " + pilha.desempilha());
    }
}