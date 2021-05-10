
package Nodo;


public class PruebaArbol {
    public static void main(String[] args){
        Nodo raiz = new Nodo(104);
    Nodo nodo2 = new Nodo(71);
    Nodo nodo3 = new Nodo(240);
    Nodo nodo4 = new Nodo(17);
    Nodo nodo5 = new Nodo(108);
    nodo3.setNodoDerecho(new Nodo(245));
    nodo3.setNodoIzquierdo(new Nodo(108));
    nodo2.setNodoIzquierdo(new Nodo(17));
    nodo2.setNodoDerecho(new Nodo(19));
    nodo4.setNodoIzquierdo(new Nodo(3));
    nodo4.setNodoDerecho(new Nodo(18));
    nodo5.setNodoIzquierdo(new Nodo(110));
    raiz.setNodoIzquierdo(nodo2);
    raiz.setNodoDerecho(nodo3);
    nodo3.setNodoIzquierdo(nodo5);
    nodo2.setNodoIzquierdo(nodo4);
    
 
    //Resultado en pantalla
    System.out.println("Recorrido Preorden: ");
    preOrden(raiz);
    System.out.println("\nRecorrido Inorden: ");
    inorden(raiz);
    System.out.println("\nRecorrido PostOrden: ");
    posOrden(raiz);
    }
    //Metodo Preorden
  private static void preOrden(Nodo raiz) {
    if (raiz != null) {
      System.out.print(raiz.getDato() + " - ");
      preOrden(raiz.getNodoIzquierdo());
      preOrden(raiz.getNodoDerecho());
    }
  }
 
  //Metodo Inorden
  private static void inorden(Nodo raiz) {
    if (raiz != null) {
      inorden(raiz.getNodoIzquierdo());
      System.out.print(raiz.getDato()+ " - ");
      inorden(raiz.getNodoDerecho());
    }
  }
 
  //Metodo PostOrden
  private static void posOrden(Nodo raiz) {
    if (raiz != null) {
      posOrden(raiz.getNodoIzquierdo());
      posOrden(raiz.getNodoDerecho());
      System.out.print(raiz.getDato() + " - ");
    }
  }
}


