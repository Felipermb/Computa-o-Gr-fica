package wingededge;

import java.util.ArrayList;

public class WE_Face {
   
    public ArrayList<WE_Aresta> arestas;
    private String nome;

    public WE_Face(String nome) {
        this.arestas = new ArrayList<>();
        this.nome = nome;
    }

    public ArrayList<WE_Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<WE_Aresta> arestas) {
        this.arestas = arestas;
    }

    public void addArestas(WE_Aresta aresta){
        this.arestas.add(aresta);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
