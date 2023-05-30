class Aresta implements Comparable<Aresta> {
    //Atributos
    public String origem;
    public String destino;
    public int km;
    public int custo;
    public int valor;

    //Construtor
    public Aresta(String origem, String destino, int km, int custo) {
        this.origem = origem;
        this.destino = destino;
        this.custo = custo;
        this.km = km;
        this.valor = (int) (km * 0.1 + custo * 0.9);
    }

    //CompareTo
    @Override
    public int compareTo(Aresta outraAresta) {
        if (this.valor != outraAresta.valor) {
            return Integer.compare(this.valor, outraAresta.valor);
        }
        return custo;
    }
}