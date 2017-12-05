package sample;

/**
 * Created by Rosbin on 04/12/2017.
 */
public class MetodosArbol {
    int mayor=0;
    int menor = 9999;

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

}
