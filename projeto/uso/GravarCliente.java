

package br.com.projeto.uso;

import br.com.projeto.dao.ClienteDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class GravarCliente {
    public static void main(String[]args){
        //Caminho do documento applicationContext.xml
         ApplicationContext ac = new ClassPathXmlApplicationContext("br/com/projeto/spring/applicationContext.xml");
        ClienteDao clientedao  = (ClienteDao) ac.getBean("clienteDaoJdbc");//Pega os Métodos da Classe ClienteJdbc
        //Grava os dados do Usuário no Banco de Dados PostgreSQL
        clientedao.gravarCliente("Zilda Rocha", "3651 2379", "R. Pena Branca, 40", "Poços de Caldas, MG", "38200022718");

    }

}
