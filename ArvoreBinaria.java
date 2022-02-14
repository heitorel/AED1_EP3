package ep_aed1;

class Node {
	  public long item;
	  public Node dir;
	  public Node esq;
}

public class ArvoreBinaria {
	  private Node raiz; 

	  public ArvoreBinaria() { raiz=null; }

	  public void insert(long v) {
	    Node Nodevo = new Node();
	    Nodevo.item = v;
	    Nodevo.dir = null;
	    Nodevo.esq = null;

	    if (raiz == null) raiz = Nodevo;
	    else  {
	      Node atual = raiz;
	      Node anterior;
	      while(true) {
	        anterior = atual;
	        if (v <= atual.item) {
	          atual = atual.esq;
	          if (atual == null) {
	            anterior.esq = Nodevo;
	            return;
	          } 
	        }
	        else {
	           atual = atual.dir;
	           if (atual == null) {
	             anterior.dir = Nodevo;
	             return;
	           }
	        }
	      }
	    } 
	  }
	  
	  public boolean findNode(long chave) {
		  Node aux = find(chave);
		  if(aux!=null && aux.item == chave) {
			  return true;
		  }
		  return false;
	  }

	  public Node find(long chave) {
	    if (raiz == null) return null;
	    Node atual = raiz;
	    while (atual.item != chave) {
	      if(chave < atual.item ) atual = atual.esq;
	      else atual = atual.dir;
	      if (atual == null) return null;
	    }
	    return atual; 
	  }
}