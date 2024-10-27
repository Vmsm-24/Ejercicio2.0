public class Main {
    public static void main(String[] args) {
        // Creacion de Objeto - Instanciar una clase
        Automovil bmw = new Automovil("Mercedes Benz");
        //bmw.setMarca("BMW");
        bmw.setColor("i220");
        bmw.setColor("Negro");
        bmw.setCilindraje(2.2f);
        //System.out.println(("bmw.leerMarca() ="+ bmw.getMarca());
       /* System.out.println("bmw.getMarca = " + bmw.getMarca());
        System.out.println("bmw.getModelo() = " + bmw.getModelo());
        System.out.println("bmw.getColor= " +bmw.getColor());
        System.out.println("bmw.getCilindraje() = " + bmw.getCilindraje());*/
        System.out.println("bmw.detalleVec() = " + bmw.detalleVec());

    }
}