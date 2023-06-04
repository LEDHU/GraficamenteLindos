import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Grafo {
    //Atributos
    public List<String> vertices;
    public List<Aresta> arestas;

    //Construtor
    public Grafo() {
        this.vertices = new ArrayList<>();
        this.arestas = new ArrayList<>();
    }

    public void adicionarVertice(String vertice) {
        vertices.add(vertice);
    }

    public void adicionarAresta(String origem, String destino, int valor) {
        Aresta aresta = new Aresta(origem, destino, valor);
        arestas.add(aresta);
    }

    //Executa o algoritmo de Kruskal
    public List<Aresta> kruskal() {
        Collections.sort(arestas);

        Map<String, String> subconjuntos = new HashMap<>();
        for (String vertice : vertices) {
            subconjuntos.put(vertice, vertice);
        }

        List<Aresta> arvoreGeradoraMinima = new ArrayList<>();

        int numArestasArvore = 0;
        int indiceArestas = 0;

        while (numArestasArvore < vertices.size() - 1) {
            Aresta aresta = arestas.get(indiceArestas);
            indiceArestas++;

            String origem = encontrar(subconjuntos, aresta.origem);
            String destino = encontrar(subconjuntos, aresta.destino);

            if (!origem.equals(destino)) {
                numArestasArvore++;
                arvoreGeradoraMinima.add(aresta);
                unir(subconjuntos, origem, destino);
            }
        }

        return arvoreGeradoraMinima;
    }

    private String encontrar(Map<String, String> subconjuntos, String vertice) {
        String pai = subconjuntos.get(vertice);
        if (!pai.equals(vertice)) {
            pai = encontrar(subconjuntos, pai);
            subconjuntos.put(vertice, pai);
        }
        return pai;
    }

    private void unir(Map<String, String> subconjuntos, String x, String y) {
        String raizX = encontrar(subconjuntos, x);
        String raizY = encontrar(subconjuntos, y);
        subconjuntos.put(raizX, raizY);
    }
}