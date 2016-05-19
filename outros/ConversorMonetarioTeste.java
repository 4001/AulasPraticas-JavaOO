import javax.swing.*;
public class ConversorMonetarioTeste{
  public static void main(String[] args){
    ConversorMonetario cm = new ConversorMonetario();
    
    double compra, venda,valor,valorConvertido;
   
    compra = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra: "));
    venda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da venda: ")); 
    
    cm.setValorCompra(compra);
    cm.setValorVenda(venda);
    
   JOptionPane.showMessageDialog(null, cm.imprimirValores());
   
   valor = Double.parseDouble(JOptionPane.showInputDialog(
            "Informe o valor a ser comprado em dolares: "));
   valorConvertido = cm.compraDolar(valor);
   JOptionPane.showMessageDialog(
             null,"Valor de compra em reais: " + valorConvertido);
   valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser vendida em dolares: "));
   valorConvertido = cm.venderDolar(valor);  
  }
  }