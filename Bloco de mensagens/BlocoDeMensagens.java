import javax.swing.*;
import java.util.*;
public class BlocoDeMensagens{
private ArrayList<String> mensagens;
//construtor padr�o
public BlocoDeMensagens()
  {
    mensagens = new ArrayList<String>();//instancia o atributo acima
  }

//m�todo que armazena mensagens
public void armazenarMensagem(String mensagem,int telefone)
  {
    mensagens.add(mensagem);
    mensagens.add(telefone);
  }

//m�todo que retorna a quantidadwe de mensagens
public int quantidadeMensagens()
  {
    return mensagens.size();
  }

//m�todo que retorna uma mensagen armazenada,dada a posi��o(�ndice)
public String retornarMensagem(int i)
  {
    return mensagens.get(i);
  }

//m�todo que remove uma mensagem armazenada,dada a posi��o(�ndice)
public String removeMensagem(int i)
  {
    mensagens.remove(i);
  }

}