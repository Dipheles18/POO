package tercerParcial;

class Excepciones {
    public static void main(String[] args){
        
        try{
          int num1= 10, num2=0;
        
        int resultado=num1/num2;
        System.out.println("El resultado es: "+ resultado);
        System.out.println("Buenos días");  
        } catch (Exception e) {
            System.out.println("Se ha producido un error: "+ e.toString());
        
      }
        System.out.println("Lo que quiera");
   }
}
