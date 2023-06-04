class Aresta implements Comparable<Aresta> {
    //Atributos
    public String origem;
    public String destino;
    public int valor;

    //Construtor
    public Aresta(String origem, String destino,int valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    //CompareTo
    @Override
    public int compareTo(Aresta outraAresta) {
        return Integer.compare(this.valor, outraAresta.valor);
    }
}