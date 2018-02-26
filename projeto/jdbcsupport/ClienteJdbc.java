
package br.com.projeto.jdbcsupport;

import br.com.projeto.beans.Cliente;
import br.com.projeto.dao.ClienteDao;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

//Classe ClienteJdbc herda os Métodos da Classe SimpleJdbcDaoSupport(extends)
//Classe ClienteJdbc implementa os Métodos da Interface ClienteDao(implements)
public class ClienteJdbc extends SimpleJdbcDaoSupport implements ClienteDao {

    //Sobrescrevendo os Métodos(@Override)
    public void gravarCliente(String nome, String fone, String endereco, String cidade, String cpf) {
        getSimpleJdbcTemplate().update("insert into cliente(nome, fone, endereco, cidade, cpf) values(?, ?, ?, ?, ?)", nome, fone, endereco, cidade, cpf);
        JOptionPane.showMessageDialog(null, "Gravou com Sucesso");
    }

    public void atualizarCliente(Integer codigo, String nome, String fone, String endereco, String cidade, String cpf) {
         getSimpleJdbcTemplate().update("update  cliente set nome = ?, fone = ?, endereco = ?, cidade = ?, cpf = ? where id = ?", nome, fone, endereco, cidade, cpf, codigo);
         JOptionPane.showMessageDialog(null, "Atualizou com Sucesso");
    }

    public void excluirCliente(Integer codigo) {
         getSimpleJdbcTemplate().update("delete from cliente where id = ?", codigo);
         JOptionPane.showMessageDialog(null, "Excluiu com Sucesso");
    }

    public List<Cliente> mostrarCliente() {
        return (List) getSimpleJdbcTemplate().queryForList("select* from cliente");
       
     }
      

    public List<Cliente> buscaClienteCodigo(Integer codigo) {
         return (List) getSimpleJdbcTemplate().queryForList("select* from cliente where id = ?", codigo);
       
        }


    }











