import javax.swing.*;
public class TesteCopo{
public static void main(String[] args){
double capacidade
Copo copo = new Copo(capacidade);
double litros = Double.parseDoule(JOptionPane.showInputDialog("Informe Litros! "));
double copos = copo.calculaNumeroCopos(Litros);
JOptionPane.showMessageDialog(null,"O número de copos è: "+copos );
}
}