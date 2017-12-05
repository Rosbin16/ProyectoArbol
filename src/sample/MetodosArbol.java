package sample;

/**
 * Created by Rosbin on 04/12/2017.
 */
public class MetodosArbol {

        private int tamaño=0;
      
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
        public String tamaño (Nodo raiz){
            if(raiz != null){
                tamaño++;
                tamaño(raiz.getNodoIzquierdo());
                tamaño(raiz.getNodoDerecho());
            }
            return "El tamaño de nodos es : "+ tamaño;
        }


    }
