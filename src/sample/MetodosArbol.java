package sample;

/**
 * Created by Rosbin on 04/12/2017.
 */
public class MetodosArbol {
    public class MetodosArbol {
        private int tamaño=0;
        int mayor=0;
        int menor = 9999;
        boolean encontrado = false;
        String mensaje = "";

        public void mensaje (){
            mensaje="";
        }


        public String preOrden (Nodo raiz){
            if(raiz != null){
                mensaje =mensaje+ raiz.getDato() + " - ";
                preOrden(raiz.getNodoIzquierdo());
                preOrden(raiz.getNodoDerecho());
            }
            return mensaje;
        }

        public String inOrden (Nodo raiz){
            if(raiz != null){
                inOrden(raiz.getNodoIzquierdo());
                mensaje = mensaje + raiz.getDato() + " - ";
                inOrden(raiz.getNodoDerecho());
            }
            return mensaje;
        }

        public String postOrden (Nodo raiz){
            if(raiz != null){
                postOrden(raiz.getNodoIzquierdo());
                postOrden(raiz.getNodoDerecho());
                mensaje = mensaje + raiz.getDato()+ " - ";
            }
            return mensaje;
        }

        
    }
