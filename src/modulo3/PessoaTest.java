package modulo3;

import modulo2.Atividade.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void testGetNome() {
        // Cria uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("Jessica", 25);
        // Atribuir um nome para a pessoa
        pessoa.setNome("Jess");
        // Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Jess", pessoa.getNome());
    }
}