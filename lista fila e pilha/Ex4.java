import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Ex4 {
    public static Queue<Integer> inverter(Queue<Integer> fila){
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> filaRetorno = new LinkedList<>();
        int tamanho = fila.size();
        for(int i = 0; i <= tamanho; i++){
            pilha.push(fila.poll());
        }
        for(int i = 0; i <= tamanho; i++){
            filaRetorno.add(pilha.pop());
        }

        return filaRetorno;
    }

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Queue<Integer> filaInvertida = new LinkedList<>();

        for(int i = 0; i <100; i++){
            fila.add(i);
        }


        for(int i = 0; i <100; i++){
            System.out.println(filaInvertida.poll());
        }
        
    }
}
