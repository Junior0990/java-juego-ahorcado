public class switchh {
    public static void main(String[] args) throws Exception {

        //¿que tipo de bebida te gusta?

        String bebida = "vino";

        switch (bebida) {
            case "cafe":
                System.out.println("Buenisima opcion, depaso combina con el curso de java");
                break;
            case "mate":
                System.out.println("debes ser argentino, uruguayo o paraguayo");
                break;
            case "gaseosa":
                System.out.println("tene cuidado con el azucar");
                break;
            case "vino":
                System.out.println("si tomaste vino no manejes por favor");
                break;
            
        
            default:
            System.out.println("Disfruta tu bebida");
                break;
        }

        //if (bebida == "cafe") {
           // System.out.println("Buenisima opcion, depaso combina con el curso de java");
        
       // }else if (bebida == "mate"){
           // System.out.println("debes ser argentino, uruguayo o paraguayo");

        
       // }else if (bebida == "gaseosa"){
           // System.out.println("tene cuidado con el azucar");   
        
       // }else if (bebida == "vino"){

           // System.out.println("si tomaste vino no manejes por favor");

        //}else {

           // System.out.println("Disfruta tu bebida");

        //}
        
        
    }
}
