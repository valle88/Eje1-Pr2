import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Queque cola = new Queque();
        System.out.println("Introduza numeros Float o Q para salir");
        String valorUsuario = "";
        Scanner sc = new Scanner(System.in);

        while (!valorUsuario.equals("Q")){
            valorUsuario = sc.nextLine().toUpperCase();
            if (!valorUsuario.equals("Q")){
                cola.enquque(Float.parseFloat(valorUsuario));
            }
        }
        float suma= 0;
        while(cola.getCantidad() >0){
            suma += cola.dequque();
        }
        System.out.println("El valor final es: " +suma);
    }
}