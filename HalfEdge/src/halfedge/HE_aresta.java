package halfedge;

import java.awt.Point;
import javafx.geometry.Point3D;

public class HE_aresta {
    
    private Vertice vertice_origem;
    private HE_aresta he_oposta;
    private HE_aresta he_seguinte;
    private Face face;
    private String nome;

    public HE_aresta() {
        vertice_origem = null;
        he_oposta = null;
        he_seguinte = null;
        face = null;
        nome = null;
    }

    public Vertice getVertice_origem() {
        return vertice_origem;
    }

    public void setVertice_origem(Vertice vertice_origem) {
        this.vertice_origem = vertice_origem;
    }

    public HE_aresta getHe_oposta() {
        return he_oposta;
    }

    public void setHe_oposta(HE_aresta he_oposta) {
        this.he_oposta = he_oposta;
    }

    public HE_aresta getHe_seguinte() {
        return he_seguinte;
    }

    public void setHe_seguinte(HE_aresta he_seguinte) {
        this.he_seguinte = he_seguinte;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    public void inserirHE(String nome){
        Point3D coodenada = new Point3D(10, 10, 10);
        vertice_origem = new Vertice(this,coodenada,"v_origem");
        
        he_oposta = new HE_aresta();
        he_seguinte = new HE_aresta();
        
        face = new Face(this, "face");
        
        this.nome = nome;
    }
    
}

