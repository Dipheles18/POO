import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
        
public class MaquinaVersion2 extends JFrame
    {
        public MaquinaVersion2()
        {
            
            super("Máquina expendedora");
            DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("Combinación1");
            modelo.addColumn("Combinación2");
            modelo.addColumn("Combinación3");
            modelo.addColumn("Combinación4");
            {
            
        String productos[]=new String [10];
        productos[0]="Jugo de Melón";
        productos[1]="Jugo de Zanahoria";
        productos[2]="Jugo de Manzana";
        productos[3]="Jugo de Plátano";
        productos[4]="Jugo de Fresa";
        productos[5]="Jugo de Jengibre con miel";
        productos[6]="Jugo de Amaranto";
        productos[7]="Jugo de Kiwi";
        productos[8]="Jugo de Betabel";
        productos[9]="Jugo de Papaya";

        String matriz[][]=new String[2][2];
        Scanner entrada= new Scanner(System.in);
        for(int i=0;i<matriz.length;i++){  
          for( int j=0;j<matriz[i].length;j++){
            int numero=(int)(Math.random()*10+1);
            matriz[i][j]="#"+i+j+" "+productos[numero];
              }
        }
        System.out.println("Lista de la máquina");
        for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print(matriz[i][j]+" - ");
                }
                System.out.println();
            }
        System.out.println("Ingresa el código del producto");
        String codigo=entrada.next();
        String[] partes = codigo.split("");
        
        String codigo1= partes[0];
        String codigo2= partes[1];
        int codigo1_1=Integer.parseInt(codigo1);
        int codigo2_2=Integer.parseInt(codigo2);
        
        String[] busqueda = matriz[codigo1_1][codigo2_2].split("-");
        String codresul = busqueda[0]; 
        System.out.println(codresul);
        
         }   
            String[]p1={"Jugo de Melón","Jugo de Zanahoria","Jugo de Manzana", "Jugo de Plátano"};
            String[]p2={"Jugo de Fresa","Jugo de Jengibre con miel","Jugo de Amaranto", "Jugo de Kiwi"};
            String[]p3={"Jugo de Betabel","Jugo de Papaya","Jugo de Melón", "Jugo de Zanahoria"};
            String[]p4={"Jugo de Manzana","Jugo de Plátano","Jugo de Fresa", "Jugo de Jengibre con miel"};
            String[]p5={"Jugo de Amaranto","Jugo de Kiwi","Jugo de Betabel", "Jugo de Papaya"};
            String[]p6={"Jugo de Melón","Jugo de Zanahoria","Jugo de Fresa", "99951485"};
            String[]p7={"Jugo de Fresa","Jugo de Jengibre con miel","Jugo de Kiwi", "Jugo de Papaya"};
            String[]p8={"Jugo de Betabel","Jugo de Papaya","Jugo de Fresa", "Jugo de Amaranto"};  
                  
            
            modelo.addRow(p1);
            modelo.addRow(p2);
            modelo.addRow(p3);
            modelo.addRow(p4);
            modelo.addRow(p5);
            modelo.addRow(p6);
            modelo.addRow(p7);
            modelo.addRow(p8);
            
            JTable tabla=new JTable(modelo);
            JScrollPane scroll=new JScrollPane(tabla);
            tabla.setBounds(0,0,600,600);
            setSize(630,650);
            scroll.setBounds(0,0,600,600);
            add(scroll);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);
            setVisible(true);
    }  
        public static void main(String[] args){
            MaquinaVersion2 t1=new MaquinaVersion2();
        }
}
