public class Desconto{
   
private double percentualDesconto;

public Desconto(double percentual){
percentualDesconto = percentual;
}

public double getpercentualDesconto(){
return percentualDesconto;
}

public void setpercentualDesconto(double percentual){
percentualDesconto = percentual;
}

public double calculaDesconto(double principal){
double desconto;
desconto =(principal*percentualDesconto)/100;

return desconto;
} 

}
