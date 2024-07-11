import java.util.Scanner;

public class juegojava {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la maquina expendedora de bevidas");
        System.out.println("elegi una opcion de las siguientes");
        System.out.println("1. cafe ");
        System.out.println("2. mate");
        System.out.println("3. gaseosa");
        System.out.println("4. vino");
        
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Cafe! Buenisima opcion, depaso combina con el curso de java");
                break;
            case 2:
                System.out.println("Mate! debes ser argentino, uruguayo o paraguayo");
                break;
            case 3:
                System.out.println("Gaseosa! ten cuidado con el azucar");
                break;
            case 4:
                System.out.println("Vino! si tomaste vino no manejes por favor");
                break;
            
        
            default:
            System.out.println("Opcion no valida, fin del programa");
                break;
        }
        if (opcion <= 4){
            System.out.println("Disfrte de su bebida");
        }
        
        scanner.close();
    }
}
