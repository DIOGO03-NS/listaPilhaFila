import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<Integer>();
        Queue<Integer> fila = new LinkedList<Integer>();

        for(int i = 0; i < 10; i++){
            System.out.println("DIGITE UM NUMERO ALEATORIO: ");
            int num = input.nextInt();
            fila.add(num);
        }
        for(int i = 0; i < 10; i++){
            if(fila.peek() > 0){
                pilha.push(fila.poll());
            }else{
                if(fila.peek() < 0){
                    System.out.println(fila.poll());
                }
            }
        }
        input.close();
    }
}
