public class Item {
    protected String nome;
    protected double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}
