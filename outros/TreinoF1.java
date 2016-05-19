import javax.swing.*;

public class TreinoF1
{
      private double[] tempos;
      
      public TreinoF1()
      {
         tempos = new double[20];
      }
      
      public void entradasDados()
      {
         for(int i = 0;i < tempos.length;i++)
         {
            tempos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite os tempo do Carro" + i));
         }
      } 
      
      public double retornaMelhorTempo(int mCarro)
      {
         double menorTempo = 0;
         for(int i = 0;i < tempos.length;i++)
         {
            double valor = tempos[i];
            
            if(valor < menorTempo)
            {
               menorTempo = valor;
               mCarro = i;
            }
         }
         return mCarro;
      }
      
      public double retornaPiorTempo(int pCarro)
      {
         double maiorTempo = 0;
         for(int i = 0;i < tempos.length;i++)
         {
            double valor = tempos[i];
            if(valor > maiorTempo)
            {  
               maiorTempo = valor;
               pCarro = i;
            }
         }
         return pCarro;
      }
      
      public void exibiMelhorEPior(String texto)
      {
         int menor = retornaMelhorTempo();
         int maior = retornaPiorTempo();
         
         texto = "Melhor Tempo Carro "+menor+" Pior Tempo Carro "+maior;
      }
}