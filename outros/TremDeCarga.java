import javax.swing.J0ptionPane;
public class TremDeCarga

   private double[] vagoes;
   
  public TremDeCarga()
  {
      vagoes = new double[32]; 
  }
   
  public void entradaDeCarga()
  {
      for(int i = 0;i < vagoes.length; i++)
      {
         vagoes[i] = JOptionPane.showInputDialog("informar quantidade de toneladas no vagao.");
      }
  }
  
  public double valorTotal(double preco)
  {   
      double cargaTotal = 0;
      
      for(int i = 0;i < vagoes.length ;i++)
      {
         cargaTotal += vagoes[i];        
      }
      
      preco = JOptionPane.showInputDialog("Informe valor do frete.");
      
      double valorTotal = cargaTotal * preco;     
      
      return valorTotal;
  }  
}