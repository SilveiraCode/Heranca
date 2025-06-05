public class Tunica extends Item {
    private String cor;
    private String tamanho;
    private String material;

    public Tunica(String nome, double preco, String cor, String tamanho, String material) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Material: " + material);
    }
}
