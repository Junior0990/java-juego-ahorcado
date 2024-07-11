public class arreglos {
    public static void main(String[] args)throws Exception {

        //ARREGLOS: estructuras de datos que tienen valores del mismo tipo bajo un mismo nombre
        //estos valores se distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un indice
        //LOS ARREGLOS SON TAMBIEN LLAMADOS VECTORES O MATRICES
        //DATO IMPORTANTE : EL INDICE SE EMPIEZA A CONTRA POR CERO Y NO POR UNO
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        
        
        //System.out.println(numeros[0]);
        //System.out.println(numeros[1]);
        //System.out.println(numeros[2]);
        //System.out.println(numeros[3]);
        //System.out.println(numeros[4]);

        //System.out.println(numeros.length);

    }
}
