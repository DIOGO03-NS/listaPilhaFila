import java.util.Random;
import java.util.Stack;

public class Ex8 {
    public static void main(String[] args) {
        Stack<Integer> N = new Stack<>();
        Stack<Integer> P = new Stack<>();
        Random aleatorio = new Random();
        int min = -100;
        int max = 100; 

        for(int i = 0; i < 1000; i++){
            int num = aleatorio. nextInt((max - min) + 1) + min; ;
            if(num > 0){
                P.push(num);
            }else{
                if(num < 0){
                    N.push(num);
                }
                else{
                    if(num == 0){
                        System.out.println("NUMERO RETIRADO DA PILHA P: " + P.pop());
                        System.out.println("NUMERO RETIRADO DA PILHA N: " + N.pop());
                        System.out.println();
                    }
                }
            }
        }
    }
}
