package wingededge;

import java.util.ArrayList;

public class WE_Vertice {
    
    public ArrayList<WE_Aresta> arestas;
    private String nome;

    public WE_Vertice(String nome) {
        this.nome = nome;
        arestas = new ArrayList<>();
    }

    public ArrayList<WE_Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<WE_Aresta> arestas) {
        this.arestas = arestas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
