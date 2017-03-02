package wingededge;

public class WingedEdge {

    public static void main(String[] args) {
        
        WE_Aresta a = new  WE_Aresta("A");
        a.inserir();
        
        System.out.println(a.getNome() + " - " + a.getPrimeiro().getNome() + " - " + a.getUltimo().getNome() 
        + "\n - " + a.getFace_direita().getNome() + " - " + a.getFace_esquerda().getNome()
        + "\n - " + a.getP_predecessor().getNome() + " - " + a.getP_sucessor().getNome()
        + "\n - " + a.getU_predecessor().getNome() + " - " + a.getU_sucessor().getNome());
    }
}
