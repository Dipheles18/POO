import java.util.Scanner;
public class PruebasMatriz2 {
    public static void main(String[] args) {
        String prod[]=new String [25];
        prod[0]="Coca";
        prod[1]="Fanta";
        prod[2]="Sprite";
        prod[3]="Pepsi";
        prod[4]="Ruffles";
        prod[5]="Doritos";
        prod[6]="Rancheritos";
        prod[7]="M&M's";
        prod[8]="Bubulubu";
        prod[9]="CarlosV";
        prod[10]="Agua";
        prod[11]="Esquite";
        prod[12]="Horchata";
        prod[13]="Jamaica";
        prod[14]="Chokis";
        prod[15]="Picafresa";
        prod[16]="Rellerindo";
        prod[17]="Paketaxo";
        prod[18]="Chips";
        prod[19]="Runners";
        prod[20]="Lays";
        prod[21]="Tostitos";
        prod[22]="Roles";
        prod[23]="Nito";
        prod[24]="Palomitas";
        String num[][]=new String[3][3];
        Scanner entra= new Scanner(System.in);
        
        for(int i=0;i<num.length;i++){
          for( int j=0;j<num[i].length;j++){
            int numero=(int)(Math.random()*25+1);
            num[i][j]=prod[numero]+"-"+i+","+j;
              }
        }
        
        
        
        System.out.println("LISTA DE PRODUCTOS");
        for(int i=0;i<num.length;i++){
                for(int j=0;j<num[i].length;j++){
                    System.out.print(num[i][j]+"|");
                }
                System.out.println();
            }
        
        
        System.out.println("Ingresa la cordenada del producto x,y");
        String z=entra.next();
        String[] parts = z.split(",");
        
        String x1= parts[0];
        String y= parts[1];
        int w=Integer.parseInt(x1);
        int v=Integer.parseInt(y);
        
        
        String[] parts2 = num[w][v].split("-");
        String part1 = parts2[0];
        String part2= parts2[1];
        System.out.println(part1);
    }
    
        
    
}