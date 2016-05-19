public class Pessoa{

private double peso;
private double altura;

public Pessoa(double novoPeso,double novoAltura){
  peso = novoPeso;
  altura = novoAltura;
    if(peso <= 0 && altura <= 0){
      peso = 0;
      altura = 0;
}
}
public void setPeso(double nPeso){
  peso = nPeso;
  }
 
public void setAltura(double nAltura){
  altura = nAltura;
  }  
  
public double getPeso(){
  return peso;
  }
  
public double getAltura(){
  return altura;
  }  
//método que calcula imc
public void calculaImc(double imc){
  imc = peso/(altura*altura);
  }
  // Retorna imc
public double getImc(){
  return imc;
  }  
  //método que informa condição física
public String mostraCondicao(String condicao){
  if(imc < 18.5){
    JOptionPane.showMessageDialog(null,"Abaixo do peso ideal! ");  
  }else{
    if(imc == 18.5 && imc <= 24.9){
      JOptionPane.showMessageDialog(null,"Peso normal! ");
      }else{
        if(imc == 25.0 && imc <= 29.9){
          JOptionPane.showMessageDialog(null,"Acima do peso (sobrepeso)! ");
          }
        }
    }
  }  
}