

package br.com.projeto.uso;

import br.com.projeto.dao.ClienteDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PesquisaCliente {
    public static void main(String[]args){
        //Caminho do documento applicationContext.xml
         ApplicationContext ac = new ClassPathXmlApplicationContext("br/com/projeto/spring/applicationContext.xml");
         ClienteDao clientedao  = (ClienteDao) ac.getBean("clienteDaoJdbc");//Pega os Métodos da Classe ClienteJdbc
         //Pesquisa os dados do Usuário no Banco de Dados PostgreSQL
         //System.out.println(clientedao.mostrarCliente());
         System.out.println("Pelo código: " + clientedao.buscaClienteCodigo(7));

     }

}
