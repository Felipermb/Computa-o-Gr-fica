package halfedge;
public class HalfEdge {

    public static void main(String[] args) {
        
        HE_aresta a = new HE_aresta();
        
        a.inserirHE("HalfEdge1");
        
        System.out.println(a.getNome() + " - " + a.getFace().getNome()
        + "\n - " + a.getHe_oposta().getNome() + " - " + a.getHe_seguinte().getNome()
        + "\n - " + a.getVertice_origem().getCoordenada().toString());
    }
}
