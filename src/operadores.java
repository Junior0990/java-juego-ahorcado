public class operadores {
    public static void main(String[] args) throws Exception {

     // OPERADORES: simbolos que sirven para hacer operaciones con variables o valores   
    // ARITMETICOS:
    
    int a = 5;
    int b = 6;
    int c = a + b;

    System.out.println(c);

    int j = 12;
    int k = a % 2; // sirve para saber si un numero es par o impar

    System.out.println(b);

    //ASIGNACION
        int f = 4;
        f=10;
        f+=16;
        f+=46;
        f-=30;
        c*=2;
        c/=10;
        c++;
        c--;


        int n = 3;
        int m = 4;

        boolean esMayor = a > b;
        boolean esMenor = a < b;
        boolean esIgual = a == b;
        System.out.println(esMayor);
        System.out.println(esMenor);
        System.out.println(esIgual);


        //OPERADORES DE LOGICA

        boolean condicion1 = true;
        boolean condicion2 = false;

        boolean resultadoAND = condicion1 && condicion2; // ambos deben ser positivos para que de true 
        boolean resultadoOR = condicion1 || condicion2; // uno de los dos debe ser positivos para que de true
        boolean resultadoNOT = !condicion1;// lo opuesto a lo que tenga asignado previamente 

        System.out.println(resultadoAND);
        System.out.println(resultadoNOT);
        System.out.println(resultadoOR);
        
    }
}
