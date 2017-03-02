package wingededge;

public class WE_Aresta {
    
    // São os dois vértices unidos pela aresta  "Ex: O--------O"
    private WE_Vertice primeiro, ultimo ;
    // São as faces que abrangem a Aresta
    private WE_Face face_direita, face_esquerda;

    private WE_Aresta p_predecessor, p_sucessor;
    private WE_Aresta u_predecessor, u_sucessor;
    
    private String nome;

    public WE_Aresta(String nome) {
        this.primeiro = null;
        this.ultimo = null;
        this.face_direita = null;
        this.face_esquerda = null;
        this.p_predecessor = null;
        this.p_sucessor = null;
        this.u_predecessor = null;
        this.u_sucessor = null;
        this.nome = nome;
    }
    
    public void inserir(){
        primeiro = new WE_Vertice("a_primeiro");
        ultimo = new WE_Vertice("a_ultimo");
        
        primeiro.arestas.add(this);
        ultimo.arestas.add(this);
        
        face_direita = new WE_Face("a_face_1");
        face_esquerda =  new WE_Face("a_face_2");
        
        face_direita.arestas.add(this);
        face_esquerda.arestas.add(this);
        
        p_predecessor = new WE_Aresta("Primeiro_predecessor");
        p_predecessor.face_direita = new WE_Face(this.face_direita.getNome());
        ultimo.arestas.add(p_predecessor);
        
        p_sucessor = new WE_Aresta("Primeiro_sucessor");
        p_sucessor.face_esquerda = new WE_Face(this.face_esquerda.getNome());
        primeiro.arestas.add(p_sucessor);
        
        u_predecessor = new WE_Aresta("Ultimo_prdecessor");
        u_predecessor.face_esquerda = new WE_Face(this.face_esquerda.getNome());
        ultimo.arestas.add(u_predecessor);
        
        u_sucessor = new WE_Aresta("Ultimo sucessor");
        u_sucessor.face_direita = new WE_Face(this.face_direita.getNome());
        primeiro.arestas.add(u_sucessor);
    }
    
  
    public WE_Vertice getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(WE_Vertice primeiro) {
        this.primeiro = primeiro;
    }

    public WE_Vertice getUltimo() {
        return ultimo;
    }

    public void setUltimo(WE_Vertice ultimo) {
        this.ultimo = ultimo;
    }

    public WE_Face getFace_direita() {
        return face_direita;
    }

    public void setFace_direita(WE_Face face_direita) {
        this.face_direita = face_direita;
    }

    public WE_Face getFace_esquerda() {
        return face_esquerda;
    }

    public void setFace_esquerda(WE_Face face_esquerda) {
        this.face_esquerda = face_esquerda;
    }

    public WE_Aresta getP_predecessor() {
        return p_predecessor;
    }

    public void setP_predecessor(WE_Aresta p_predecessor) {
        this.p_predecessor = p_predecessor;
    }

    public WE_Aresta getP_sucessor() {
        return p_sucessor;
    }

    public void setP_sucessor(WE_Aresta p_sucessor) {
        this.p_sucessor = p_sucessor;
    }

    public WE_Aresta getU_predecessor() {
        return u_predecessor;
    }

    public void setU_predecessor(WE_Aresta u_predecessor) {
        this.u_predecessor = u_predecessor;
    }

    public WE_Aresta getU_sucessor() {
        return u_sucessor;
    }

    public void setU_sucessor(WE_Aresta u_sucessor) {
        this.u_sucessor = u_sucessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
