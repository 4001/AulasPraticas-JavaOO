import javax.swing.*;
public class Copo{

private double capacidade;
private int quantidadeCopos;

public Copo(){
capacidade = 100.0;
quantidadeCopos = 0;
}

public Copo(double cap){
if(cap > 0){
capacidade = cap;
}
else{
capacidade = 100.0;
}
}

public double getCapacidade(){
return capacidade;
}

public void setCapacidade(double capacidadeNova){
capacidade = capacidadeNova;
}

public double calculaNumeroCopos(double litros){
double copos = (litros*1000)/capacidade;

return copos;
}
   
}
