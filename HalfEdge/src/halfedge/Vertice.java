package halfedge;

import javafx.geometry.Point3D;

public class Vertice {
    
    private HE_aresta he_aresta;
    private Point3D coordenada;
    private String nome;

    public Vertice(HE_aresta he_aresta, Point3D coordenada, String nome) {
        this.he_aresta = he_aresta;
        this.coordenada = coordenada;
        this.nome = nome;
    }

    public HE_aresta getHe_aresta() {
        return he_aresta;
    }

    public void setHe_aresta(HE_aresta he_aresta) {
        this.he_aresta = he_aresta;
    }

    public Point3D getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Point3D coordenada) {
        this.coordenada = coordenada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
