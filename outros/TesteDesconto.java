import javax.swing.*;
public class TesteDesconto{

public static void main(String [] args){

double desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do desconto: "));
Desconto des = new Desconto(desconto);
double principal = Double.parseDouble(JOptionPane.showInputDialog("Informe algo: "));
double resultado = des.calculaDesconto(principal);
JOptionPane.showMessageDialog(null,"O desconto é De: "+ resultado);
}

}