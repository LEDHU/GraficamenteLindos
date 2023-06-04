
//Classe Main
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();

        //Vertices existentes
        grafo.adicionarVertice("Hotel");
        grafo.adicionarVertice("Aeroporto");
        grafo.adicionarVertice("Parque Nacional do Iguaçu");
        grafo.adicionarVertice("Parque Iguazú");
        grafo.adicionarVertice("Marco 3 fronteiras");
        grafo.adicionarVertice("Parque Aventura Monday");
        grafo.adicionarVertice("Cidade do Leste");
        grafo.adicionarVertice("Templo Budita Chen Tien");
        grafo.adicionarVertice("Itaipú Binacional");

        
        //Vertice: Hotel
        grafo.adicionarAresta("Hotel", "Hotel", 0);
        grafo.adicionarAresta("Hotel", "Aeroporto", 24);
        grafo.adicionarAresta("Hotel", "Parque Nacional do Iguaçu", 26);
        grafo.adicionarAresta("Hotel", "Parque Iguazú", 52);
        grafo.adicionarAresta("Hotel", "Marco 3 fronteiras", 104);
        grafo.adicionarAresta("Hotel", "Parque Aventura Monday", 123);
        grafo.adicionarAresta("Hotel", "Cidade do Leste", 36);
        grafo.adicionarAresta("Hotel", "Templo Budita Chen Tien", 28);
        grafo.adicionarAresta("Hotel", "Itaipú Binacional", 133);

        //Vertice: Aeroporto
        grafo.adicionarAresta("Aeroporto", "Hotel", 24);
        grafo.adicionarAresta("Aeroporto", "Aeroporto", 0);
        grafo.adicionarAresta("Aeroporto", "Parque Nacional do Iguaçu", 150);
        grafo.adicionarAresta("Aeroporto", "Parque Iguazú", 269);
        grafo.adicionarAresta("Aeroporto", "Marco 3 fronteiras", 115);
        grafo.adicionarAresta("Aeroporto", "Parque Aventura Monday", 146);
        grafo.adicionarAresta("Aeroporto", "Cidade do Leste", 55);
        grafo.adicionarAresta("Aeroporto", "Templo Budita Chen Tien", 47);
        grafo.adicionarAresta("Aeroporto", "Itaipú Binacional", 153);

        //Vertice: Parque Nacional do Iguaçu
        grafo.adicionarAresta("Parque Nacional do Iguaçu", "Hotel", 26);
        grafo.adicionarAresta("Parque Nacional do Iguaçu", "Aeroporto", 150);
        grafo.adicionarAresta("Parque Nacional do Iguaçu", "Parque Nacional do Iguaçu", 0);
        grafo.adicionarAresta("Parque Nacional do Iguaçu", "Parque Iguazú", 273);
        grafo.adicionarAresta("Parque Nacional do Iguaçu", "Marco 3 fronteiras", 129);
        grafo.adicionarAresta("Parque Nacional do Iguaçu", "Parque Aventura Monday", 150);
        grafo.adicionarAresta("Parque Nacional do Iguaçu", "Cidade do Leste", 62);
        grafo.adicionarAresta("Parque Nacional do Iguaçu", "Templo Budita Chen Tien", 52);
        grafo.adicionarAresta("Parque Nacional do Iguaçu", "Itaipú Binacional", 156);

        //Vertice: Parque Iguazú
        grafo.adicionarAresta("Parque Iguazú", "Hotel", 52);
        grafo.adicionarAresta("Parque Iguazú", "Aeroporto", 269);
        grafo.adicionarAresta("Parque Iguazú", "Parque Nacional do Iguaçu", 273);
        grafo.adicionarAresta("Parque Iguazú", "Parque Iguazú", 0);
        grafo.adicionarAresta("Parque Iguazú", "Marco 3 fronteiras", 137);
        grafo.adicionarAresta("Parque Iguazú", "Parque Aventura Monday", 179);
        grafo.adicionarAresta("Parque Iguazú", "Cidade do Leste", 85);
        grafo.adicionarAresta("Parque Iguazú", "Templo Budita Chen Tien", 72);
        grafo.adicionarAresta("Parque Iguazú", "Itaipú Binacional", 176);

        //Vertice: Marco 3 fronteiras
        grafo.adicionarAresta("Marco 3 fronteiras", "Hotel", 104);
        grafo.adicionarAresta("Marco 3 fronteiras", "Aeroporto", 129);
        grafo.adicionarAresta("Marco 3 fronteiras", "Parque Nacional do Iguaçu", 129);
        grafo.adicionarAresta("Marco 3 fronteiras", "Parque Iguazú", 137);
        grafo.adicionarAresta("Marco 3 fronteiras", "Marco 3 fronteiras", 0);
        grafo.adicionarAresta("Marco 3 fronteiras", "Parque Aventura Monday", 119);
        grafo.adicionarAresta("Marco 3 fronteiras", "Cidade do Leste", 38);
        grafo.adicionarAresta("Marco 3 fronteiras", "Templo Budita Chen Tien", 34);
        grafo.adicionarAresta("Marco 3 fronteiras", "Itaipú Binacional", 137);

        //Vertice: Parque Aventura Monday
        grafo.adicionarAresta("Parque Aventura Monday", "Hotel", 123);
        grafo.adicionarAresta("Parque Aventura Monday", "Aeroporto", 146);
        grafo.adicionarAresta("Parque Aventura Monday", "Parque Nacional do Iguaçu", 150);
        grafo.adicionarAresta("Parque Aventura Monday", "Parque Iguazú", 179);
        grafo.adicionarAresta("Parque Aventura Monday", "Marco 3 fronteiras", 119);
        grafo.adicionarAresta("Parque Aventura Monday", "Parque Aventura Monday", 0);
        grafo.adicionarAresta("Parque Aventura Monday", "Cidade do Leste", 20);
        grafo.adicionarAresta("Parque Aventura Monday", "Templo Budita Chen Tien", 34);
        grafo.adicionarAresta("Parque Aventura Monday", "Itaipú Binacional", 139);

        //Vertice: Cidade do Leste
        grafo.adicionarAresta("Cidade do Leste", "Hotel", 36);
        grafo.adicionarAresta("Cidade do Leste", "Aeroporto", 55);
        grafo.adicionarAresta("Cidade do Leste", "Parque Nacional do Iguaçu", 62);
        grafo.adicionarAresta("Cidade do Leste", "Parque Iguazú", 85);
        grafo.adicionarAresta("Cidade do Leste", "Marco 3 fronteiras", 38);
        grafo.adicionarAresta("Cidade do Leste", "Parque Aventura Monday", 20);
        grafo.adicionarAresta("Cidade do Leste", "Cidade do Leste", 0);
        grafo.adicionarAresta("Cidade do Leste", "Templo Budita Chen Tien", 31);
        grafo.adicionarAresta("Cidade do Leste", "Itaipú Binacional", 136);

        //Vertice: Templo Budita Chen Tien
        grafo.adicionarAresta("Templo Budita Chen Tien", "Hotel", 28);
        grafo.adicionarAresta("Templo Budita Chen Tien", "Aeroporto", 47);
        grafo.adicionarAresta("Templo Budita Chen Tien", "Parque Nacional do Iguaçu", 52);
        grafo.adicionarAresta("Templo Budita Chen Tien", "Parque Iguazú", 72);
        grafo.adicionarAresta("Templo Budita Chen Tien", "Marco 3 fronteiras", 34);
        grafo.adicionarAresta("Templo Budita Chen Tien", "Parque Aventura Monday", 34);
        grafo.adicionarAresta("Templo Budita Chen Tien", "Cidade do Leste", 31);
        grafo.adicionarAresta("Templo Budita Chen Tien", "Templo Budita Chen Tien", 0);
        grafo.adicionarAresta("Templo Budita Chen Tien", "Itaipú Binacional", 111);

        //Vertice: Itaipú Binacional
        grafo.adicionarAresta("Itaipú Binacional", "Hotel", 133);
        grafo.adicionarAresta("Itaipú Binacional", "Aeroporto", 153);
        grafo.adicionarAresta("Itaipú Binacional", "Parque Nacional do Iguaçu", 156);
        grafo.adicionarAresta("Itaipú Binacional", "Parque Iguazú", 176);
        grafo.adicionarAresta("Itaipú Binacional", "Marco 3 fronteiras", 137);
        grafo.adicionarAresta("Itaipú Binacional", "Parque Aventura Monday", 139);
        grafo.adicionarAresta("Itaipú Binacional", "Cidade do Leste", 136);
        grafo.adicionarAresta("Itaipú Binacional", "Templo Budita Chen Tien", 111);
        grafo.adicionarAresta("Itaipú Binacional", "Itaipú Binacional", 0);


        List<Aresta> arvoreGeradoraMinima = grafo.kruskal();

        System.out.println("Melhor roteiro:");
        for (Aresta aresta : arvoreGeradoraMinima) {
            System.out.println("Origem: " + aresta.origem);
            System.out.println("Destino: " + aresta.destino);
            System.out.println("Peso da aresta: " + aresta.valor);
            System.out.println("----------------------------------");
        }
    }
}