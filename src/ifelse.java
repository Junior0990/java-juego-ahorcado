public class ifelse {
    public static void main(String[] args) throws Exception {

        int edad = 70    ;

        if (edad> 18 && edad <= 60 ) {
            System.out.println("Puedes entrar a la disco");

            
        }else if (edad > 60) {
            System.out.println("No puedes entrar, ya que no es para mayores de 60 años");

        }else if (edad == 18) {
            System.out.println("Tienes la edad justa para entrar a la disco");


        }else {
            System.out.println("No tienes edad suficiente para entrar a la disco");

        }

    }
}
