import javax.swing.*;
import java.util.*;
public class TesteMensagens{
public static void main(String[] args){
String mensagens;
int quantidade;
//contador, calcula o n�mero de objetos   que tem na ArrayList 
BlocoDeMensagens me = new BlocoDeMensagens();
for (int contar = 1; contar <= 4;contar ++){
mensagens = JOptionPane.showInputDialog("Digite Mensagem! ");
me.armazenarMensagem(mensagens,telefone);
}

//Retorna o numero de objetos que tem a ArrayList
quantidade = me.quantidadeMensagens();
JOptionPane.showMessageDialog(null,"O numero de mensagens �: \n" +
quantidade);
mensagens = "";
for(int i = 0; i < quantidade; i++ ){
mensagens = mensagens + " " + me.retornarMensagem(i);
}

//mostra as mensagens  armazenadas na ArrayList
JOptionPane.showMessageDialog(null,mensagens);

int i = Integer.parseInt(JOptionPane.showInputDialog("D�gite o �ndice da mensagen a ser removida"));
if(i >= 0 && i < quantidade){
mensagens = me.removeMensagem(i);
}
else{
mensagens = "N�o existe �ndice";
}
JOptionPane.showMessageDialog(null,mensagens);
System.exit(0); 
}
}

