

package br.com.projeto.uso;

import br.com.projeto.dao.ClienteDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AlterarCliente {
    public static void main(String[]args){
        //Caminho do documento applicationContext.xml
        ApplicationContext ac = new ClassPathXmlApplicationContext("br/com/projeto/spring/applicationContext.xml");
        ClienteDao clientedao  = (ClienteDao) ac.getBean("clienteDaoJdbc"); //Pega os Métodos da Classe ClienteJdbc
        //Atualiza os dados do Usuário no Banco de Dados PostgreSQL
        clientedao.atualizarCliente(1,"Dalmo Facuri", "3651 1576","R. Vila Norma, 132", "Campinas, SP" , "15428392829");

    }
}
