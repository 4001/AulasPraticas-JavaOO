public class ConversorMonetario{
 private double valorCompra;
 private double valorVenda;
 
 public ConversorMonetario(){
   valorCompra = 1.0;
   valorVenda = 1.0;
 }
 
 public void setValorCompra(double valorC){
   valorCompra = valorC;
 }
   
 public void setValorVenda(double valorV){
   valorVenda = valorV;
 }  
 
 public double getValorCompra(){
   return valorCompra;
 }
 
 public double getValorVenda(){
   return valorVenda;
 } 
 
 public String imprimirValores(){
   String retorno;
   retorno = "Valor Compra: " + valorCompra + "Valor Venda: " + valorVenda;
   
   return retorno;
 }
 
 public double compraDolar(double valorC){
 double resultado = valorC*valorCompra;
 
 return resultado;
 }
 
 public double venderDolar(double valorV){
 double resultado = valorV*valorVenda;
 
 return resultado;
}
}