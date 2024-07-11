public class controlesflujo {
    
    public static void main(String[] args)throws Exception {


        int i;

        for(i = 1; i <= 10; i++){

            System.out.println(i);
            if (i == 5){
                //break; // nos sirve para cortar el bucle directamente   
                continue;
                //return; //para cerrar funciones
            }
            System.out.println(i);

        }

        
    }
}
