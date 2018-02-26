

package br.com.projeto.dao;
import br.com.projeto.beans.Cliente;

import java.util.List;

//Interface
public interface ClienteDao {
     //Métodos Abstratos
      void gravarCliente(String nome, String fone, String endereco, String cidade, String cpf);
      void atualizarCliente(Integer codigo, String nome, String fone, String endereco, String cidade, String cpf);
      void excluirCliente(Integer codigo);
      List<Cliente>mostrarCliente();
      List<Cliente>buscaClienteCodigo(Integer codigo);

}
