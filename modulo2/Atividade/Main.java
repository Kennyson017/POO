import java.util.Date;

public class Main {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {

        Date hoje = new Date();
        Date devolucao = new Date(hoje.getTime() + (7L * 24 * 60 * 60 * 1000));

        Autor autor001 = new Autor("Jessica Felix", "Desconhecida");
        Livro book001 = new Livro("Java for Beginners", autor001, "Tecnologia");
        Usuario user001 = new Usuario("Lucas Rafael", 25);
        Emprestimo loan001 = new Emprestimo(user001, book001, hoje, devolucao);
        
        Usuario user002 = new Usuario("Joao Miguel", 20);

        try {
            Emprestimo loan002 = new Emprestimo(user002, book001, hoje, devolucao);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        loan001.getAll();
    }
}
        


// TESTE DE APRENDIZADO


// public class Main {

//     public static void print(String text) {
//         System.out.println(text);
//     }

//     public static void main(String[] args) {

//         Pessoa p1 = new Pessoa("Kennyson", 19);

//         p1.apresentar();

//         p1.setNome("Kennyson Chaves Florencio");
//         p1.setIdade(20);

//         p1.apresentar();

//         System.out.println(p1.getNome());
//         System.out.println(p1.getIdade());

//         p1.setNome("Kennyn");

//         print(p1.getNome());

//         Usuario user = new Usuario("Kennyson", 20);

//         user.adicionarLivro("Os Segredos da Mente Milionaria");
//         user.adicionarLivro("Pai Rico, Pai Pobre");

//         user.mostrarHistorico();
//         print("Nome: " + user.getNome() + " Idade: " + user.getIdade());

//         Livro l0001 = new Livro("Pai Rico, Pai Probre", "Robert", "Finanças");

//         print(l0001.getAutor());
//         print(l0001.getTitulo());
//         print(l0001.getGenero());

//         Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "drama");
//         Usuario usuario = new Usuario("Kennyson", 20);
//         Date hoje = new Date(); // hoje
//         Date devolucao = new Date(hoje.getTime() + (7L * 24 * 60 * 60 * 1000)); // +7 dias

//         Emprestimo emprestimo = new Emprestimo(usuario, livro, hoje, devolucao);

//         System.out.println(emprestimo.getLivro());
//         System.out.println(emprestimo.getUsuario());
//         System.out.println(emprestimo.getDataRetirada());
//         System.out.println(emprestimo.getDataDevolucao());

//     }
// }