public class Main {

    public static void print(String text) {
        System.out.println(text);
    }
    
    public static void main(String[] args) {
        
        // Pessoa p1 = new Pessoa("Kennyson", 19);
        
        // p1.apresentar();

        // p1.setNome("Kennyson Chaves Florencio");
        // p1.setIdade(20);

        // p1.apresentar();

        // System.out.println(p1.getNome());
        // System.out.println(p1.getIdade());

        // p1.setNome("Kennyn - Fortigato");
        
        // print(p1.getNome());
        

        Usuario user = new Usuario("Kennyson", 20);

        user.adicionarLivro("Os Segredos da Mente Milionaria");
        user.adicionarLivro("Pai Rico, Pai Pobre");

        user.mostrarHistorico();
        print("Nome: " + user.getNome() + " Idade: " + user.getIdade());

    }
}

   
