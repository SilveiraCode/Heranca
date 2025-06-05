public class Grimorio extends Item {
    private String autor;
    private int numeroPaginas;
    private boolean capaDura;

    public Grimorio(String nome, double preco, String autor, int numeroPaginas, boolean capaDura) {
        super(nome, preco);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.capaDura = capaDura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Capa Dura: " + (capaDura ? "Sim" : "Não"));
    }
}
