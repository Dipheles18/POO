import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
        
public class Tablas extends JFrame
    {
        public Tablas()
        {
            super("Tablas");
            DefaultTableModel modelo=new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Usuario");
            modelo.addColumn("Telefono");
            
            String[]p1={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p2={"Marco","Muniz","patitopelon", "99951485"};
            String[]p3={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p4={"Shelly","Garcia","nayvith", "9958181265"};
            String[]p5={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p6={"Marco","Muniz","patitopelon", "99951485"};
            String[]p7={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p8={"Shelly","Garcia","nayvith", "9958181265"};  
            String[]p9={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p10={"Marco","Muniz","patitopelon", "99951485"};
            String[]p11={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p12={"Shelly","Garcia","nayvith", "9958181265"};
            String[]p13={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p14={"Marco","Muniz","patitopelon", "99951485"};
            String[]p15={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p16={"Shelly","Garcia","nayvith", "9958181265"};
            String[]p17={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p18={"Marco","Muniz","patitopelon", "99951485"};
            String[]p19={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p20={"Shelly","Garcia","nayvith", "9958181265"};
            String[]p21={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p22={"Marco","Muniz","patitopelon", "99951485"};
            String[]p23={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p24={"Shelly","Garcia","nayvith", "9958181265"};
            String[]p25={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p26={"Marco","Muniz","patitopelon", "99951485"};
            String[]p27={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p28={"Shelly","Garcia","nayvith", "9958181265"};
            String[]p29={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p30={"Marco","Muniz","patitopelon", "99951485"};
            String[]p31={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p32={"Shelly","Garcia","nayvith", "9958181265"};
            String[]p33={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p34={"Marco","Muniz","patitopelon", "99951485"};
            String[]p35={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p36={"Shelly","Garcia","nayvith", "9958181265"};
            String[]p37={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p38={"Marco","Muniz","patitopelon", "99951485"};
            String[]p39={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p40={"Shelly","Garcia","nayvith", "9958181265"};
            String[]p41={"Eick","Sarmiento","mychip", "9935910711"};
            String[]p42={"Marco","Muniz","patitopelon", "99951485"};
            String[]p43={"Edri","Cuz","EstedriX", "9934646551"};
            String[]p44={"Shelly","Garcia","nayvith", "9958181265"};
            
            
            
            
            modelo.addRow(p1);
            modelo.addRow(p2);
            modelo.addRow(p3);
            modelo.addRow(p4);
            modelo.addRow(p5);
            modelo.addRow(p6);
            modelo.addRow(p7);
            modelo.addRow(p8);
            modelo.addRow(p9);
            modelo.addRow(p10);
            modelo.addRow(p11);
            modelo.addRow(p12);
            modelo.addRow(p13);
            modelo.addRow(p14);
            modelo.addRow(p15);
            modelo.addRow(p16);
            modelo.addRow(p17);
            modelo.addRow(p18);
            modelo.addRow(p19);
            modelo.addRow(p20);
            modelo.addRow(p21);
            modelo.addRow(p22);
            modelo.addRow(p23);
            modelo.addRow(p24);
            modelo.addRow(p25);
            modelo.addRow(p26);
            modelo.addRow(p27);
            modelo.addRow(p28);
            modelo.addRow(p29);
            modelo.addRow(p30);
            modelo.addRow(p31);
            modelo.addRow(p32);
            modelo.addRow(p33);
            modelo.addRow(p34);
            modelo.addRow(p35);
            modelo.addRow(p36);
            modelo.addRow(p37);
            modelo.addRow(p38);
            modelo.addRow(p39);
            modelo.addRow(p40);
            modelo.addRow(p41);
            modelo.addRow(p42);
            modelo.addRow(p43);
            modelo.addRow(p44);
            
            
            
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
            Tablas t1=new Tablas();
        }
}
