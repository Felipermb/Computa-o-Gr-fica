package halfedge;

public class Face {
    
    private HE_aresta he_aresta;
    private String nome;

    public Face(HE_aresta he_aresta, String nome) {
        this.he_aresta = he_aresta;
        this.nome = nome;
    }

    public HE_aresta getHe_aresta() {
        return he_aresta;
    }

    public void setHe_aresta(HE_aresta he_aresta) {
        this.he_aresta = he_aresta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
