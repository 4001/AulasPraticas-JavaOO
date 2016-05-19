import javax.swing.*;
 public class EquacaoSegundoGrau{
  private double a;
  private double b;
  private double c;
  
  public EquacaoSegundoGrau(){
  }
  
  public EquacaoSegundoGrau(double a, double b,double c){
    setA(a);
    setB(b);
    setC(c);
    }
  
  public void set(double valorA){
    while(valorA == 0){
      valorA = Double.parseDouble(JOptionPane.showInputDialog("Insira A: "));  
      } 
      a = valorA;
   }
   
  public void setA(double valorA){
    a = valorA;
  } 
   
   public void setB(double valorB){
    b = valorB;
  }
  
  public void setC(double valorC){
    c = valorC;
   }
   
   //fazer método de acesso
   
   public double delta(){
     double d = b*b - 4*a*c;
     
     return d;
   }
   
   public boolean temRaizesReais(){
   if(delta() >= 0) {
     return true;
     }
     else{
       return false;
       }
   }
   
   public String raizesReais(String retorno){
     if(temRaizesReais() == true){
       double d,x1,x2;
       d = delta();
       x1 = (-b + Math.sqrt(d))/(2*a); 
       x2 = (-b + Math.sqrt(d))/(2*a);
       retorno = "x1 = " + x1 + "\n" +"x2 = " + x2;
     }
   }
}

