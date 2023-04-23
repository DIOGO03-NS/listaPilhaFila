import java.util.Scanner;
import java.util.Stack;

public class Ex2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> pilha = new Stack<String>();
        Stack<String> aux = new Stack<String>();

        pilha.push("bombinha");
        pilha.push("bombona");
        pilha.push("bombinha");
        pilha.push("jenyffer");
        pilha.push("diogo");
        pilha.push("emily ");
        pilha.push("gabriel");
        pilha.push("bombinha dnv");

        System.out.println("QUAL A CHAVE DO OBJETO QUE DESEJA REMOVER: ");
        int c = input.nextInt();

        for(int i = 0; i <= c; i ++){
            aux.push(pilha.pop());
            if(i == c){
                pilha.pop();
            }
        }

        for(int i = 0; i <= c-1; i ++){
            pilha.push(aux.pop());
        }

        for(String pessoa: pilha){
            System.out.println(pilha.peek());
            pilha.pop();
        }
        input.close();
        
    }
}