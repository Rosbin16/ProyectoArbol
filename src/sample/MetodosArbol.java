package sample;

/**
 * Created by Rosbin on 04/12/2017.
 */
public class MetodosArbol {
    int mayor=0;
    int menor = 9999;
    boolean encontrado = false;
    String mensaje = "";

    public void mensaje (){
        mensaje="";
    }

    public String mayor(Nodo raiz){
        if(raiz != null){
            if (mayor < raiz.getDato()){
                mayor = raiz.getDato();
            }
            mayor(raiz.getNodoIzquierdo());
            mayor(raiz.getNodoDerecho());
        }
        return "El valor MAYOR es: "+ mayor;
    }

    public String menor(Nodo raiz){
        if(raiz != null){
            if (menor > raiz.getDato()){
                menor = raiz.getDato();
            }
            menor(raiz.getNodoIzquierdo());
            menor(raiz.getNodoDerecho());
        }
        return "El valor MENOR es: "+ menor;
    }
    public String buscar(Nodo raiz, int r){
        if(raiz != null){
            if (raiz.getDato()==r){
                encontrado = true;
                mensaje = r + " Encontrado en el arbol";
            }
            buscar(raiz.getNodoIzquierdo(),r);
            buscar(raiz.getNodoDerecho(),r);
        }
        if (encontrado == false){
            mensaje = r + " NO encontrado";
        }
        return mensaje;
    }
}
