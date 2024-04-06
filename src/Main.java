// Esdras Wilfredo Pérez Coloma | 7690-14-6737
// Clase Main

public class Main {

    public static void main(String[] args) {
        //grado minimo del Arbol B es t=3
        //Cada nodo soporta 2t hijos y 2t-1 claves
        int t = 3;
        //Se crea el arbol B segun t
        BTree arbolB = new BTree(t);

        //Valores a ingresar primera ronda
        int[] valoresUno = {23, 12, 44, 80, 17, 70, 25, 50};
        System.out.println("-- INICIO --");
        System.out.println("INSERTANDO VALORES AL ARBOL B");
        for (int i = 0; i < valoresUno.length; i++) {
            System.out.println("Insertando valor: " + valoresUno[i]);
            arbolB.insertar(valoresUno[i]);
        }

        //Mostrando arbol B por pantalla en preorder
        System.out.println("ESTADO ARBOL B");
        arbolB.showBTree();
        System.out.println("");
        
        //Buscar
        System.out.println("\nBuscando el nodo con el valor 12 en el arbol B:");
        arbolB.buscarNodoPorClave(12);

        System.out.println("\n-- FIN --");
    }
}
