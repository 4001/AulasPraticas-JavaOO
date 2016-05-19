import javax.swing.*;
import java.util.*;
public class BlocoDeMensagens{
private ArrayList<String> mensagens;
//construtor padrão
public BlocoDeMensagens()
  {
    mensagens = new ArrayList<String>();//instancia o atributo acima
  }

//método que armazena mensagens
public void armazenarMensagem(String mensagem,int telefone)
  {
    mensagens.add(mensagem);
    mensagens.add(telefone);
  }

//método que retorna a quantidadwe de mensagens
public int quantidadeMensagens()
  {
    return mensagens.size();
  }

//método que retorna uma mensagen armazenada,dada a posição(índice)
public String retornarMensagem(int i)
  {
    return mensagens.get(i);
  }

//método que remove uma mensagem armazenada,dada a posição(índice)
public String removeMensagem(int i)
  {
    mensagens.remove(i);
  }

}