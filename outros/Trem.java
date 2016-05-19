import javax.swing.*;

public class Trem
{
   private int[] vagoes;
   
   public Trem()
   {
      vagoes = new int[15];
   }
   
   public void entradaDePassageiros()
   {
      for(int i = 0;i < vagoes.length;i++)
      {
         vagoes[i] = Integer.parseInt(JOptionPane.showInputDialog("Informar quantidade de passageiros do vagao."));
      }
   }
   
   public int retornaMaior()
   {
      int maior = 0;
      for(int i = 0;i < vagoes.length;i++)
      {         
         int recebe =  vagoes[i];
         
         if(recebe > maior)
         {
            maior = recebe;
         }
      }
      return maior;
   } 
}