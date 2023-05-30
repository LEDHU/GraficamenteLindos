
//Classe Main
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        grafo.adicionarVertice("Recife");
        grafo.adicionarVertice("Foz do Iguaçu");
        grafo.adicionarVertice("Puerto Iguazú");
        grafo.adicionarVertice("Ciudad del Este");
        grafo.adicionarVertice("Itaipu Binacional");
        grafo.adicionarVertice("Marco das Três Fronteiras");

        grafo.adicionarAresta("Recife", "Foz do Iguaçu", 10, 120);
        grafo.adicionarAresta("Recife", "Puerto Iguazú", 15, 230);
        grafo.adicionarAresta("Foz do Iguaçu", "Puerto Iguazú", 12, 180);
        grafo.adicionarAresta("Foz do Iguaçu", "Ciudad del Este", 25, 360);
        grafo.adicionarAresta("Puerto Iguazú", "Ciudad del Este", 20, 300);
        grafo.adicionarAresta("Ciudad del Este", "Itaipu Binacional", 18, 260);
        grafo.adicionarAresta("Ciudad del Este", "Marco das Três Fronteiras", 22, 410);
        grafo.adicionarAresta("Itaipu Binacional", "Marco das Três Fronteiras", 8, 190);

        List<Aresta> arvoreGeradoraMinima = grafo.kruskal();

        System.out.println("Melhor roteiro:");
        for (Aresta aresta : arvoreGeradoraMinima) {
            System.out.println("Origem: " + aresta.origem);
            System.out.println("Destino: " + aresta.destino);
            System.out.println("Distância: " + aresta.km + " km");
            System.out.println("Custo: R$" + aresta.custo);
            System.out.println("Peso da aresta: " + aresta.valor);
            System.out.println("----------------------------------");
        }
    }
}