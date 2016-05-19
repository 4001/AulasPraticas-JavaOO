public class Transporte
{
   private double[] distancias;
   private double[] custoPorKm;
   
   public Transporte()
   {
      distancias = new double[26];
      custoPorKm = new double[26];
   }
   
   public double soma()
   {
      double soma = 0;
      for(int i = 0;i <= 26;int ++)
      {
         soma = distancias[i] * custoPorKm[i];
      }
      return soma;
   }
}